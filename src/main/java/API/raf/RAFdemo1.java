package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * raf是专门用来读写文件的类,其基于只针对文件进行随机读写
 */
public class RAFdemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=
                new RandomAccessFile("raf.dat","r");
        /*
        raf.dat文件数据
        00000001 00000010
         */
        /*
        int read()
        从文件中读取一个字节,并以int型返回,实际读取的字节是在返回
        的int值对应的二进制的低八位上
        但返回值为-1,则表示文件末尾.EOF:end of file
         */
        //00000000 00000000 00000000 00000001
        int d=raf.read();//1
        System.out.println(d );
        d=raf.read();//3
        System.out.println(d);
        raf.close();

    }
}
