package com.yy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Date 2021/9/4 15:55
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        fileCopy("C:\\Users\\Administrator\\Desktop\\JavaIO\\1.txt", "C:\\Users\\Administrator\\Desktop\\JavaIO\\4.txt");
    }

    public static void fileCopy(String fileName1, String fileName2) throws IOException {
        File file1 = new File(fileName1);
        if (!file1.exists()) {
            file1.createNewFile();
        }
        File file2 = new File(fileName2);
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        byte[] bytes = new byte[100];
        int b;
        while ((b = fis.read(bytes, 0, bytes.length)) != -1) {
            fos.write(bytes, 0, b);
        }
        fos.close();
        fis.close();
    }

}
