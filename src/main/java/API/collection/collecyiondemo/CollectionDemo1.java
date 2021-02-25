package API.collection.collecyiondemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java数组集合框架
 * java.util.Collection接口,是所有集合的顶级接口,里面定义了集合都应具备的功能
 * 集合和数组一样,可以保存一组数据,并且对元素的操作都以方法的形式提供出来,使用方便
 * 并且集合有多种不同的数据结构可供选择
 *
 * Collection下面有两个常见的子接口:
 * java.unil.List:线性表,这类集合的特点是可以存放重复元素,并且有序
 * 实现类:java.util.ArrayList,  java.util.LinkedList
 *
 * java.util.Set :这类集合的特点是不能存放重复元素
 * 常用实现类:java.util.HashSet
 * 重复元素的判断标准为元素自身equals方法比较的结果,为true则认定为重复元素
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        /*
        boolean add(E e)
        向当前集合中添加给定元素,成功添加则返回true
        集合只能存放应用类型元素,如果指定的元素是基本类型时编译器会进行自动装箱为包装类
         */

        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        /*
        int size
        集合元素的个数
         */
        int size=c.size();
        System.out.println("size:"+size);
        /*
        boolean isEmpty
        判断当前集合是否为空集
        当集合的size为0时,返回true
         */
        boolean isEmpty=c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);

        c.clear();
        //清空集合
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
