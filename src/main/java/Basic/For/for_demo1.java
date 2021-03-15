package Basic.For;
/**本类用于测试嵌套for循环*/
public class for_demo1 {
    public static void main(String[] args) {
        /**总结1:外层循环执行1次(控制轮数),内层循环执行多次(在每轮中执行的次数)*/
        //外层循环打印1 2 3
        for (int i = 1; i < 4 ; i++) {//外层循环控制的是执行的轮数,循环3次,执行3轮
            System.out.println("外层"+i+"轮");
            //内层循环打印1 2 3 4 5
            for (int j = 1; j < 6; j++) {//内层循环控制的是每轮执行的次数,循环5次,每轮执行5次
                System.out.println("内层循环第"+j+"次");
            }
        }

        System.out.println("****************打印矩形*********************************");
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();//空白行用来换行
        }
    }
}
