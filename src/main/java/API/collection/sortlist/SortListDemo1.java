package API.collection.sortlist;

import API.collection.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 */
public class SortListDemo1 {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(2,3));
        list.add(new Point(3,4));
        list.add(new Point(4,5));
        list.add(new Point(5,6));
        list.add(new Point(6,7));
        System.out.println(list);

        /*
        该sort方法在排序是要求集合元素必须实现comparable接口,否则编译不通过
        当我们使用某个API的方法时,其要求我们位置改动其他地方的代码后才可以使用
        这种情况就具有侵入性,这不利于程序的后期维护
         */
        //Collections.sort(list);

        //MyComparator c=new MyComparator();
        //Collections.sort(list,c);

        //下面写法就解决了侵入性问题
      /* Collections.sort(list, new Comparator<Point>() {
           @Override
           public int compare(Point o1, Point o2) {
               int olen1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
               int olen2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
               return olen1-olen2;
           }
       });*/
        Collections.sort(list,(o1,o2)->
                o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                        o2.getX()*o2.getX()+o2.getY()*o2.getY()
    );//效果与上相同
        System.out.println(list);
    }
}

/*class MyComparator implements Comparator<Point>{
    *//**
     * compara方法用于定义o1与o2比较大小的规则
     * 返回值的规定:
     * 当返回值>0,则表示o1>o2
     * 当返回值<0,则表示o1<o2
     * 当返回值=0,则表示o1=o2
     *//*
    public int compara(Point o1,Point o2){
        int olen1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
        int olen2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
        return olen1-olen2;
    }
}*/
