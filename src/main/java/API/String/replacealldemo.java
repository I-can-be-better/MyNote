package API.String;



import java.util.Scanner;

/**
 * string支持正则表达式的方法之三
 *
 * string replaceAll(string Regex,string str)
 * 将当前字符串中满足正则表达式的部分替换
 */
public class replacealldemo {
    public static void main(String[] args) {
        String str="asd456fgh789vhn123";
        str.replaceAll("[0-9]+","#NUMBER#");
        //将当前字符串中的数字部分换成"#NUMBER#"
       // str=str.replaceAll("[0-9]+","");
        //将当前字符串中的数字部分换成空字符串
        System.out.println(str);

        //和谐用语:
        String regex="(wcnm|mdzz|cnm|nc|nt|dsb|fk)";
        String message="fk!你个nc!你就是个dsb!";
        message=message.replaceAll(regex,"***");
        System.out.println(message);

        //密码:
        System.out.print("请输入您的密码:");
        Scanner scan=new Scanner(System.in);
        String password=scan.next();
        password=password.replaceAll("[A-Za-z0-9]","*");
        System.out.println("您的密码是:"+password);
    }
}
