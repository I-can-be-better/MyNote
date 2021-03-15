package Basic.Array.Array_two;
/**本类用于打印二维数组中的数据*/
public class test {
    public static void main(String[] args) {
        //1.创建二维数组

        //    3      5

        //a[0][0] a[0][1]

        //    7       9

        //[1][0] a[1][1]

        //    1       2      3

        //a[2][0] a[2][1] a[2][2]

        int[][] a = {{3,5},{7,9},{1,2,3}};



        //2.遍历二维数组

        for (int i = 0; i < a.length; i++) {

//          System.out.println(Arrays.toString(a[i]));

            for (int j = 0; j < a[i].length; j++) {

                //a[i][j]--根据外部数组的下标和内部数组的下标定位具体的元素

                System.out.print(a[i][j]);

            }

            System.out.println();

        }
    }
}
