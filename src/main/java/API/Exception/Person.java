package API.Exception;

/**
 * 使用当前类测试异常的抛出
 */
public class Person {
    private int age;
    public int getAge() {
        return age;
    }

    /**
     * 当一个方法中使用throw生命异常抛出时,调用该方法的代码就必须处理这个异常
     * @param age
     * @throws Exception
     */
    public void setAge(int age) throws Exception {
        if(age<0||age>=100){
            /*
            超出合理范围则对外抛出一个异常
            throw new RuntimeException("年龄不合理!");

             当一个方法中使用throw抛出一个异常时,就要求在当前方法中使用throw声明该抛出的异常.
             就有RuntimeException是个例外
             */
            throw new Exception("年龄不合理!");
        }
        this.age=age;
    }





    public static void main(String[] args) {

    }
}
