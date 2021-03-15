package OOP.Extends;
/**本类是继承的入门案例*/
public class extendsdemo1 {
    public static void main(String[] args) {
        //创建Cat对象进行测试

        Cat c = new Cat();

        c.eat();

        DingDang d = new DingDang();

        d.eat();

        d.print();

    }

}

//1.创建父类Animal-爷爷类

class Animal{

//2.定义一个父类中的普通方法

    public void eat() {

        System.out.println("吃啥都行~");

    }

}

//3.创建Animal类的子类Cat--爸爸类

/**1.子类与父类是继承关系,用extends关键字来表示/连接*/

/**2.java只支持单继承,一个子类只能有一个父类,一个父类可以有多个子类*/

class Cat extends Animal{

//5.定义属性

    int a =10;

    private int sum = 100;/**5.父类的私有资源,子类无法继承*/

}



/**6.继承是is a 的关系,要求子类必须是父类的一种继承结构,依赖性非常强,强耦合*/

//4.创建Cat类的子类DingDang--孙子类

/**4.继承具有传递性,爷爷的功能会传给爸爸,爸爸的功能会传给儿子*/

class DingDang extends Cat{

//6.在孙子类中定义打印的方法

    public void print() {

/**3.子类集成父类以后,相当于把父类的功能进行了复制*/

        System.out.println(a);//子类可以打印父类的公有属性a

//System.out.println(sum);//子类不可以打印父类的私有属性sum
    }
}
