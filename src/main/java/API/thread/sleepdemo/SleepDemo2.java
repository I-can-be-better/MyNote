package API.thread.sleepdemo;

/**
 * sleep方法要求必须中断异常(Thread还提供了其他会导致线程阻塞的方法,很多要求处理这个异常,情况是一样的)
 *
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中,此时该线程的interrupt方法会被调用,会中断这个阻塞过程,此时该方法会抛出中断异常
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread() {
            public void run() {
                System.out.println("林:没下班,睡一回吧!....");
                try {
                    Thread.sleep(100000000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢!干嘛呢!都破了相了!");
                }
                System.out.println("林:醒了!");
            }
        };

        Thread huang = new Thread() {
            public void run() {
                System.out.println("黄:大锤80!小锤40!开始砸墙!");
                try {
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(1000);
                        System.out.println("黄:80!");
                    }
                    System.out.println("黄:哐当!");
                    System.out.println("黄:搞完收工!");
                    lin.interrupt();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        lin.start();
        huang.start();
    }
}