package Basic.Method;
/**本类用于测试方法的重载*/
public class Overload {
    public static void main(String[] args) {
        //重载:在一个类中有多个同名的方法&方法的参数列表不同(个数不同/类型不同)
        //参数列表指的是参数的类型顺序和个数,而不是参数名
        //(int a,int b)和(int b,int a)—不属于重载
        //(int a,String b)和(String b,int a)—属于重载
        //方法的调用是根据方法名+参数列表来调用的
        method();
        method(20);
        method("海绵宝宝",3);
        method(100,100);
    }

    //创建method(int i,int j)
    public static void method(int i, int j) {
        System.out.println(i+j);
    }

    //创建method(String s,int i)
    public static void method(String s, int i) {
        System.out.println(s+"今年"+i+"岁啦");
    }

    //创建method()
    public static void method() {
        System.out.println("哈哈哈哈我没有参数");
    }

    //创建method(int num)
    public static void method(int num) {
        System.out.println(num*num);
    }
}
