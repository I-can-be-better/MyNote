package API.raf;


import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名,然后对该文件进行写操作
 * 之后用户在控制台输入的每一行字符串都写入到该文件中(不用考虑换行问题)
 * 当用户单独输入"exit"时程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {

        System.out.println("欢迎使用简易记事本!");
        System.out.println("请输入文件名:");
        Scanner scan=new Scanner(System.in);
        String filename=scan.nextLine();
        RandomAccessFile src=new RandomAccessFile("filename.txt","rw");
        System.out.println("请开始输入内容,开始单独输入exit退出");
        while(true){
            String line=scan.nextLine();
            if("exit".equals(line)){//当时用equals时,应把不变量放在前
                break;
            }
            byte[]data=line.getBytes("UTF-8");
            src.write(data);
        }
        src.close();
        System.out.println("再见!");


    }
}
