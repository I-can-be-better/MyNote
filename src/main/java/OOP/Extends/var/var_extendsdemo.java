package OOP.Extends.var;
/**本类用于测试继承中成员变量的使用*/
public class var_extendsdemo {
    public static void main(String[] args) {
        Son s = new Son();

        s.eat();

    }

}



//1.创建父类

class Father{

//4.在父类中定义两个属性]

    int  count = 0;

    int sum = 300;

}



//2.创建子类

class Son extends Father{

    int sum = 100;//3.2在子类中定义成员变量


    public void eat() {

        int sum = 10;//3.1在子类的方法中定义局部变量

        System.out.println(sum);//10,3.3变量的就近原则,打印的是局部变量

        System.out.println(this.sum);//100,3.4使用this,调用的是成员变量sum


        System.out.println(count);//4.1使用了父类的资源

/**在子类中使用父类的sum资源,需要使用super.进行调用

 * super是表示父类的一个对象引用 Father super = new Father();

 * */

        System.out.println(super.sum);//super.可以调用父类的资源
    }
}
