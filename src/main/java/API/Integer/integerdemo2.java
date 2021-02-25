package API.Integer;

/**
 * 包装类常见功能
 */
public class integerdemo2 {
    public static void main(String[] args) {
        //获取int 最大值
        int imax=Integer.MAX_VALUE;
        int imin=Integer.MIN_VALUE;
        System.out.println(imax);

        /*
        包装类提供了一个静态方法parseXXX(String line)
        可以将字符串解析为对应的基本数据类型.但是前提是该字符串正确描述了基本数据类型可以保存的值.
        否则会抛出异常:Java.lang
         */
        String line="123";
        int i=Integer.parseInt(line);
        System.out.println(i);
        double d=Double.parseDouble(line);
        System.out.println(d);
    }
}
