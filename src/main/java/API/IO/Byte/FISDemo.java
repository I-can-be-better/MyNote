package API.IO.Byte;

import java.io.FileInputStream;
import java.io.IOException;

/*
使用文件流输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");

        byte[]data=new byte[1000];
        int len=fis.read(data);
        System.out.println("实际读取了"+len+"字节");

        String line=new String (data,0,len,"UTF-8");
        System.out.println(line);
        System.out.println(line.length());

        fis.close();
    }
}
