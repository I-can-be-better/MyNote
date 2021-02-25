package API.Exception;

/**
 * 年龄不合法:当年龄不合法时,会抛出IllegalAgeException异常
 * 自定义异常,通常用来说明满足于法但是不满足实际业务问题的异常
 * 自定义异常的类名要做到见名知意,并且提供继承自Exception(直接火箭均可)
 * 然后将Exception中的所有构造方法提供出来,不需要书写业务逻辑方法
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
