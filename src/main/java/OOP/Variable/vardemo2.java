package OOP.Variable;
/**本类用于测试变量的使用*/
public class vardemo2 {
    //2.定义成员变量:

//1)位置:类里方法外

//2)无需手动初始化,会自动赋予对应类型的默认值

//3)作用域:在整个类中生效,类消失,变量才会消失

    static int count;


//3.变量有一个使用的原则:就近原则

    static int sum = 200;

    public void main(String[] args) {

//1.定义局部变量:

//1)位置:在方法里/局部代码块里

//2)必须手动初始化

//3)作用域:在方法/局部代码块中,对应的代码执行完局部变量就被释放

        int sum = 100;//定义在方法中的局部变量sum

        System.out.println(sum);//变量的就近原则:使用的都是自己附近的变量,100

        System.out.println(count);


//可以通过this关键在来调用成员变量,前提:成员变量与局部变量同名时

//如果不使用this指定,那么打印10,因为变量的就近原则,使用的是局部变量sum

        System.out.println(this.sum);//通过this.访问了本类的成员变量sum200


        for (int i = 0; i < 10; i++) {//局部变量i只能在循环中使用

            System.out.println(i);

        }

//System.out.println(i);//报错:无法引用变量i:i cannot be resolved to a variable
    }
}
