package Basic.Array.Array_one;

import java.util.Arrays;

/**本类用于测试数组的工具类Arrays*/
public class Array_copyof {
    public static void main(String[] args) {
        //1.创建无序数组

        int[] from = {1,2,3,4,5};//数组一旦创建,长度不可改变



        //2.1数组的普通复制

        int[] to = Arrays.copyOf(from, 5);//需要复制哪个数组,复制的长度

        System.out.println(Arrays.toString(to));



        //2.2 数组的扩容

        //先创建对应长度的新数组,然后复制原数组的数据,不足的即为默认值,此处int[]的默认值是0

        int[] to2 = Arrays.copyOf(from, 10);//需要复制哪个数组,复制的长度



        System.out.println(Arrays.toString(to2));



        //2.3 数组的缩容

        //先创建对应长度的新数组,然后按照参数个数复制原数组中的数据,类似截取

        int[] to3 = Arrays.copyOf(from, 3);//需要复制哪个数组,复制的长度

        System.out.println(Arrays.toString(to3));



        //2.4指定首尾截取数组中的元素

        int[] to4 = Arrays.copyOfRange(from, 2, 4);

        System.out.println(Arrays.toString(to4));

    }
    }

