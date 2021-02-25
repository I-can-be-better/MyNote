package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
通过提高每次读写的数据量减少实际读写的次数可以提高读写效率
单字节读写是随机读写
一组字节读写是块读写
对于机械硬盘而言,单字节读写几乎没有效率可言,块读写效率很好
对大部分硬件而言,减少硬件调用次数都可以提高效率
 */
public class copyDemo1 {
    public static void main(String[]args) throws IOException {
        RandomAccessFile src=new RandomAccessFile(
                "ylj.mp4","r"
        );
        RandomAccessFile decs=new RandomAccessFile(
                "ylj._cp.mp4","rw"
        );
        /*
        RAF提供的的块读写方法:
        块读:
        int read(byte[] data)
        一次性从文件中给定的字节数组data总长度的字节量并将

        重载
        void write(byte[]data, int offset,int len);
        从指定的offset位置开始的连续len个字节,写入文件

        读取到的字节顺序的存入到该数组中,返回值为实际读取到的字节量.如果返回值为-1,
        则表示读取到了文件末尾
         */

        String a="00000000 00000000 00000000 00001111 00001010 00010001";
        //文件数据:

        /*块读操作:
        byte[] data=new byte[6];//6个字节的数组
        data:[00000000, 00000000, 00000000, 00001111, 00001010, 00010001]
        int len=raf.read(data);
        data=[11011010 00110101 01110101 11011101 01100010 00000000]
        len=5//read方法返回值为5,说明本次实际只读取到了5个字节
        与单字节读取的区别:
        int len=raf.read();//读取一个字节,返回值就是实际读取的字节数据
        d:0000000 00000000 00000000 11011010//该字节放在低八位上
        */

        int len;//记录每次块数据后,实际读取到的字节数

        /*
        00000000 8位2进制 1byte  1字节
        1024byte  1kb
        1024kb    1mb
        1024mb  1gb
        1024gb   1tb
         */

        byte[]data=new byte[1024*10];//10kb
        long start=System.currentTimeMillis();
        while((len=src.read(data))!=-1) {//读10kb
            decs.write(data,0,len);//写了多少字节就写多少个字节
        }
        Long end=System.currentTimeMillis();
        System.out.println("复制完毕!耗时"+(end-start)+"ms");
        src.close();
        decs.close();
    }
}
