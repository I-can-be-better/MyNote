package API.object;

/**
 * 测试object常用方法
 */
public class text {
    public static void main(String[] args) {
        point p=new point(1,2);
        /*
        object中定义了方法:
        String tosting()
        作用是将当前方法转换为string
        object中该方法的实现返回的字符串类型格式为:类名@地址
         */
        String str=p.toString();
        System.out.println(str);
        /*向控制台输出是很常见的操作,当我们输出一个对象时
        实际上该方法会调用该对象的tostring方法,将返回的字符串输出到控制塔
         */
        point p1=new point(1,2);
        System.out.println(p==p1);
        /*
        object提供的另一个常用方法
        Boolean equals(object o)
        该方法的作用是比较当前对象与参数给定的对象内容是否相同
        但是如果不重写这个方法,则该方法毫无价值,因为object实现该方法的
         */
        System.out.println(p.equals(p1));
        //只有自己定义的类才需要重写,idea提供的类基本都是重写过了的,比如string
    }
}
