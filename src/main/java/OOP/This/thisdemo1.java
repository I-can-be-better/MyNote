package OOP.This;
/**本类进行this测试2*/
public class thisdemo1 {
    public static void main(String[] args) {
        //创建对象时会自动调用构造方法

        Dog d = new Dog();

        Dog d2 = new Dog("小旺旺");

    }

}

/**

 * this还可以在构造方法间相互调用

 * 但请一定注意:是单向的,不是双向来回调用,会死循环

 * */

class Dog{

//无参构造

    public Dog() {

/**在无参构造中 调用含参构造的功能*/

/**规定:this关键字必须在构造方法中的第一行*/

//this("旺财");

        System.out.println("无参构造");

    }

//含参构造

    public Dog(String s) {

/**在含参构造中 调用无参构造的功能*/

/**规定:this关键字必须在构造方法中的第一行*/

        this();

        System.out.println("含参构造"+s);
    }
}
