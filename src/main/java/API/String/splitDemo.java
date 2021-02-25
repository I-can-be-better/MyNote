package API.String;

/**
 * string支持正则表达式的方法之一
 *
 * string[] split(string regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分,将拆分的所有部分以一个string数组的形式返回
 */
public class splitDemo {
    public static void main(String[] args) {
        String str="123zug,ba.sd463.41q,we48.54z,xf";
        String[] arr=str.split("[0-9]+");
        //按照数字部分拆分
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String[] are=str.split(",");
        System.out.println(are.length);
        for(int j=0;j<are.length;j++){
            System.out.println(are[j]);
        }
        String [] a=str.split(".");
        System.out.println(a.length);
        for(int b=0;b<a.length;b++){
            System.out.println(a[b]);
        }
        /**
         * 当遇到连续出现可拆分项时,中间会拆分出一个空字符串.
         * 如果字符串最开始就是可拆分项,则拆分后的第一项是空字符串
         *
         * 注意:如果字符串末尾连续出席可拆分项
         */


    }
}
