package Basic.For;
/**本类用于完成99乘法表*/
//1*1=1
//2*1=2 2*2=4
//3*1=3 3*2=6 3*3=9
//4*1=4 4*2=8 4*3=12 4*4=16
//5*1=5 5*2=10 5*3=15 5*4=20 5*5=25
//6*1=6 6*2=12 6*3=18 6*4=24 6*5=30 6*6=36
//7*1=7 7*2=14 7*3=21 7*4=28 7*5=35 7*6=42 7*7=49
//8*1=8 8*2=16 8*3=24 8*4=32 8*5=40 8*6=48 8*7=56 8*8=64
//9*1=9 9*2=18 9*3=27 9*4=36 9*5=45 9*6=54 9*7=63 9*8=72 9*9=81
public class for_demo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//控制行数,打印9行
            for (int j = 1; j <= i; j++) {//控制列数,i行打印i列
                //System.out.println("*");--打印左直角三角形
                //System.out.println("2*3=6");2--i 3--j 6--i*j
                System.out.print(i+"*"+j+"="+(i*j)+" ");//拼接打印算式,后面加一个空格
            }
            System.out.println();//空白行用来换行
        }
    }
}