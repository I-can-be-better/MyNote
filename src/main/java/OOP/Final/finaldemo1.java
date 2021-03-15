package OOP.Final;
/**本类用于测试final的入门案例*/
public class finaldemo1 {
    public static void main(String[] args) {
        //5.创建子类对象进行测试

        Son4 s = new Son4();

        s.work();

//s.name = "干饭人";//final修饰的name属性不可以重新赋值:The final field Father4.name cannot be assigned

        System.out.println(s.name);

    }

}

//1.创建父类

/**1.final表示最终,可以用来修饰类,那么被final修饰的类无法被继承,也就是没有子类--最终类*/

//final class Father4{//Son4类不可以成为最终类Father4的子类:The type Son4 cannot subclass the final class Father4

class Father4{

//3.创建成员变量

    /**2.final可以修饰成员变量,被final修饰的变量不可以被修改--常量*/

    final String name = "打工人";


//4.创建成员方法

    /**3.final可以修饰成员方法,但是被final修饰的方法是最终实现,子类无法重写*/

    final public void work() {

        System.out.println("Father4...打工人,打工魂");
    }
}

//2.创建子类

class Son4 extends Father4{

//子类重写父类的work()

// public void work() {//Cannot override the final method from Father4

// System.out.println("Son4...打工人要利用计算机打工");

// }

}
