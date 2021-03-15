package API.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 队列可以保存一组元素,但存取元素必须遵循先进先出的原则
 *
 * java.util.Quene接口,是队列接口
 * Queue继承自Collection,常用实现类:java.util.LinkedList
 */
public class QueneDemo {
    public static void main(String[] args) {
/*
由于LinkedList内部是由链表实现的,而链表结构首尾增加删除元素性能好,
因此java让LinkedList作为Queue的实现类使用
 */
        Queue<String> queue=new LinkedList<>();
        //offer:入列操作
        queue.offer("you");
        queue.offer("jump");
        queue.offer("i");
        queue.offer("run");
        queue.offer("你自己跳别带上我");
        System.out.println(queue);


   //poll:出列操作
        String str=queue.poll();
        System.out.println(queue);

        //peek:应用队首元素
        str=queue.peek();
        System.out.println("str = " + str);
        System.out.println(queue);

        //遍历可以获取队列每一个元素,并且不影响元素在队列中
        System.out.println("size:"+queue.size());
        for(String s:queue){
            System.out.println(s);
        }
        //使用poll方法遍历则是一次性的
        while (queue.size()>0){
            str=queue.poll();
            System.out.println(queue);
        }






    }
}
