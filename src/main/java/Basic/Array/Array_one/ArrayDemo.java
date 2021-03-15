package Basic.Array.Array_one;

import java.util.Arrays;
import java.util.Random;

//需求:创建数组,数组中的内容是随机的
public class ArrayDemo {
    public static void main(String[] args) {
        //1.创建数组--动态

        int[] a = new int[10];

        //2.遍历数组,给数组中的每个元素赋值

        for(int i = 0 ; i <a.length ; i++) {

            //100是自定义的数据,表示生成的随机整数的范围是[0,100)

            a[i] = new Random().nextInt(100);

            //a[i] = new Random().nextInt(100)+1;//取值范围前后都+1-->[1,101)

        }

        //3.使用数组的工具类查看数组中的元素

        System.out.println(Arrays.toString(a));
    }
}
