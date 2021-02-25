package API.thread.syncdemo;

/**
 * 互斥锁
 * 当时用synchronized锁定多个代码片段时,并且这些同步块指定的同步监听器对象相同时
 * 这些代码片段之间就是互斥的,多个线程不能同时执行他们
 *
 * 当两个锁指定的类对象一样时,就是互斥锁
 */
public class syncDemo4 {
    public static void main(String[] args) {
        Foo foo=new Foo();
        Thread t1=new Thread(){
            public void run(){
                foo.methodA();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                foo.methodB();
            }
        };
        t1.start();
        t2.start();

    }
}

class   Foo{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行方法A.....");
            Thread.sleep(1000);
            System.out.println(t.getName() + ":A方法执行完毕!");
        } catch (InterruptedException e) {
        }

    };

    public void methodB(){
        synchronized (this) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行方法B.....");
                Thread.sleep(1000);
                System.out.println(t.getName() + ":B方法执行完毕!");
            } catch (InterruptedException e) {
            }
        }
    };
}