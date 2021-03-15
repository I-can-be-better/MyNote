package API.collection.set;

import java.util.HashSet;
import java.util.Set;

/**本类用于给自定义对象去重测试*/

//总结:
//1.如果想用set集合给自定义的对象去重,那么需要在自己的类中同时提供重写的hashCode()与equals()
//底层源码: if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
//重写hashCode():我们并不想使用自动计算出的哈希值,而是要根据对象的属性值进行计算,如果两个对象的属性值都相同,想生成同一个哈希码
//重写equals():我们想比较的不是对象的地址值(==),而是如果两个对象的属性值都一样,则返回true
public class set_test {
    public static void main(String[] args) {
        //1.创建set集合对象
        Set<Student> set = new HashSet<Student>();
        //新版JDK中后面的泛型类型与尖括号都可以不写,三种方式皆可,想用哪个用哪个
//      Set<Student> set = new HashSet<>();
//      Set<Student> set = new HashSet();

        //2.1创建自定义对象
        Student s1 = new Student("tony",38,"BeiJing");
        Student s2 = new Student("susan",20,"ShangHai");
        Student s3 = new Student("Jack",3,"ShenZhen");

        //创建对象,与之前对象的属性值完全一致
        Student s4 = new Student("susan",20,"ShangHai");
        Student s5 = new Student("Jack",3,"ShenZhen");
        //3.查看两个对象的哈希码
        System.out.println("s2对象的哈希码:"+s2.hashCode());
        System.out.println("s4对象的哈希码:"+s4.hashCode());
        //2.2把自定义的student对象添加到set集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        /**总结:
         * 重复的给set集合添加了属性相同的对象,为什么没有像之前那样去重呢?
         * 翻阅源码,得知:需要保证两个条件:
         * 1.保证对象拥有相同的哈希码值
         * --底层默认使用的是Object提供的hashCode()来计算哈希码值,每次new对象,默认的哈希码值是不同的
         * 解决方案:如果想根据两个对象的属性值来计算哈希值,就需要重写hashCode()
         * 2.保证两个对象的equals()返回true
         * --底层默认使用的是Object提供的逻辑,==比较,也就是说当地址值相同时,才返回true
         * 解决方案:重写equals()
         * */

        System.out.println(set);

    }
    }

