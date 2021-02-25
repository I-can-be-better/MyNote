package API.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
    RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
    /*
    常见的支持中文的字符集:
    GBK:国际编码,其中英文是1字符,所有中文是2字符
    UTF-8:万国码,其中英文码1一个字节,中文3个字节
     */
        String str="有天我睡醒看到我的身边没有你,";
        /*
        String 提供的方法
        byte[] getByte(String csn)
        将当前字符串内容按照指定的字符及转换为一组字节
        注:字符集名字大小无所谓,不要硬拼
        该方法要求必须处理:UnsupportedEncodingException异常
        当指定的字符集名字不对时会抛出该异常
         */
        byte[]data=str.getBytes("UTF-8");
        raf.write(data);

        str="在我的右边是你曾经最喜欢的玩具";
        data=str.getBytes("UTF-8");
        raf.write(data);
        System.out.println("写出完毕");
        raf.close();
    }
}
