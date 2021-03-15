package Basic.Switch;
/**本类用于测试switch结构*/
/**总结:执行的顺序
 * 1.先拿到表达式的值(a),然后将a的值与case的值依次进行匹配
 * 2.当成功匹配到case的值后,会执行此case后的代码
 * 3.判断此行代码是否有break,如果有,结束执行,如果没有,会继续向后执行穿透所有case,包括default
 * 4.如果没有匹配到任何的case,只会执行default的代码
 **/
public class switchDemo {
    //1.创建入口函数main()
    public static void main(String[] args) {
        int a = 3;
        /**总结1:a 可以支持5种数据类型:byte short int char jdk1.5以后支持String*/
        switch(a) {
            //快速向下复制:Ctrl+Alt+向下键
            case 1 : System.out.println(1);
            case 2 : System.out.println(2); break;/**总结2:break表示结束当前的case,如果不加,向后穿透所有case*/
            case 3 : System.out.println(3);
            case 4 : System.out.println(4);
                /**总结3:defult是保底选项,可加可不加
                 * 如果在default之前有case正确匹配或者遇到了break,default不会执行
                 * 当没有case匹配到,default才会执行
                 * */
            default :System.out.println(0);
        }
        String s = "Monday";
        switch(s) {
            case "Monday" : System.out.println("星期一你好!"); break;
            case "Tuesday" : System.out.println("星期二你好!"); break;
            case "Wedsday" : System.out.println("星期三你好!"); break;
            case "Thursday" : System.out.println("星期四你好!"); break;
            case "Friday" : System.out.println("星期五你好!"); break;
            case "Saturday" : System.out.println("星期六你好!"); break;
            case "Sunday" : System.out.println("星期日你好!"); break;
            default:System.out.println("哪天都不是");
        }
    }
}
