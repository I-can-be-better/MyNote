package Basic.Array.Array_one;

import java.util.Arrays;

/**本类用于测试数组的工具类Arrays*/
public class Array_sort {
    public static void main(String[] args) {
        //1.创建无序数组

        int[] a = {21,96,75,23,25};



        //底层使用的排序算法是进行优化后的快速排序算法

        Arrays.sort(a);//对无序数组进行直接排序

        System.out.println(Arrays.toString(a));
    }
}
