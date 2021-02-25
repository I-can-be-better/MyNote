package API.Exception;

/**
 * 异常处理机制的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try {
            //try语句块中报错以下代码都不会执行
           //String str=null;
            //String name="";
            String str="abc";
        /*
        如果str为null,当虚拟机执行到下面的代码就会发现这里
        存在空指针异常,于是虚拟机会实例化一个空指针异常的实例
        并将其抛出,抛出后会检查报错的这句话是否被异常处理机制控制
        如果没有则会将该异常抛出当前方法外面,由调用该方法的代码去解决
        (这里相当于抛出到main方法外)
         */
            //System.out.println(name.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            //Integer.parseInt()以整数形式输出
        }catch(NullPointerException e){
            //catch是用来捕获try中出现的指针异常并予以解决
            System.out.println("出现空指针");
        }catch(StringIndexOutOfBoundsException e){
            //catch可以定义多个,当try不同异常有不同处理方理方式时可以捕获
            System.out.println("字符串下标越界了");
        }catch(Exception e){
            System.out.println("反正是错了,你看着办");
        }
        /*
        catch超类异常的意义:
        当try中某几类异常希望使用相同弄处理办法,可以catch这些异常的超类
        在最后一个catch初步或Exception也可以便面因为一个未处理的异常导致程序中断

        当多个catch的一场之间存在继承关系时,子类型异常要在上面先行补货,超累异常在下
        否则编译不通过
         */
        System.out.println("程序结束了.....");
    }
}
