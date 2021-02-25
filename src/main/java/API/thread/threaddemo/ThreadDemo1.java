package API.thread.threaddemo;

/**
 * 多线程
 * 多线程可以让多个代码并发执行,造成一种同时运行的现象
 *
 * 县城有两种创建方式:
 * 1.继承Thread并重写run方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread m1 = new myThread1();
        Thread m2 = new myThread2();

         /*
        注意:
        启动线程时要调用线程的start方法,而不是直接调用run方法
        线程调用start方法后会纳入到线程调度器中,线程调度器会分配CPU时间片段
        给当前线程使得它可以与和他线程内并发运行
        当该线程第一次获取时间片段时会自动执行run方法
         */
        m1.start();
        m2.start();

    }
}

/**
 * 第一中创建线程的方式优点在于结构简单,利于匿名内部类形式创建
 * 缺点有两个:
 * 1.由于Java是单继承,这导致如果继承了Thread就无法继承其他类去复用方法,实际开发中是非常不方便的
 * 2.定义线程的同时重写run方法,这导致将任务直接定义在了线程中使得线程与任务存在必然的耦合关系,不利于现成的重用
 */
        class  myThread1 extends Thread{
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("你是哪个?");
                }
            }
        }

class  myThread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("你竟然不知道我是谁?");
        }
    }
}

