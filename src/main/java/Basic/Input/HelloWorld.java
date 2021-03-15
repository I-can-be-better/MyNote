package Basic.Input;
/**
 * package --包
 * com.tedu.hello --包名,全小写,公司的域名倒着写
 * ;java语句的结束符
 * 注意:在java代码中出现的符号均为英文符号
 */

/**
 * public --公共的,作为类的修饰符,修饰谁可以访问这个类
 * class --类,java用来定义类的一个特殊的单词
 * HelloWorld --类名--驼峰命名法,每个单词的首字母都要大写
 * {代码....} 花括号表示是类的主体,其中包含我们写的代码
 * */
public class HelloWorld {
    /**
     * public static void main(String[] args) {} --程序的入口
     * main() --程序的入口,方法名是main
     * public -公共的,作为方法的修饰符,修饰谁可以访问这个方法
     * static --静态的,说明这个方法就是静态
     * void --空/无,说明方法的返回值是空的
     * () -- 代表的是这是一个方法--函数
     * String[] args --方法的参数
     * {代码....} --花括号是方法的主体,其中就是我们写的代码
     */
    public static void main(String[] args) {
        /**
         * 本句代码的作用:向控制台打印一句话
         * System --系统,要发出系统指令
         * out -- 向外输出
         * println --具体执行的方式--打印后换行
         * print --打印后不换行
         * () --方法的标识符
         * "hello world~" -- 方法的参数,指定要打印的内容
         * ; java语句的结束符
         * */
        System.out.println("hello world~");
        System.out.print("hello world~");
    }
    }

