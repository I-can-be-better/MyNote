package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本数据类型,以及RAF指针的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile(
                "./raf.dat","rw");
        long pos=src.getFilePointer();
        //获取指针位置,默认为0
        System.out.println("pos:"+pos);
        /*
        向文件中写入一个int最大值
        int最大值的二进制;
        01111111 11111111 11111111 11111111
        imax>>>24
        00000000 00000000 00000000 01111111
        imax>>>16
        00000000 00000000 00000000 11111111
        imax>>>8
        00000000 00000000 00000000 11111111
        raf.dat文件数据
        01111111 11111111 11111111 11111111
         */
        int imax=Integer.MAX_VALUE;
        /*src.write(imax>>>24);
        src.write(imax>>>16);
        src.write(imax>>>8);
        src.write(imax);
        */
       src.writeInt(imax);//效果与上相同
        src.writeLong(imax);
        src.writeDouble(imax);
        System.out.println("pos:"+src.getFilePointer());

        System.out.println("写出完毕");

        src.seek(0);//拨回指针至默认位置
        System.out.println("pos:"+src.getFilePointer());
        int d=src.readInt();
        System.out.println(d);

        src.seek(4);
        System.out.println("pos:"+src.getFilePointer());
        long i=src.readLong();
        System.out.println(i);

        //修改raf.dat文件中long位置所在的值为456
        //1.将指针移动到long值的开始位置
        src.seek(4);
        //2.重新写入新的long来覆盖原有数据
        src.writeLong(456l);

        src.close();
    }
}
