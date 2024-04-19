package com.yy.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @date 2022/5/14
 */
public class FilesDemo {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Administrator\\Desktop\\面试反馈.txt"));
        for (String line : lines) {
            System.out.println("line = " + line);
        }
    }
}
