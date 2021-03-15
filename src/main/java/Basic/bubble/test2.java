package Basic.bubble;

import java.util.Arrays;
import java.util.Random;

/**本类用来完成冒泡排序*/
public class test2 {
    public static void main(String[] args) {
        //1.创建一个无序的数组

        int[] a = createArray();

        //2.调用method()完成排序

        int[] newA = bubbleSort(a);

        System.out.println("排序完毕:"+Arrays.toString(newA));

    }



    public static int[] createArray() {

        //1.创建数组--动态

        int length = new Random().nextInt(8);

        int[] a = new int[length];

        //2.遍历数组,给数组中的每个元素赋值

        for(int i = 0 ; i <a.length ; i++) {

            //100是自定义的数据,表示生成的随机整数的范围是[0,100)

            a[i] = new Random().nextInt(100);

            //a[i] = new Random().nextInt(100)+1;//取值范围前后都+1-->[1,101)

        }

        //3.使用数组的工具类查看数组中的元素

        System.out.println(Arrays.toString(a));

        return a;

    }



    public static int[] bubbleSort(int[] a) {

        //1.外层循环,控制比较的轮数,假设有n个数,最多比较n-1次

        //开始值:1 结束值:<= a.length-1 变化:++

        //控制的是循环执行的次数,比如5个数,最多比较4轮,<= a.length-1,最多取到4,也就是[1,4]4次

        for(int i = 1 ; i <= a.length-1 ; i++) {

            boolean flag = false;//优化2

            System.out.println("第"+i+"轮:");

            //2.内层循环:相邻比较+互换位置

            //结束值:a.length-1-i -i是因为之前轮中找到的最大值无序参与比较,i轮会产生i个最大值,所以需要

            for(int j=0; j < a.length-1-i ; j++) {//优化1

                //相邻比较,a[j]代表的就是前一个元素,a[j+1]代表的就是后一个元素

                if(a[j] > a[j+1]) {

                    //交换数据

                    int t = a[j];

                    a[j] = a[j+1];

                    a[j+1] = t;

                    flag = true;

                    //System.out.println("第"+(j+1)+"次比较交换后:"+Arrays.toString(a));

                }

            }

            if(flag == false) {

                return a;

            }

            System.out.println("第"+i+"轮的结果:"+ Arrays.toString(a));

        }

        return a;//把排序好的数组a返回
    }
}
