package API.IO.Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 */
public class copydemo {
    public static void main(String[] args) throws IOException {
        /*
        1.创建文件输入流读取文件
        2.创建文件输出流写入复制文件
        3.循环块读写完成复制
        4.关闭两个流
         */
        FileInputStream fis=new FileInputStream("桌面3.jpg");
        FileOutputStream fos= new FileOutputStream("桌面3_cp.jpg");

        int len=-1;
        byte []data=new byte[1024*10];
        long start=System.currentTimeMillis();
        while((len=fis.read())!=-1) {
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("时长:"+(end-start));
        System.out.println("复制完毕!");
        fis.close();
        fos.close();

    }
}
