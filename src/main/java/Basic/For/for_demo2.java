package Basic.For;
/**需求:利用for循环,打印左直角三角形*/
//行1星1 *
//行2星2 * *
//行3星3 * * *
//行4星4 * * * *
//行i星i * * * * *
public class for_demo2 {
    public static void main(String[] args) {
        for(int i = 1;i<6;i++) {//外循环
            for (int j = 1; j <=i; j++) {//内循环
                //注意:需要修改内循环的循环条件,让j的最大值随着i改变,否则写死了
                System.out.print("*");//在同一轮/同一行打印不换行
            }
            System.out.println();//空白行用来换行
        }
    }
}
