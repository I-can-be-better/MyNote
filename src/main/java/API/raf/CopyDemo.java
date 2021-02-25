package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
文件复制:
复制原理:从源文件顺序读取每个字节并写入到另一个文件中
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new
                RandomAccessFile("git.jpg","r");
        RandomAccessFile des=new
                RandomAccessFile("git_cp.jpg","rw");
        int d;

        //获取当前系统时间的毫秒值
        long start=System.currentTimeMillis();
        while((d=src.read())!=-1){
            des.write(d);
        }
        System.out.println("复制完毕!");
        src.close();
        des.close();
    }
}
