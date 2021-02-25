package API.collection.ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection,是集合中最常用的一类集合.
 * 特点是:可以存放重复元素并且有序
 * List中定义了一套可以通过下标操作元素的方法,使用更方便
 *
 * List常用实现类:
 * java.util.ArrayList:内部使用数组实现,查询性能更好
 * java.util.LinkedList:内部使用链表实现,増删性能更好
 * 在没有对集合对应性能有非常严苛的要求时,通常首选使用ArrayList
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
        E get(int index)
        获取集合中下表位置对应位置的元素
        */
        String str=list.get(0);
        System.out.println(str);

        //对list的遍历
        for(int i=0;i<list.size();i++){
            str=list.get(i);
            System.out.println(str);
        }


        /*
        E set(int index,E e)
        将给定元素设置到指定位置,返回值为原有元素
        相当于替换原有元素
         */
        //[1,2,3,4,5]
        String old=list.set(1,"2");
        System.out.println(list);
        System.out.println(old);//被替换的元素two

        /*
        在不创建新集合的前提下,将几何元素反转
        就利用get,set方法
         */
       //for(int i=0;i<=list.size()/2;i++){
        //    old=list.set(list.size()-1-i,str);
        //    System.out.println(list);
        //}
        Collections.reverse(list);
        System.out.println(list);//效果与上相同,实现反转功能




    }
}
