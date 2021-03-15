package OOP.Private;
/**本类用于测试封装*/
public class Privatedemo {
    public static void main(String[] args) {
        //5.创建学生类对象--通过new关键字创建学生类对象

        Student s = new Student();

//6.初步测试Student类对象s

        System.out.println(s.name);//可以通过"."来调用s对象的name属性,查看它的值

        s.study();//可以通过"."来调用s对象的study()

//7.给s对象的属性赋值

        s.name = "程序猿";

        s.sno = 666;

//s.subject = "Java培优";

//8.查看赋值后的属性值

        System.out.println(s.name);

        System.out.println(s.sno);

//System.out.println(s.subject);


//10.通过Student类中提供 的公共的subject属性的设置与访问方法来给subject属性赋值并查看

        s.setSubject("JavaCGB");

        System.out.println(s.getSubject());


//eat();

        s.study();

    }

}

//1.通过class关键字创建学生类--用来描述学生这一类型--属性+行为

/***

 * 封装:通过private关键字(权限修饰符)来修饰成员变量/成员方法

 * 被修饰的成员就实现了私有化,访问权限只能在本类中访问

 */

class Student{

//2.定义属性--成员变量

    String name;//姓名

    int sno;//学号

//9.对成员变量进行封装

    private String subject;//科目

    /**对外提供公共的属性值设置方式*/

    public void setSubject(String s) {

        subject = s;

    }

    /**对外提供公共的属性值查看方式*/

    public String getSubject() {

        return subject;

    }

//3.定义行为--方法

    public void study() {

        System.out.println("正在学习JAVA");

/**我们可以在公共的方法里调用私有方法*/

        eat();

    }

//11.封装方法

    private void eat() {

        System.out.println("干饭人 干饭魂");
    }
}
