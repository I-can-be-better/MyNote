package Basic.For;

/**
 * 需求:打印右直角三角型
 */
public class for_demo4 {
    public static void main(String[] args) {
        //输出5行
        for(int i=1;i<=5;i++){
            //空格三角
            for(int x=5;x>i;x--){
                System.out.print(" ");
            }
            //*号三角
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
