package API.IO.Seria;


import java.io.*;

/**本类用于序列化与反序列化的测试类*/

/*
序列化:是指把程序中的java对象,永久保存在磁盘中,相当于是写出的过程,方向是out-->ObjectOutputStream
反序列化:是指把已经序列化在文件中保存的数据,读取/恢复到java程序中的过程,方向是in-->ObjectInputStream
 */
public class serializbale_test {
    public static void main(String[] args) {
    //method();//本方法用来完成序列化的功能
    method2();//本方法用于完成反序列化功能
}
    /**反序列化方法*/
    public static void method2() {
        //声明在本方法内都生效的局部变量,局部变量需要初始化,默认值是null
        ObjectInputStream in = null;
        try {
            //1.创建ObjectInputStream流对象来完成反序列化
            in = new ObjectInputStream(new FileInputStream("D://ready//1.txt"));

            //2.通过流对象反序列化生成指定对象
            Object o = in.readObject();
            System.out.println(o);
            System.out.println("恭喜您!反序列化成功!");
        } catch (Exception e) {
            System.out.println("很抱歉!反序列化失败!");
            e.printStackTrace();
        } finally {//一定会执行的代码块写释放资源的代码
            try {
                //3.释放资源
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**序列化方法*/
    public static void method() {
        //声明在本方法内都生效的局部变量,局部变量需要初始化,默认值是null
        ObjectOutputStream out = null;
        try {
            //1.创建ObjectOutputStream流对象来完成序列化
            out = new ObjectOutputStream(new FileOutputStream("D://ready//1.txt"));

            //2.指定要序列化(输出)的对象
            Student obj = new Student("海绵宝宝",3,"大海底部",'男');
            //3.通过OOS流对象来序列化输出Student对象
            out.writeObject(obj);
            System.out.println("恭喜你!序列化成功!");
        } catch (IOException e) {
            System.out.println("很抱歉!序列化失败!");
            e.printStackTrace();
        }finally {//关流的操作要放在finally{}中--因为此代码块一定会执行
            try {
                //4.关流操作
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
