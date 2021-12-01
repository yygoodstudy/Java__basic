package com.yy.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Date 2021/9/1 20:33
 */
public class RandomAccessTest {
    public static void main(String[] args) throws IOException {
        File file = new File("demo");
        if (!file.exists()) {
            file.mkdir(); // 创建目录
        }
        File fileDemo = new File("demo", "test.txt");
        if (!fileDemo.exists()) {
            fileDemo.createNewFile(); // 创建该文件
        }
        RandomAccessFile raf = new RandomAccessFile(fileDemo,"rw");
        raf.write((byte)01111111);
        raf.write('A');
    }
}
