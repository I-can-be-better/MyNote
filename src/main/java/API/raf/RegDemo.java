package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后要求用户顺序输入用户名,密码,昵称和年龄
 * 然后将该记录写入文件user.dat中保存
 *
 * 每条记录占有固定的100字节,其中用户名,密码,昵称为字符串,各占32个字节
 * 年龄占4个字节
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("欢迎注册");
        System.out.println("请输入用户名:");
        String username=scan.nextLine();
        System.out.println("请输入密码:");
        String password=scan.nextLine();
        System.out.println("请输入昵称:");
        String nickname=scan.nextLine();
        System.out.println("请输入年龄:");
        int age=scan.nextInt();

        RandomAccessFile raf=new RandomAccessFile("./user.dat","rw");
        raf.seek(raf.length());//将指针调至最后,方便后面的输入

        //写用户名
        byte[]data=username.getBytes("UTF-8");
        data= Arrays.copyOf(data,32);
        raf.write(data);

        //写密码
        data=password.getBytes("UTF-8");
        data=Arrays.copyOf(data,32);
        raf.write(data);

        //写昵称
        data=nickname.getBytes("UTF-8");
        data=Arrays.copyOf(data,32);
        raf.write(data);

        //写年龄
        raf.writeInt(age);
        System.out.println("注册完毕!");

        raf.close();


    }
}
