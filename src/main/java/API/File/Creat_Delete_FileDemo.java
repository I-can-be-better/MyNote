package API.File;

import java.io.File;
import java.io.IOException;

/*
使用file创建/删除一个文件
 */
public class Creat_Delete_FileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下创建一个文件
        File file=new File("./text001.txt");
        if(file.exists()){
            System.out.println("该文件已存在!");
        }else{
            file.createNewFile();
            System.out.println("该文件已创建!");
        }

        if(file.exists()){
            file.delete();
            System.out.println("该文件已删除!");
        }else{
            System.out.println("该操作无效!");
        }
    }
}
