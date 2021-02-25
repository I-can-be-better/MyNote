package API.ChatSocket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * 聊天客户端
 */
public class Server {
    private ServerSocket serversocket;

    /*
    java.net.ServerSocket
    ServerSocket是运行在服务端的.它有两个作用:
    1.向系统申请并打开服务端口,客户端可以通过这个端口与服务端建立连接
    2.监听服务端口,一单一个客户端通过该端口与服务端建立连接着会创建一个socket,通过它与客户端
    进行交互

    如果我们把socket比喻为电话,那么serversocket具相当于总机
     */

    private ServerSocket serverSocket;

    //用来保存所有客户端输出流的数组,用于让ClientHandler之间共享输出流广播消息使用
   // private PrintWriter[]allOut={};
    //ArrayList并不是并发安全的
   // private Collection<PrintWriter> allOut=new ArrayList<>();
    //基于ArrayList创建一个并发安全的集合存放所有输出流
    private List<PrintWriter> allOut= Collections.synchronizedList(new ArrayList<>());

    public Server() {
        try {
            /*
            实例化serversocket是要指定服务端窗口,如果该窗口已经被系统其他应用使用时
            会抛出异常:Java.net.BindException:adress already in use
            此时需要更换一个端口再尝试启动,或者将占用该端口的程序关闭在尝试
             */
            System.out.println("正在启动服务端....");
            serversocket = new ServerSocket(8088);
            System.out.println("启动服务端完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
           /*
           serversocket提供的方法:
           Socket accept()
           该方法是一个阻塞方法,调用后程序就"卡住"了,此刻开始等待客户端的连接,一但一个客户端建立连接,
           此时accept方法就会立即返回一个socket实例,通过这个socket就可以与连接的客户端进行交互了
            */
            while (true) {
                System.out.println("等待客户端连接");
                Socket socket = serversocket.accept();
                System.out.println("一个客户端连接了");
                //启动一个线程处理与该客户端的交互
                Runnable handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;//当前客户端的ip地址信息
        public ClientHandler(Socket socket){
            this.socket=socket;
            //通过socket获取远程计算机地址信息
            host=socket.getInetAddress().getHostAddress();
        }
        public void run() {
            PrintWriter pw=null;
            try {
                 /*
           socket提供的方法
           InputStream getInputStream()
           通过socket获取的输入流可以读取远程计算机发送过来的数据
            */
          /* InputStream in=new socket.getInputStream();
           InputStreamReader isr=new InputStreamReader(
                   in,"UTF-8");
           BufferedReader br=new BufferedReader(isr);*/

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), "UTF-8"
                        )
                );
                //通过socket获取输出流用于给客户端发送消息
                pw=new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(),"UTF-8"
                            )
                    ),true
                );

                /*synchronized(ClientHandler.class) {
                    *//*将当前对应客户端的输出流存入到共享数组allOut
                    括号里不能用this,每个线程都运行自己的ClientHandler,this就是这些ClientHandler
                    synchronized(this){
                    括号里不能用扩容数组操作,allOut对象指向的数组对象在变化
                    synchronized(this){

                    synchronized(serverSockete){
                    synchronized(Server.class){
                    以上两种可以
                    *//*

                    allOut.add(pw);//如果当前集合是并发安全的集合,则不需要同步块控制了


                    1.先对allOut进行扩容
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    2.将当前pw存入数组最后一个位置
                    allOut[allOut.size()- 1] = pw;
                }*/
                //System.out.println("一个host上线了!当前在线人数:"+length);
                allOut.add(pw);
                System.out.println("一个host上线了!当前在线人数:"+allOut.size());

                String line;
                while ((line = br.readLine()) != null) {
                    String message=line;
                    System.out.println(host+"说:" + line);
                   /* synchronized(ClientHandler.class) {
                        for(PrintWriter o:allOut){
                            o.println(host + "说:" + line);
                        }
                        *//*for (int i = 0; i < allOut.size(); i++) {
                            allOut[i].println(host + "说:" + line);
                        }*//*
                    }*/
                    //使用并发安全的前提下,遍历要采取foreach方法
                    allOut.forEach(o->o.println(host+"说"+message));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                //处理该客户端断开连接后的操作
                //将对应当欠客户的输出流将共享allOut中删除
               /* synchronized (ClientHandler.class){
                    for(int i=0;i<allOut.size();i++) {
                        allOut.remove(pw);
                        *//*
                        if (pw == allOut[i]) {
                            allOut[i] = allOut[allOut.size() - 1];
                            allOut = Arrays.copyOf(allOut, allOut.size() - 1);
                            break;
                        }
                        *//*
                    }
                    }*/
                allOut.remove(pw);
                }
                System.out.println("一个host下线了!当前在线人数:"+allOut.size());
                try{
                    //最终不再关闭socket
                    //socket关闭后,通过socket输入的输入流与输出流就自动关闭
                    socket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

