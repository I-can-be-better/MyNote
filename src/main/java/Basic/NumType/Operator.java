package Basic.NumType;

/**
 * 本类用于测试运算符自增自减
 */
public class Operator {
    public static void main(String[] args) {
        //前缀式,符号在前,先变化,再使用
        //后缀式,符号在后,先使用,再变化
        int a = 1;
        System.out.println(a++);//打印结果是1,打印完以后,再变化,自增成2
        int b = 1;
        System.out.println(++b);//打印结果是2,因为符号在前,先自增

        //注意,后面的代码会受到前面代码的影响,此处a的初始值是2
        System.out.println(++a + a + b++);//3+3+2=8,因为b++是后缀式,当打印完8以后b才自增成3
        int c = 1;
        System.out.println(c--);//打印结果:1,打印完以后c才自减成0
        int d = 1;
        System.out.println(--d);//打印结果:0,--在前,先自减,再打印使用

        //因为受之前代码的影响,c的初始值是0
        //大家可以分步测试,为了保证符合运算思路,测一个注释一个
        //System.out.println(--c);
        //System.out.println(--c-c);
        System.out.println(--c - c - c--);//-1-(-1)-(-1)=1
    }
}
