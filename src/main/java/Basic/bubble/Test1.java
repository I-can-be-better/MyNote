package Basic.bubble;

import java.util.Arrays;

/**本类用来完成冒泡排序*/
public class Test1 {
    public static void main(String[] args) {
        //1.创建一个无序的数组

        int[] a = {27,96,73,25,21};

        //2.调用method()完成排序

        int[] newA = method(a);

        System.out.println("排序完毕:"+ Arrays.toString(newA));

    }

    public static int[] method(int[] a) {

        //1.外层循环,控制比较的轮数,假设有n个数,最多比较n-1次

        //开始值:1 结束值:<= a.length-1 变化:++

        //控制的是循环执行的次数,比如5个数,最多比较4轮,<= a.length-1,最多取到4,也就是[1,4]4次

        for(int i = 1 ; i <= a.length-1 ; i++) {

            System.out.println("第"+i+"轮:");

            //2.内层循环:相邻比较+互换位置

            for(int j=0; j < a.length-1 ; j++) {

                //相邻比较,a[j]代表的就是前一个元素,a[j+1]代表的就是后一个元素

                if(a[j] > a[j+1]) {

                    //交换数据

                    int t = a[j];

                    a[j] = a[j+1];

                    a[j+1] = t;

                    //System.out.println("第"+(j+1)+"次比较交换后:"+Arrays.toString(a));

                }

            }

            System.out.println("第"+i+"轮的结果:"+Arrays.toString(a));

        }

        return a;//把排序好的数组a返回
    }
}
