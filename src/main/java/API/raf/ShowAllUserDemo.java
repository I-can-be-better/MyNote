package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有用户信息取出来并输出到控制台
 */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("./user.dat","r");
        for(int i=0;i<raf.length()/100;i++){    //每一个用户输入便是100字节
          //读取用户名
          byte[] data=new byte[32];
          raf.read(data);
          String username=new String(data,"utf-8").trim();
          //读密码
            raf.read(data);
            String password=new String(data,"utf-8").trim();
            //读昵称
            raf.read(data);
            String nickname=new String(data,"utf-8").trim();
            //读年龄
            int age=raf.read(data);
            System.out.println(username+","+password+","+nickname+","+age);
        }
        raf.close();
    }
}
