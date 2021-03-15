package OOP.creat_class;
/**本类用来练习面向对象

 * 分析手机事物:--通过类来描述

 * 属性:品牌 价格 尺寸 颜色

 * 功能:打电话 发短信 听直播

 * */

//在一个java文件中可以写多个class,但是被public修饰的只能有一个,而且这个类的名字就是文件名
public class demo1 {
    public static void main(String[] args) {


    //2.在main()中通过new关键字来创建对应类的对象

    Phone p = new Phone();

//3.通过.来完成对象功能的调用

p.call();

p.message();

p.learn();

//4.通过.来查看对象的属性值

System.out.println(p.brand);

System.out.println(p.price);

System.out.println(p.size);

System.out.println(p.color);


}

}

//1.通过class关键字创建手机类--用来描述手机这一类事物--特征+行为

//类是一类事物的抽象,只抽象的规定这一类事物的特征和行为

class Phone {

//特征(属性)--类的成员变量来描述--位置:类里方法外

    String brand;//品牌

    double price;//价格

    double size;//尺寸

    String color;//颜色


//行为(功能)--类的方法来描述--修饰符 返回值类型 方法名(参数列表){方法体}

    public void call() {

        System.out.println("正在打电话");

    }

    public void message() {

        System.out.println("正在发短信");

    }

    public void learn() {

        System.out.println("正在看直播");
    }
}