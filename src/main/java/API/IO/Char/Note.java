package API.IO.Char;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本功能
 * 程序启动后要求用户输入文件名,然后对文件进行操作
 * 之后用户输入的每一行字符串都要按行写到文件中
 * 当用户单独输入exit时退出
 *
 * 要求:创建printwrite并且自行创建流连接完成
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("欢迎使用简易记事本!");
        System.out.println("请输入文件名:");
        Scanner scan=new Scanner(System.in);
        String filename=scan.nextLine();
        FileOutputStream fos=new FileOutputStream(filename);
        OutputStreamWriter ios=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bos=new BufferedWriter(ios);
        /*
        当创建PW时第一个参数为流时,可以在传入一个Boolean型的参数
        如果这个值为true,着当前PW具有自动行刷新功能.即:
        每当我们调用println方法后会自动flush
         */
        PrintWriter pw=new PrintWriter(bos,true);
        System.out.println("请开始输入内容,单独输入exit退出");
        while(true) {
            String line=scan.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            pw.println(line);
            /*pw.flush();*/ //不常用
        }
        System.out.println("再见!");
        pw.close();
    }
}
