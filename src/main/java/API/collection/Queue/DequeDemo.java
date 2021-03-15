package API.collection.Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口是双端口队列,它继承自Queue
 * 双端队列是队列两端都可以做出入队列的操作
 * 常用实现类:java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);

        deque.offerFirst("what");
        deque.offerLast("go");
        System.out.println(deque);

        deque.poll();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
