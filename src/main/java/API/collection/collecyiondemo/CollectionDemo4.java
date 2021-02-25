package API.collection.collecyiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合之间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add("java");
        c1.add("C++");
        c1.add(".net");
        System.out.println("c1:"+c1);

        Collection c2=new HashSet();
        /*
        c2中的保存位置是固定的,顺序不会发生变化
        输出的位置为随机的,不一定按照保存位置的顺序输出
         */
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);

        /*
        boolean addAll(Collection c)
        将给定集合的所有元素添加到当前集合中,添加后集合发生了变化则返回true
         */
        c1.addAll(c2);
        System.out.println("c1:"+c1);

        /*
        c1.add(c2);
         System.out.println("c1:"+c1);
        这个操作是将c2当做一个元素添加到c1集合中,此时c1集合包含4个元素,三个字符串类型元素和一个Hashset类型的元素
                因此并非将c2所有元素添加到c1中
                */

        Collection c3=new ArrayList();
        c3.add("android");
        c3.add("java");
        System.out.println("c3:"+c3);

        c1.containsAll(c3);
        System.out.println(c3);
        System.out.println();

        /*
        boolean containsAll();
        判断当前集合是否包含给定集合中的所有元素,全包含则返回true
         */
        boolean containsAll=c1.containsAll(c3);
        System.out.println("全包含:"+containsAll);

        /*
        boolean comtains=c1.containsAll(c3);
        System.out.println("全包含:"+comtains);
        该操作是将c3当做一个元素看待,判断c1集合是否有一个集合类型的元素c3
        */

        /*
        删除当前集合中给定元素的共有元素
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);//c1中与c3共有的元素被删除了
        System.out.println("c3:"+c3);//c3不受影响


    }
}
