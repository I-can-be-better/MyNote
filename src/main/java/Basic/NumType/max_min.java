package Basic.NumType;

/**
 * 本类用于查看基本类型的最大值最小值
 */
public class max_min {
    //必须要写入口函数,否则代码无法执行,因为没有入口
    public static void main(String[] args) {
        //进行整形类型的测试 byte1 short2 int4 long8
        //1.定义变量,用变量分别保存最大值与最小值
        //定义变量 数据类型 变量名 变量值 Ctrl+Alt+向下键 快速向下复制一行 换位置:Alt+方向键
        /**JAVA提供了对应的基本类型的工具箱*/
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byte类型的最大值是:" + byteMax);//127
        System.out.println("byte类型的最小值是:" + byteMin);//-128

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("short类型的最大值是:" + shortMax);//32767
        System.out.println("short类型的最小值是:" + shortMin);//-32768

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("int类型的最大值是:" + intMax);//2147483647
        System.out.println("int类型的最小值是:" + intMin);//-2147483648

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("long类型的最大值是:" + longMax);//9223372036854775807
        System.out.println("long类型的最小值是:" + longMin);//-9223372036854775808

        //浮点型测试 float double
        //1.4E-45(1.4乘以10的负45次方)
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("float类型的最大值是:" + floatMax);//3.4028235E38
        System.out.println("float类型的最小值是:" + floatMin);//1.4E-45

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("double类型的最大值是:" + doubleMax);//1.7976931348623157E308
        System.out.println("double类型的最小值是:" + doubleMin);//4.9E-324

        //布尔型boolean true真 false假
        boolean b1 = true;
        boolean b2 = false;

        //字符型char
        char c1 = 'a';//可以保存一个字符
        char c2 = 97;//可以保存一个数字
        char c3 = '中';//可以保存一个汉字
        //char类型可以存数字,但是在打印时,会去查ASCII码表,把数字对应的字符拿出来使用
        //ASCII码表值规定了数组0-127对应的字符,128-65535默认按照字符?来处理
        System.out.println(c1);//a
        System.out.println(c2);//a
        System.out.println(c3);//中
    }
}

