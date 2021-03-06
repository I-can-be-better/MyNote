package API.collection.Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素,但是存取元素必须遵循先进后出的原则
 * 使用栈通常用来完成如:后退,前进这样的功能
 *
 * Deque双端队列如果只调用从同一侧做出出入列操作时,就形成了栈结构,因此双端队列也为栈结构
 * 提供了经典的两个方法:入栈push,出栈pop
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack=new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        String str=stack.pop();
        System.out.println(str);
        System.out.println(stack);

        //使用新循环遍历
        while(stack.size()>0){
            stack.pop();
            System.out.println(stack);
        }
    }
}
