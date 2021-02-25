package API.collection.fordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JDK8以后,Collecetion添加了一些方法,其中支持了一个基于lambda表达式遍历集合的方法foreach
 */
public class ForeachDemo {
    public static void main(String[] args) {
        List<String> c=new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        //新循环
        for(String str:c){
            System.out.println(str);
        }

        /*
        Collection中的foreach方法要求传入一个lambda表达式,然后将集合每个元素都顺序的传给
        lambda的str,并执行以此表达式

        与迭代器相比,由于迭代器是用另一个类Interator来遍历数组,因此她便利的过程中不允许是用集合的方法
        增加删除元素(集合有并发安全的实现类,但是任然不允许多线程操作室使用迭代器遍历与集合方法增加删除同时进行)
        ,否则会抛出异常

        但时机和新添加的foreach方法可以在便利的过程过没有上述限制,因为foreach是集合自身方法,因此对于并发安全
        的集合实现类,增加删除元素和foreach有很好的互斥性,可以保证多线程的并发安全

        我们常用的集合实现类:ArrayList,LinkedList,Hashset都不是并发安全的,因此多线程情况下不应当操作他们
        集合的工具类:java.util.Collection提供了一套静态方法,可以将现有的集合转换为一个并发安全的集合

        c.forEach(
                (str)->{
                    System.out.println(str);
                }
        );
        效果与下面方式一样
         */

        c= Collections.synchronizedList(c);
        //Collections.synchizedset(set);

        /*
        当多个线程操作同一集合时,首先应当选取使用线程安全的集合,同时便利就不当使用遍历器
         */
        c.forEach((str)-> System.out.println(str));
    }
}
