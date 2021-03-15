package Basic.While;

import java.util.Random;
import java.util.Scanner;

/**
 * 本类用于练习while循环
 * 需求: 产生一个随机数,和用户一直在输入的数字做比较,直到用户猜对
 * */
public class whiledemo {
    public static void main(String[] args) {
        int r = createNum();//调用可以生成随机数的方法,并且接收生成的随机数
        System.out.println("打个小抄:"+r);
        //调用猜数字方法1--while
        //guessNum1(r);
        //调用猜数字方法2--do-while
        guessNum2(r);
    }

    public static void guessNum2(int r) {
        do {//先执行一次
            //2.接收用户输入的值
            System.out.println("猜猜看~");
            int input = new Scanner(System.in).nextInt();
            //3.判断是否猜对(拿用户猜的数字与生成的随机数做比较)
            if(input > r) {
                System.out.println("猜大了,继续猜猜看");
            }else if(input < r) {
                System.out.println("猜小了,继续努力");
            }else if(input == r) {
                System.out.println("猜对了!");
                //一定注意:要设置程序出口!!!
                break;
            }
        }while(true);
    }

    //创建猜数字的方法
    public static void guessNum1(int r) {
        //1.写一个死循环
        while(true) {//死循环--需要设置程序的出口
            //2.接收用户输入的值
            System.out.println("猜猜看~");
            int input = new Scanner(System.in).nextInt();
            //3.判断是否猜对(拿用户猜的数字与生成的随机数做比较)
            if(input > r) {
                System.out.println("猜大了,继续猜猜看");
            }else if(input < r) {
                System.out.println("猜小了,继续努力");
            }else if(input == r) {
                System.out.println("猜对了!");
                //一定注意:要设置程序出口!!!
                break;
            }
        }
    }

    //创建一个用来生成随机数的方法
    public static int createNum() {
        //让程序产生一个随机数
        //java.util.Random,注意导包,快捷键:Ctrl+Shift+O
        int random = new Random().nextInt(100);//参数100是自定义的,此时生成的随机数范围是[0,100)的整数
        return random;
    }
}
