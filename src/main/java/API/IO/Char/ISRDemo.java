package API.IO.Char;

import java.io.*;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        //将osw.txt文件中的字符串读取回来
        FileInputStream fis=new FileInputStream("osw.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
       /* int d=isr.read();//实际上返回的是一个char
        System.out.println((char)d);*/
        int d;
        /*
        int read()
        字符流的read方法是读取一个字符,返回的是一个char
        但实际上是用int型返回,因此该int值对应的2进制是低16位有效
        如果int返回值为-1,则表示文件末尾
         */
        while ((d=isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
