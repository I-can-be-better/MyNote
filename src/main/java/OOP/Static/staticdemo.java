package OOP.Static;
/**本类用于测试static静态的入门案例*/
public class staticdemo {
    public static void main(String[] args) {
        /**3.静态资源可以通过类名直接调用*/

/**4.静态资源是优先于对象加载的,随着类的加载而加载,比对象先加载进入内存,没对象也可以直接被类名调用*/

//4.通过类名直接调用静态资源进行测试

        System.out.println(Student.name);

        Student.study();

//3.创建对象进行测试

        Student s = new Student();

        s.study();

//6.通过s对象修改name属性的值

        s.name = "黄桃罐头";

        System.out.println(s.name);


//5.测试多个对象访问静态资源

        Student s2 = new Student();

        System.out.println(s2.name);

        System.out.println(Student.name);

    }

}

//1.创建学生类

class Student{

//2.定义属性和方法

/**1.可以使用static关键字将普通资源修饰成静态资源*/

    /**2.static可以用来修饰成员变量/方法,一般写在权限修饰符之后*/

    static String name = "海绵宝宝";

    public static void study() {

        System.out.println("别闹,我学JAVA呢~~~");
    }
}
