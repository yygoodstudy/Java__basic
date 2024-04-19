package com.yy.io;

import java.io.File;

/**
 * @date 2024/4/17
 */
public class ReadFiles {

    public static void main(String[] args) {
        testLoopOutAllFileName("D:\\CF");
    }

    /**
     * 读取某个文件夹下的所有文件
     *
     * @param testFileDir 文件夹路径
     */
    private static void testLoopOutAllFileName(String testFileDir) {
        if (testFileDir == null) {
            // 因为new File(null)会空指针异常,所以要判断下
            return;
        }
        File[] testFile = new File(testFileDir).listFiles();
        if (testFile == null) {
            return;
        }
        for (File file : testFile) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else if (file.isDirectory()) {
                System.out.println("-------this is a directory, and its files are as follows:-------");
                testLoopOutAllFileName(file.getPath());
            } else {
                System.out.println("文件读入有误！");
            }
        }
    }


}