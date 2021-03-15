package Basic.Input;

/**
 * 本类用于测试在控制他哦打印个人信息
 */
public class Info {
    public static void main(String[] args) {
        //java架构师今年20岁，月薪100000.99，感慨java是世界上最好的语言
        /**1.在我们的程序当中{} [] () "" 都是成对出现的,而且都是英文符号*/
        /**2.定义变量的规则:数据类型 数据名 数据值 */
        String name="海绵宝宝";
        int age = 3;
        double salary = 100.99;
        //通过+动态拼接字符串
        System.out.println("我叫"+name);
        //如果是在中间拼接用""+变量+""的格式
        System.out.println("java架构师"+name+",今年"+age+"岁,月薪"+salary+",感慨java是世界上最好的语言");
    }
}
