package API.IO.Byte;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将person对象写到文件中
 *
 * 对象流：java.io.ObjectOutputStream和ObjectInputStrean
 * 对象流是一对高级流，作用是进行对象的序列化与反序列话
 */
public class OOSDemo {
    public static  void main(String[] args) throws IOException {
        String name="苍老师";
        int age=18;
        String gender="女";
        String[]otherInfo={"是一名演员","来自岛国","促进中日文化交流","是启蒙老师"};
        Person person= new Person(name,age,gender,otherInfo);

        FileOutputStream fos=new  FileOutputStream("Person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        /*
        对象流输出提供了一个独有的方法:
        void writeobject(object obj)
        该发那个发可以将给定的对象按照其结构转化为一组字节后写出
        需要注意:该方法要求写出的对象必须实现序列化结构后,
        否则会抛出异常:Java.io.NotSerialiZableException

        将一个对象按照其结构转换为一组字节的过程成为对象序列化
        反之则称之为反序列化
         */
        oos.writeObject(person);
        System.out.println("写出对象完毕");
        oos.close();
    }
}
