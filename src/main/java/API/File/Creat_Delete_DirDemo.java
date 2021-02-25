package API.File;

import java.io.File;
import java.io.IOException;

/**
使用file创建目录
 */
public class Creat_Delete_DirDemo {
    public static void main(String[] args) throws IOException {
        File dir=new File("demo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else {
            dir.mkdir();
            //目录的创建
            System.out.println("该目录已创建!");
        }

        if(dir.exists()){
            dir.delete();
            /**
            单级目录的删除
            delete方法删除目录时要求该目录是一个空目录才可以
             */
            System.out.println("该目录已删除");
        }else {
            System.out.println("该目录不存在!");
        }

        File file1=new File("./A/B/C");
        if(file1.exists()){
            System.out.println("该文件已存在");
        }else{
            file1.mkdirs();
            /**
            创建多级目录
            当mkdir不加上s时,创建的是一个空的目录
             */
            System.out.println("该文件已创建!");
        }



       /**
         获取当前目录的所有子项
         boolean isFile1()
                //判断当前file是否是以一个文件
        boolean isDirectoty()
                //判断当前file是否是一个目录
         */
        File file2=new File(".");
         if(file2.isDirectory()){
             File[] arr=file2.listFiles();
             System.out.println(arr.length);
             for (int i=0;i<arr.length;i++){
                 System.out.println(arr[i].getName());
             }
        }


        }

    }

