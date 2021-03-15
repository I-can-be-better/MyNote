package OOP.Constructor;
/**本类用于测试构造方法*/
public class ConstructorDemo1 {
    //4.在公共类中创建入口函数
    public static void main(String[] args) {
//5.创建Person类的对象进行测试

/**1.每次new(实例化)对象时会自动调用构造方法*/

        Person p = new Person();

        System.out.println(p.name);

        System.out.println(p.age);

        System.out.println(p.address);

        p.eat();

        Person p2 = new Person("海绵宝宝");

        System.out.println(p2.name);

        System.out.println(p2.age);

        System.out.println(p2.address);

        p.eat();

        Person p3 = new Person("派大星",3,"海底");

        System.out.println(p3.name);

        System.out.println(p3.age);

        System.out.println(p3.address);

        p.eat();

    }

}

//1.创建Person类,用来描述人这一类型

class Person{

//2.属性--创建成员变量

    String name;//姓名

    int age;//年龄

    String address;//地址


/**2.默认存在无参构造,当new Person()会自动触发此无参构造*/

    /**3.构造方法也存在重载的现象:方法的重载:在同一个类中,方法名相同且参数列表不同的现象*/

//普通方法的定义:修饰符 返回值类型 方法名 (参数列表){ 方法体  }

//构造方法的定义:修饰符 方法名 (参数列表){ 方法体  } --方法名与类名一致


//6.1创建无参构造--当new Person()时,会触发

    public Person() {

        System.out.println("我是Person类的无参构造");

    }

/**快速向下复制:Ctrl+Alt+向下键*/

    /**4.当只提供了含参构造,默认的无参构造会被覆盖,所以在创建重载的构造方法时,一定注意手动添加无参构造*/

//6.2创建1个参数的构造

    public Person(String s) {

        System.out.println("我是Person类的1个参数的构造方法"+s);

    }

//6.3创建全参构造--定义了几个属性,就传几个参数,new Person("派大星",3,"海底");会触发

    public Person(String n,int a,String addr) {

        name = n;//n是局部变量,name是成员变量,把用户传的参数值n赋值给成员变量name

        age = a;//a是局部变量,age是成员变量,把用户传的参数值a赋值给成员变量age

        address = addr;//addr是局部变量,address是成员变量,把用户传的参数值addr赋值给成员变量address

        System.out.println("我是Person类的全参构造");

    }


//3.行为--创建方法

    public void eat() {

        System.out.println("到点啦,该点夜宵啦~");
    }
}
