package OOP.Extends.construct;
/**本类用于测试继承中构造方法的使用*/

//总结:

//1.子类创建对象时,默认会访问父类的无参构造

//2.在构造方法的第一行,都有一条默认语句super();--代表的是调用父类的无参构造

//3.当父类没有无参构造时,可以通super调用父类的其他构造方法
public class con_exdemo {
    public static void main(String[] args) {
        //3.创建子类对象进行测试

        Son3 s = new Son3();

    }

}



//1.创建父类

class Father3{

    /**0.构造方法可以被继承吗?--不可以!!!

     * 语法结构的要求:构造方法的方法名需要与本类类名一致,天然就不符合要求

     * */

// public Father3() {

// System.out.println("我是父类的无参构造");

// }

    public Father3(String n) {

        System.out.println("我是父类的无参构造"+n);

    }

}



//2.创建子类

class Son3 extends Father3{

    public Son3() {

/**1.子类的构造方法中,默认存在super(),所以创建子类对象时,默认调用父类的无参构造*/

/**2.在子类创建对象时,会自动调用子类的无参构造,但是继承后会先去执行父类的无参构造*/

        super("肖战");/**3.当父类中没有无参构造时,调用父类的含参构造*/

        System.out.println("我是子类的构造方法");
    }
}
