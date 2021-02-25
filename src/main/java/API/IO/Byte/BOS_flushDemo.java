package API.IO.Byte;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
使用缓冲输出流写出数据的缓冲区问题
 */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("box.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String line="客官不可以，你靠得越来越近，你眼睛看在哪里，还装的那么深情";
        byte[]data=line.getBytes("UTF-8");
        bos.write(data);
        /*
        void flush()
        将文件从流已经缓冲的数据一次性写出
        频繁的调用flush会增加十几写出数据的次数，写出次数多则写效率差
        但是可以提高写出数据的即时性
         */
        bos.flush();
        System.out.println("写出完毕");
        /**
         * 缓冲流的close方法中只会执行一次flush
         */
        bos.close();

    }
}
