package API.Exception;

/**
 * 异常的抛出
 * throw关键字可以主动抛出一个异常,通常情况下会主动抛出异常
 * 1.当程序出现一个异常,但是该异常不应当在当前代码片段被解决时,
 * 可以抛给调用者解决
 * 2.程序遇到一个满足语法但是不满足业务逻辑的情况下,可以主动创建
 * 一个对应的异常将其抛给调用者告知这个情况
 */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        Person p = new Person();
         try{
            //语法满足,但是不满足业务的情况
        /*
        当调用一个含有throw生命异常抛出的方法时,编译器要求必须处理这个异常
        处理方式有两种:
        1.在当前方法上继续适用throw生命该异常的抛出给上层调用者处理
        2.使用try-catch捕获并处理这个异常
        具体使用哪种取决于异常处理的责任问题
         */
            p.setAge(100000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
             System.out.println("程序结束了!");
             System.out.println("age");
         }
    } }