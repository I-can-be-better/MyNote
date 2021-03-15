package Basic.Array.Array_one;
/**本类用于练习数组的遍历
 * 需求:输出一年中每个月份的天数
 * */
public class ArrayDemo2 {
    public static void main(String[] args) {

        method();//本方法用于输出每个月的天数,快速修复快捷键Ctrl+1

    }

    //打印需求:例如 1月有31天

    public static void method() {

        //1.创建数组用来存12个月的天数

        int[] a = {31,28,31,30,31,30,30,31,30,31,30,31};



        //2.输出每个月的天数打印到控制台

        //数组的遍历--通过循环的方式--操作的是数组的下标

        //循环开始:a[0]--数组中的第一个元素

        //循环结束:a[a.length-1]--数组中的最后一个元素

        //如何变化:++

        //for(int i = 0 ; i <=a.length-1 ; i++) {

        for(int i = 0 ; i <a.length ; i++) {

            //a[i]--根据下标i来获取数组a中对应位置上元素的值

            System.out.println((i+1)+"月有:"+a[i]+"天");

        }

    }
}
