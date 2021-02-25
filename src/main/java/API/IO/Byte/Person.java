package API.IO.Byte;

import java.io.Serializable;

/**
 * 使用当前类测试对象留的对象写操作
 *
 * 当一个类的实例对象希望被对象流进行读写时,该类必须实现接口:
 * Java.io.Serializable
 *
 * Serializable接口中没有任何抽象方法,这是一个签名接口,
 * 该接口是编译器敏感的结构,
 * 当编译器翻译一个类时如果这个类实现了序列化接口则会在
 * 编译后的.class文件中添加一个方法,作用是按照该类结构转换为一组字节
 * (对象刘就是依靠这个方法做对象序列化的)
 */

public class Person implements Serializable {
    private String name;
    private String adress;
    private String  gender;
    private int age;
    private transient String [] otherInfo;
    /*
    transient关键字可以在对象序列化是忽略该属性的值
    忽略不重要的属性可以达到对象序列化时的瘦身操作,减少资源开销
     */

    public Person(String name, int age, String gender, String[] otherInfo) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }
}
