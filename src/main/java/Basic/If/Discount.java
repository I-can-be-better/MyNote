package Basic.If;

import java.util.Scanner;

/**
 * 需求: 接收用户输入的原价。
 * 满1000打9折;满2000打8折;满5000打5折
 * */
public class Discount {
    public static void main(String[] args) {
        //1.提示用户输入原价
        System.out.println("请输入商品原价:");
        //2.接收用户输入的原价
        double price = new Scanner(System.in).nextDouble();

        //3.计算打折后的价格
        //3.0定义变量用来保存打折后的价格
        double count = price;
        //注意,满足条件,执行代码,后续不再执行,如不满足第一条件,才会判断第二个条件,依次往后
        //3.1判断用户的打折段位并打折
        if(price >= 5000) {//满5000
            count = price * 0.5;//打5折
        }else if(price >= 2000) {//满2000
            count = price * 0.8;//打8折
        }else if(price >= 1000) {//满1000
            count = price * 0.9;//打9折
        }

        //3.2输出用户实际需支付的价格
        System.out.println("您实际应该支付:"+count);
    }
}
