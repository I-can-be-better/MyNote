package API.lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后推出了一个新的特性:lambda表达式
 * lambda表达式可以用更简短的语法创建匿名内部类
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 * 需要的是,使用lambda表达式创建时实现的接口中只能有一个变量
 */
public class lambdademo01 {
    public static void main(String[] args) {
        //使用匿名内部类方式创建的文件过滤器
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("e");
            }

            //lambda表达式写法
            /*
            编译器会结合程序语义分析出实现的是哪个结构,由于要求接口只能有一个抽象方法
            所以也只能直到重新改IE的方法是什么
            最终将它还原为匿名内部类
             */
            FileFilter filter1 = (File file) -> {
                return file.getName().contains("e");
            };
        };
    }
}
