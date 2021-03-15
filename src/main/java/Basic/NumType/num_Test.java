package Basic.NumType;

import java.util.Scanner;

/**本类用于求圆的面积*/
public class num_Test {
    public static void main(String[] args) {
    //公式:π*r*r
    //1.提示用户输入要求圆的半径
        System.out.println("请您输入要求圆的半径值:");
    //2.接收用户输入的半径值
    double r = new Scanner(System.in).nextDouble();
    //3.根据半径进行计算圆的面积
    double circleArea = 3.14*r*r;
    //4.把圆的面积打印到控制台
        System.out.println("当半径为"+r+"时,圆的面积为:"+circleArea);
}
}
