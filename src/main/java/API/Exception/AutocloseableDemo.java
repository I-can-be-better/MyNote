package API.Exception;

import java.io.*;

/**
 * JDK7之后,Java推出了一个新的特性:自动关闭
 */
public class AutocloseableDemo {
    public static <e> void main(String[] args) throws FileNotFoundException {

        try (
                //编译器编译会将try()里初始化的类在finally中调用close
                FileOutputStream fos = new FileOutputStream("fos.dat");

                //流连接初始化手法
                PrintWriter pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        new FileOutputStream("")
                                )
                        )
                )
        ) {
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
