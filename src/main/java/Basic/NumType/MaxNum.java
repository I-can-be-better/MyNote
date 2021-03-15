package Basic.NumType;

import java.util.Scanner;

/**需求:提示并接收用户输入的两个整数,并比较输出这两个值的最大值*/
public class MaxNum {
    public static void main(String[] args) {
        //1.提示用户输入
        //2.接收用户输入的两个整数
        System.out.println("请您输入要比较的第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请您输入要比较的第二个整数:");
        int b = new Scanner(System.in).nextInt();

        //3.比较接收的两个数,使用三元运算符 1 ? 2 : 3
        //1是表达式,若1为true,结果取2位置,若1为false,结果取3位置
        int max = a > b ? a : b ;//定义变量max来保存比较的最大值
        //4.打印最大值
        System.out.println("两个数的最大值是:"+max);
        /**思考题:如何判断3个数的最大值? int max = a>b?(a>c?a:c):(b>c?b:c);*/
    }
}
