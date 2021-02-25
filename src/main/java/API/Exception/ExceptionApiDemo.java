package API.Exception;

/**
 * 异常常见用法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了....");


        String str = null;
        try {
            //快捷键:ctrl+alt+t
            str = "abc";
        } catch (Exception e) {
            //向控制台输出异常信息
            e.printStackTrace();
            String message=e.getMessage();
            System.out.println(message);
        }finally {

            System.out.println("程序结束了....");
        }


    }

    /**
     * 包装类
     * 包装类是为了解决基本类型不能直接参与面向对象开发的问题,使得基本类类型可以以对象的形式存在
     * 包装类都定义在Java.lang包中作为基础类使用,6个数字类型的包装类
     * 继承自number,其余两个继承自object
     */
    public static class integerdemo1 {
        public static void main(String[] args) {
        //基本类型转换为包装类
            int d=123;
        //    Integer i1=new Integer(d);
        //    Integer i2=new Integer(d);
            Integer i1=Integer.valueOf(d);
            Integer i2=Integer.valueOf(d);
            //Integer是idea定义的类,已经经历过了重写,所以内容是一样的
            //上面那种方式虽然也可以达到这种效果,但是Java不推荐,Java推荐的是下面这种
            System.out.println(i1.equals(i2));

            //包装类转换成基本类型
            int i=i1.intValue();//将包装类以int型返回
            //此时也可以返回为其他基本类型
            // 只要把intvalue换成doublevalue就可以了,只要不超过其范围
            System.out.println(i);

        }
    }
}
