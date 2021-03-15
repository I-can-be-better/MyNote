package Basic.Array.Array_one;

import java.util.Arrays;

/**本类用于练习数组的创建与基本使用*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        //1.创建数组

        //1.1静态创建--已经知道了数组中的具体数据

        char[] c1 = {'h','e','l','l','o'};

        char[] c2 = new char[] {'h','e','l','l','o'};



        //1.2动态创建--知道数组的长度,后期加内容

        char[] c3 = new char[5];//在内存中开辟一块连续的内存空间,用于存放5个字符

        //通过数组下标,操作数组中的每个元素,给数组元素赋值(显示初始化)

        //数组下标从0开始,数组的最大下标是数组的长度-1

        c3[0] = 'h';//给数组的第一个元素赋值

        c3[1] = 'e';

        c3[2] = 'l';

        c3[3] = 'l';

        c3[4] = 'o';//给数组的最后一个元素赋值



        //2.打印显示创建好的数组

        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);



        //3.创建一个String类型的数组

        String[] s = {"a","b","c"};

        System.out.println(s);//[Ljava.lang.String;@15db9742--数组的唯一地址值

        /**char类型底层做了特殊处理,可以直接打印数组中的元素

         * 但是其他所有类型的数组想要打印数组中的具体元素,需要借助数组的工具类Arrays.toString()

         * */

        System.out.println(Arrays.toString(s));



        //4.获取刚刚创建数组的长度

        System.out.println(c3.length);

        System.out.println(s.length);
    }
}
