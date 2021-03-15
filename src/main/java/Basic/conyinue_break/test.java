package Basic.conyinue_break;

import java.util.Scanner;

/**需求：找数字88
 * 提示并接受用户输入100次数字，如果不是88，则继续输入，找到88就结束
 * */
public class test {
    public static void main(String[] args) {
        method();//调用找数字88功能的方法

    }

    //创建method()
    public static void method() {
        //循环体可以帮助我们执行重复的事情,控制for循环执行100次
        for (int i = 1; i <= 100; i++) {
            //在每一次循环中都要提示并接收用户输入的数字
            System.out.println("请输入数字:");
            int input = new Scanner(System.in).nextInt();
            if (input != 88) {//用户输入的不是88
                continue;//继续输入
                /**break或者continue之后都不允许写代码,都是不可到达的代码*/
                //System.out.println(0);//Unreachable code
            }
            if (input == 88) {//找到88了
                System.out.println("恭喜您,猜对了!");
                break;//结束程序
                //System.out.println(0);//Unreachable code
            }
        }
    }
}


