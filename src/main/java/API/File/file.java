package API.File;

import java.io.File;

/**
 * Java.io.file可以表示硬盘上的一个文件或目录
 * 使用file可以:
 * 1:访问该文件或目录的属性信息(大小,修改日期,可读可写)
 * 2:创建或删除文件和目录
 * 3:访问一个目录中的所有子项
 *
 * 但是file不访问文件中的数据
 */
public class file {
    public static void main(String[] args) {
        /*
        file创建时可以指定路径
        该路径通常使用相对路径,它有更好的跨平台性

        相对路径和中"./"表示当前目录,当前目录是哪里要是当前程序的运行环境而定,在idea或eclipse里运行时,当前目录
        就是这个程序所在的项目目录
        .在这里表示当前目录
        */
        File file=new File("./demo.TXT");
        String name=file.getName();
        System.out.println(name);
        long len=file.length();

        boolean cr=file.canRead();
        System.out.println("可读");
        boolean cw=file.canWrite();
        System.out.println("可写");
        boolean in=file.isHidden();
        System.out.println("是否隐藏"+in);





    }
}
