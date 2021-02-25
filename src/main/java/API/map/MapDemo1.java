package API.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map的遍历
 * map提供了三种遍历方式
 * 1.遍历所有的key
 * 2.遍历每一组键值对
 * 3.遍历所有的value(相对不常用)
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        System.out.println(map);

        /*
        遍历所有的key
        set<key> keyset()
        将当前map中所有的key以一个set集合形式返回,遍历这个集合等同于遍历所有的key
         */
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            System.out.println("key = " + key);
        }

        /*
        遍历每一组键值对
        set <entry>entryset()
        将当前map中每一组键值对(一个entry实例表示一组键值对)都存入到set集合中

        java.util.map.entry他的每一个实例表示一组键值对
         */
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry<String,Integer> e:entrySet){
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println(key +":"+ value);
        }

        /*
        Collection <V>values()
        将当前map中所有value以一个collection形式返回
         */
        Collection<Integer> values=map.values();
        for(Integer value:values){
            System.out.println("value" + value);
        }
    }
}
