package Basic.Method;
/**本类用于测试方法的基本知识1*/
public class methoddemo1 {
    public static void main(String[] args) {
        System.out.println(1);
        method();
        method2(20);
        method3("陈子枢",3);
        int result = method4(2,9);
        System.out.println(result);
        System.out.println(2);
    }

    //方法的修饰符 方法的返回值 方法名(参数类型 参数名){方法体...}
    public static int method4(int i, int j) {
        return i+j;//通过return关键字把运算结果返回给调用位置
    }

    public static void method3(String s, int age) {
        System.out.println(s+"今年"+age+"岁");
    }

    //method2()用来测试方法的参数
    //方法的修饰符 方法的返回值 方法名(参数类型 参数名){方法体...}
    public static void method2(int num) {
        System.out.println(num*num);
    }

    //创建method()测试方法的调用顺序
    //方法的修饰符 方法的返回值 方法名(参数列表){方法体...}
    public static void method() {
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
