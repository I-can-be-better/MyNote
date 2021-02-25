package API.thread;

/**
 * 线程提供了一组相关信息的方法
 */
public class ThreadInfo {
    public static void main(String[] args) {
        //获取主线程
        Thread t=Thread.currentThread();
        //获取线程名字
        String name=t.getName();
        System.out.println(name);
        //获取唯一标识
        long id=t.getId();
        System.out.println("唯一标识:"+id);
        //获取线程优先级
        int priority=t.getPriority();
        System.out.println("优先级:"+priority);
        //判断线程是否结束
        boolean isAlive=t.isAlive();
        System.out.println(isAlive);
        //判断线程是否是守护线程
        boolean isDaemon=t.isDaemon();
        System.out.println(isDaemon);
        //判断线程是否被中断
        boolean isInterrupted=t.isInterrupted();
        System.out.println(isInterrupted);

    }
}
