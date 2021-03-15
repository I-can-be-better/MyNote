package Basic.For;
/**本类用于测试for循环*/
public class for_demo {
    public static void main(String[] args) {
        //需求:打印0到10
        //for(开始条件;循环条件;更改条件){循环体;}
        //循环变量i --i代表的就是每次循环获取到的值
        //0 1 2 3 4 5 6 7 8 9 10
        //初始值:0  结束值:10 如何变化:+1 ++
        for(int i = 0;i<=10;i++) {
            System.out.println(i);
        }
        System.out.println("**********************");
        //需求:打印10-0
        //10 9 8 7 6 5 4 3 2 1 0
        //初始值:10 结束值:0 如何变化:-1 --
        for(int i = 10;i>=0;i--) {
            System.out.println(i);
        }
        System.out.println("**********************");
        //需求:打印8,88,888,8888,
        //8 88 888 8888
        //初始值:8 结束值:8888 如何变化*10+8:
        for(int i=8;i<=8888;i=i*10+8) {
            System.out.print(i+",");
        }
    }
}
