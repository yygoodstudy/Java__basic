package com.yy.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021/8/31 23:36
 */
public class FileDemo {

    public static List<String> names = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // 表示一个抽象的文件或目录
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaIO");
        // 判断文件或目录是否存在
        boolean exists = file.exists();
        if (!exists) {
//            file.mkdir(); // 创建文件夹
            file.createNewFile(); // 创建一个新文件
        } else {
            boolean delete = file.delete();
            System.out.println("delete = " + delete);
        }

        // 是否是一个目录
        System.out.println("file.isDirectory() = " + file.isDirectory());
        // 是否是一个文件
        System.out.println("file.isFile() = " + file.isFile());

        System.out.println("file = " + file);
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getParent() = " + file.getParent());

        System.out.println("-----------获取给定目录中的所有文件------------");

        List<String> file1 = findFile("D:\\CF");
        for (String s : file1) {
            System.out.println(s);
        }
    }

    /**
     * 找出目录中的所有文件
     */
    public static List<String> findFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.isFile()) { // 判断给定的资源路径是否是一个文件
                names.add(file.getName());
            } else { // 如果不是文件
                File[] files = file.listFiles(); // 获取该目录的所有的子文件/目录
                for (File childrenFile : files) { // 遍历
                    findFile(childrenFile.getAbsolutePath());
                }
            }
        } else {
            throw new Exception("文件或者目录不存在!@!@");
        }
        return names;
    }

}
