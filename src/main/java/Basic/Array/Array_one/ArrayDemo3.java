package Basic.Array.Array_one;

import java.util.Arrays;

//需求:遍历数组,存入1-10
public class ArrayDemo3 {
    public static void main(String[] args) {


        //1.创建数组--动态创建

        int[] a = new int[10];


        //2.遍历数组,依次给每个位置赋值

        //循环开始:a[0]--数组中的第一个元素

        //循环结束:a[a.length-1]--数组中的最后一个元素

        //如何变化:++

        for (int i = 0; i <= a.length - 1; i++) {

            //a[i]--根据下标i来获取数组a中对应位置上元素的值

            a[i] = i + 1;

        }//for循环结束

        //3.在存入10个数据之后,打印a数组

        System.out.println(a);//[I@15db9742

        //除了char类型的数组,其他类型的数组想要查看具体内容需要借助工具类Arrays

        //Arrays.toString(要打印的数组的名字)来查看数组中的具体内容

        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}