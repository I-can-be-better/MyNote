package OOP.Variable;
/**本类用于测试变量的使用*/
public class vardemo1 {
    //1.定义局部变量:

//1)位置:在方法里/局部代码块里

//2)必须手动初始化

    //3)作用域:在方法/局部代码块中,对应的代码执行完局部变量就被释放
    static int count;
    static int sum=200;
    public static void main(String[] args) {

        int sum = 100;//定义在方法中的局部变量sum

        System.out.println(sum);//变量的就近原则:使用的都是自己附近的变量,100

        System.out.println(count);


        for (int i = 0; i < 10; i++) {//局部变量i只能在循环中使用

            System.out.println(i);

        }

//System.out.println(i);//报错:无法引用变量i:i cannot be resolved to a variable
    }
}
