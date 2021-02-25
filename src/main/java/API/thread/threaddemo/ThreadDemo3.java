package API.thread.threaddemo;

/**
 * 使用匿名内部类的形式完成两种线程的创建
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1=new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("您赢了!我甘拜下风!");
                }
            }
        };

        Runnable r2=new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("你牛皮好吧");
                }
            }
        };



        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}




