package API.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 本类用来完成Map集合相关练习
 * 需求:提示并接收用户输入的一串字符,并且统计出每个字符出现的次数
 * */
public class Map_Test {
    public static void main(String[] args) {
        //1.提示用户输入要统计的字符串
        System.out.println("请输入您要统计的字符串");
        //2.接收用户输入的要统计的字符串
        String input = new Scanner(System.in).nextLine();
        //3.获取到用户输入的每个字符,String底层维护的是char[]
        //创建map集合存放数据,格式:{b=2,d=4,g=3}
        Map<Character,Integer> map = new HashMap();
        //开始位置:0 - 数组的第一个元素
        //结束位置:<input.length() 或者 <=input,length()-1
        //如何变化:++
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);//获取一串字符中指定位置上的字符
            System.out.println("获取到的第"+(i+1)+"个字符:"+key);
            //4.统计每个字符出现的个数,存起来,存到map
            Integer value = map.get(key);//要先拿着key到map中找是不是有value
            if(value == null) {//如果判断为null,说明之前没有存过这个字符
                map.put(key, 1);//把当前的字符作为key存入,次数存1
            }else {
                map.put(key,value+1);//如果存过值,给之前的次数+1
            }
        }
        System.out.println("各个字符出现的频率为:");
        System.out.println(map);
    }
}
