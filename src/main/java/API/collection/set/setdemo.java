package API.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set是一个不包含重复元素的Collection
 * 该集合中由于没有下标位置,所以数据是无序的
 * 常用来给数据去重
 * 本类用于测试set接口的方法
 */
public class setdemo {
    public static void main(String[] args) {
        //1.创建对象
        //Set s = new Set();//报错,Set是接口,接口不可以实例化,也就是创建对象
        Set<String> set = new HashSet<String>();

        //2.set集合数据存放测试
        set.add("牛气冲天");//向set集合添加数据
        set.add("牛气冲天");//向set集合添加重复的数据
        set.add("牛气冲天");//向set集合添加重复的数据
        set.add("虎虎生威");//向set集合添加数据
        //set.add("null");//向set集合添加字符串类型的null数据
        set.add(null);//向set集合添加数据null

        /**总结1:set集合中的元素都是无序的*/
        /**总结2:set集合中的元素不能重复*/
        /**总结3:set集合中可以存放null元素,也只允许存放0-1个*/

        System.out.println(set);//查看set集合中的元素

        //3.set集合常用方法测试
        //set.clear();//清空Set集合
        System.out.println(set.contains("小兔纸"));
        //false,判断set集合中是否包含指定元素"小兔纸"

        System.out.println(set.equals("牛气冲天"));
        //false,判断set集合对象与指定元素是否相等

        System.out.println(set.hashCode());
        //1961052313,获取当前set集合对象的哈希码

        System.out.println(set.isEmpty());
        //false,判断当前集合是否为空

        System.out.println(set.remove("null"));
        //false,移除指定元素,没有"null"元素,所以返回false

        System.out.println(set.remove(null));
        //true,成功移除指定元素null,所以返回true

        System.out.println(set);

        System.out.println(set.size());
        //2,获取当前set集合的元素个数,类似数组长度

        Object[] array = set.toArray();
        //把集合中的元素放入数组中

        System.out.println(Arrays.toString(array));
        //使用数组工具类查看数组中的元素

        //4.集合间的操作
        Set<String> set2 = new HashSet();
        set2.add("小老鼠");//给set2集合添加指定元素
        set2.add("小牛犊");//给set2集合添加指定元素
        set2.add("小脑斧");//给set2集合添加指定元素
        set2.add("小兔纸");//给set2集合添加指定元素
        System.out.println(set2);//查看set2集合中的元素

        System.out.println(set.addAll(set2));
        //true,把集合set2中的元素添加到set集合中,成功返回true

        System.out.println(set.containsAll(set2));
        //true,判断set集合中是否包含set2集合中的所有元素,如果包含返回true

        System.out.println(set.removeAll(set2));
        //ture,移除set集合中属于set2集合的所有元素

        System.out.println(set.containsAll(set2));
        //false,判断set集合中是否包含set2集合中的所有元素,不包含返回false

        System.out.println(set.retainAll(set2));

        /**retainAll()方法是取两个集合直接的公共部分,谁调用,影响谁*/
//      set.add("小海滕");
//      set2.add("小海滕");
//      System.out.println(set.retainAll(set));//set没变
//      System.out.println(set.retainAll(set2));//set剩set与set2的交集
//      System.out.println(set2.retainAll(set));//set2剩set2与set的交集
//      System.out.println(set);
//      System.out.println(set2);

        //5.集合的迭代
        Iterator<String> it = set2.iterator();//5.1获取集合的迭代器
        while(it.hasNext()) {//5.2判断集合是否有下个元素
            String s = it.next();//5.3如果有,进循环获取当前遍历到的元素
            System.out.println(s);
        }
    }
    }

