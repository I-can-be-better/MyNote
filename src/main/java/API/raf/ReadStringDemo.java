package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("Note.txt","r");
        byte[]data=new byte[(int)src.length()];
        src.read(data);//一次性将文件中所有字节读入数据
        //String的构造方法允许将给定的字节数组内容按照指定字符还原
        String line=new String(data,"UTF-8");
        System.out.println(line);
        src.close();
    }
}
