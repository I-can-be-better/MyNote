package OOP.Block;
/**本类用于测试代码块的加载顺序*/

/**

 * 总结:

 * 1.当创建对象时,程序会自动调动构造方法,但是如果有构造代码块,会先去执行构造代码块,再执行构造方法

 * 2.当通过对象调用方法时,会执行方法中的功能,如果方法中有局部代码块,就会执行局部代码块

 * 3.执行顺序: 构造代码块-->构造方法-->局部代码块[前提:调用方法(如果方法有局部代码块,局部代码块才会执行)]

 * 4.构造代码块的功能: 用于提取构造方法中的共性

 * 5.局部代码块的功能:控制变量的作用范围

 * */
public class blockDemo {
    public static void main(String[] args) {
        //5.在main()中创建对象进行测试

        Teacher t = new Teacher();/**每次创建对象时/new时,都会执行一次构造代码块*/

        Teacher t2 = new Teacher();

        Teacher t3 = new Teacher("大中华");

        t.study();

    }

}



//1.创建一个Teacher类用于测试

class Teacher{

    String subject;//2.定义成员变量科目,全局生效

//6.定义构造代码块

    {

/**构造代码块的位置:类里方法外

 * 作用:用于提取构造方法中的共性内容

 * 执行时机:优先于构造方法执行*/

        subject = "Java培优";

        System.out.println("构造代码块");

    }


//3.定义构造方法

//3.1创建本类的无参构造

    public Teacher() {

        System.out.println("我是Teacher类的无参构造"+subject);

    }


//3.2创建本类的含参构造

    public Teacher(String n) {

        System.out.println("我是Teacher类的含参构造"+n+subject);

    }


//4.定义普通方法

//方法定义:修饰符 返回值类型 方法名(参数列表){方法体...}

    public void study() {

//7.创建局部代码块

/**局部代码块的位置:方法里

 * 作用:控制变量的作用范围(作用范围越小越好,因为越小越安全)

 * 执行时机:调用本方法时*/

        {

            int i = 10;

            System.out.println(i);

        }

//System.out.println(i);//报错,因为超出i的作用范围

        System.out.println("正在备课...");
    }
}
