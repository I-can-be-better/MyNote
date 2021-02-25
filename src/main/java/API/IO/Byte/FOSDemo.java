package API.IO.Byte;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java标准的IO,可以用相同的读写方式读取不同的设备
 * JAVA将IO比喻做"流",可以理解为是连接程序和设备之间的通道
 * 关乎到里面是按照同一方向顺序流动的字节
 *
 * Java将刘分为两个操作
 * 输入:用来读写,是从设备到程序的方向,是获取的数据使用
 * 输出:用来写出,是从程序到设备的方向,是用来发送数据时用的
 *
 * Java.io.InputStream是所有字节输入流的超类,里面定义了读取字节的方法
 * Java.io.outputstream是所有字节输出流的超类,定义了写出字节的方法
 *
 * Java也将就分为两类:字节流和处理流
 * 字节流:也称为低级流,是实际连接程序与设备的管道,负责实际读取字节的流,读写一定是建立在节点流的基础上进行的.
 *      操作的不同的设备有对应的低级流.例如读写文件有文件流
 * 处理流:也成为高级流,不能独立存在,必须连接在其他流上,目的是当数据流经当前流时对齐没写加工处理,简化我们的操作
 *
 * 实际开发过程中我们总是会串联一组高级流最终串联到低级流上,在数据进行读写的过程中度数据做流水线式的加工处理,这也成为流连接
 * 也是io的精髓
 *
 * 文件流
 * 文件流是一对低级流,用于读写文件的流,功能上与Randomaccessfile一致
 * Java.io.FileInputStream和FileoutputStream
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
/*
文件输出流构造方法:
FileOutPutStream(String path)
FileOutPutStream(File file)
以上两种构造器创建的文件流为覆盖写模式
;即:创建文件流时如果指定的文件已经存在,会将该内容清空
然后使用这个流写出的数据会顺序写入文件作为新数据保存
注:RAF则是从头开始写多少就覆盖多少(在不操作指针的情况下)

文件流重载的方法:
Fileoutputstream(stringpath,boolean append)
Fileoutputstream(File file,boolean append)
如果第二个参数指定,并且制定的值为true,则文件流为
追加模式,即:创建文件流时如果文件存在,那么原有数据保留
通过这个流写入的数据都会被追加到文件中
*/
        FileOutputStream fos=new FileOutputStream(
                "fos.txt",true
        );
       String line="我可以接受你的所有,所有小脾气";
        byte[]data=line.getBytes("UTF-8");
        fos.write(data);

        line="我可以带你去吃很多,很多好东西.";
        fos.write(line.getBytes("utf-8"));
        fos.write("我可以偶尔给你带来,带来小甜蜜".getBytes("UTF-8"));
        fos.write("缝纫机乐队,奥利给".getBytes("UTF-8"));
        /*
        文件流在操作上没有Randomaccessfile灵活,但是流能做一些它做不了的操作
        */
        System.out.println("写出完毕!");
        fos.close();
    }
}
