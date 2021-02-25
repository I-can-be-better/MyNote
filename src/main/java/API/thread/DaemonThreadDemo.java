package API.thread;



/**
 * 守护线程
 * 守护线程是通过普通县城调用setDaemon(boolean on)设置而转变而来的
 * 因此创建是与普通县城没有区别,主要区别在于结束时间上有一点不同:进程的结束
 * 当Java进程中没有任何普通线程运行时,该进程就会结束,此时杀死所有正在运行的守护线程
 *
 * 守护线程一般也被称为后台线程
 */
public class DaemonThreadDemo {
    private static boolean ISDONE = true;//表示跳海这个动作做了
    public static void main(String[] args) throws InterruptedException {
        System.out.println("rose站在船头...");
        Thread rose = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("rose:你不要过来呀!");
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                    }
                }
                        {
                            System.out.println("rose:扑通!");
                            System.out.println("rose:啊.....");
                        }
                    }

        };


        Thread jack = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Jack:海水很凉的,你先别跳,让我拍个照发个朋友圈!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                    System.out.println("rose已跳船!");
                    System.out.println("jack:都叫你先别跳了,海水很凉的");
                    System.out.println("Jack:拜拜了您嘞!");
                    if (!ISDONE) {
                        throw new RuntimeException("rose:你别逼我!");
                    }
                }
            }
                    };
                rose.start();
                jack.setDaemon(true);
                jack.start();
            }
        }

