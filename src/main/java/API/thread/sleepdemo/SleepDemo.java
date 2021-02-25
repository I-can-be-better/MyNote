package API.thread.sleepdemo;

import java.util.Scanner;

/**
 * 线程提供的方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒,超时后会自动回到runnable状态
 * 再次获得时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了.........");
        //完成一个倒计时程序
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        for(;i>0;i--){
            System.out.println("倒计时开始:"+i);}
        try{

                Thread.sleep(1000);


        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("程序结束了.........");
    }
}
