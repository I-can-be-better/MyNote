package API.Exception;

import java.awt.*;
import java.io.IOException;

/**
 * 当子类重写超累中含有throw声明异常抛出的方法时,对throw的重写规则
 */
public class ThrowsDemo {
    public void dosome()throws IOException, AWTException {}

    class SubClass extends ThrowsDemo {
        //public void dosome()throws IOException,AWTException{}
        //允许不再抛出任何异常
        //public void dosome(){}
        //允许仅抛出部分异常
        //public void dosome () throws IOException{}
        //允许抛出超类方法抛出的异常的子类型异常
        //public void dosome()throws SQLException{}
        //不允许抛出超类中抛出的异常的超类型异常
    }
}
