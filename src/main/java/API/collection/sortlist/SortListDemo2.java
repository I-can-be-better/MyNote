package API.collection.sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ada");
        list.add("Tom");
        list.add("Rose");
        list.add("sha");
        list.add("panda");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<String>str=new ArrayList<>();
        str.add("笑着玛利亚");
        str.add("苍老师");
        str.add("饭老师");
        str.add("盘他");
        System.out.println(str);
        //按照字符多少排序
       /*Collections.sort(str,new Comparator<String>(){
           public int compare(String s1,String s2){
               return s1.length()-s2.length();
           }
               }
       );*/
        Collections.sort(str,(s1,s2)->
                s1.length()-s2.length()
                );

       }

    }



