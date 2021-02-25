package API.map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.map查找表
 * map在Java中是非常常用的一种数据结构,他的样子像是一个多行两列的表格,其中左列成为key
 * 右侧成为value,map总是根据key获取对应的value
 *
 * 常用实现类:java.util.hashmap,散列表,当今查询速度最快的数据结构,使用散列算法
 * 实现
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        /*
        V put(K k,V v)
        将一组键值存入到当前map中
        由于map有一个要求:key不允许重复(使用key自身equals比较判定重复,与集合一致)
        因此如果使用已有的key存放value时则会替换value,返回值为被替换的value
        如果key不存在,则正常存入map,此时返回值为null

        当value的返回值是包装类时,获取该值应该当使用包装类类型的变量接收,不要使用对一的基本类型变量接收
        避免自动拆箱导致的空指针异常
         */
        //int value=map.put("语文",99);
        Integer value=map.put("语文",99);
        System.out.println("value = " + value);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        System.out.println(map);

        value=map.put("语文",80);
        System.out.println(map);
        System.out.println(value);//此时key被替换的value为99

        /*
        V get(K k)
        根据key获取的对应的value,如果给定的key不存在,则返回值为null
         */
        value=map.get("数学");
        System.out.println("数学" + value);
        value=map.get("体育");
        System.out.println("体育" + value);

        int size=map.size();//获取map的元素个数,一组为一个
        System.out.println("size:"+size);

        /*
        V remove(Object key)
        删除当前map中给定的key所对应的键值时,返回值为这个key所对应的value
          */
        value=map.remove("数学");
        System.out.println(map);
        System.out.println(value);
        //判断map是否包含给定的key
        boolean ck=map.containsKey("语文");
        //判断map是否包含给定的value
        boolean cv=map.containsValue(98);
        System.out.println("包含key:"+ck);
        System.out.println("包含value:"+cv);
    }
}
