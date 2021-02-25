package API.Exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在IO中使用异常处理机制
 */
public class FinallyDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try{
        fos=new FileOutputStream("fos.dat");
        fos.write(1);
        fos.close();
    }catch(IOException e){
            e.printStackTrace();
        } finally{
            try{
                if(fos!=null){
                    fos.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        }
}
