package API.String;



/**
 * String 的优化导致其为不变对象,这会存在利于重新用但是不不利于修改操作
 * 频繁修改string会降低性能并有较多的系统开销
 *
 * Java.lang.stringbuilder是专门设计用来修改string的API,其内部维护
 * 一个可变的char数组,并提供多种修改字符串内容的方法,例如:增删改插
 * 和string原有的相关方法:indexof,length等等
 * stringbuilder修改string内容速度快,开销小
 */
public class builder {
    public static void main(String[] args) {
        String str="好好学习Java";

        //内部表示空字符串
        StringBuilder builder=new StringBuilder(str);

        //基于给定的字符串内容进行修改
        StringBuilder builder1=new StringBuilder(str);

        //对内容进行追加
        builder.append(",就是为了找个好工作!");
        str=builder.toString();
        System.out.println(str);

        //更换字符串中的内容
        builder.replace(13,18,"改变世界");
        System.out.println(builder.toString());

        //删除当前字符串中的部分内容
        builder.delete(0,8);
        System.out.println(builder);

        //insert:将给定内容插入到指定位置
        builder.insert(0,"活着");
        System.out.println(builder);

        //reverse:将所有内容反转
        builder.reverse();
        System.out.println(builder);

    }
}
