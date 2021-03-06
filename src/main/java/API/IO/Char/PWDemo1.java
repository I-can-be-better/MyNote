package API.IO.Char;

import java.io.*;

/**
 * 使用留链接形式创建PW完成文本数据的写出操作
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    //向pw1.txt写入文本数据,低级流,用于将字节写入文
        FileOutputStream fos=new FileOutputStream("pw1.txt");
        /*
        高级流,转换流
        1.负责衔接字节符与字节流
        2.负责将写出的字符按照指定的字符集转换为字节
         */
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        //高级流.缓冲字符输出流.负责块些文本加速
        BufferedWriter bw=new BufferedWriter(osw);
        //高级流,pw负责按行写字符串,并自行判断行刷新
        PrintWriter pw=new PrintWriter(bw);
        pw.println("和我的朋友到成都的街头走一走,呕呕呕呕~");
        pw.println("直到所有的灯都熄灭了,也不停留.");
        System.out.println("写出完毕!");
        pw.close();
    }
}
