package Basic.For;

public class for_demo5 {
    public static void main(String[] args) {
        //打印5行
        for(int i=1;i<=5;i++){
            //打印空格的倒三角
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }

            //打印*号的正三角
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
