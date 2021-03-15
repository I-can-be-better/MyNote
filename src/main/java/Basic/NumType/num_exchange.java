package Basic.NumType;

import java.util.Scanner;

/**本类用于交换两个变量的值*/
public class num_exchange {
    public static void main(String[] args) {
        //1.提示并接收用于输入的两个值
        System.out.println("请输入a的值:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入b的值:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a的值:"+a);
        System.out.println("b的值:"+b);
        //2.交换a b 两个变量的值
        int t ;//定义用来值交换的第三方变量t
        t = a;//把a的值交给t来保存
        a = b;//把b的值交给a来保存
        b = t;//把t的值嫁给b来保存
        //3.把交换后的两个值打印在控制台
        System.out.println("交换后,a的值为:"+a);
        System.out.println("交换后,b的值为:"+b);
    }
}
