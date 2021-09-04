package com.yy.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Date 2021/9/1 20:45
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo/test.txt");
        FileOutputStream fis = null;
        try {
            fis = new FileOutputStream(file, true);
            fis.write(" SDFFFFK.@#$%^&* ~~~".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }
        System.out.println("写入成功~~~");

        System.out.println("---------------------------");
        readFile("C:\\Users\\Administrator\\Desktop\\JavaIO\\1.txt");
        System.out.println("---------------------------");
        printReadFile("C:\\Users\\Administrator\\Desktop\\JavaIO\\1.txt");
        System.out.println("--------------------------");
        readFile1("C:\\Users\\Administrator\\Desktop\\JavaIO\\1.txt");
    }

    /**
     * 读取文件
     *
     * @param fileName
     * @throws IOException
     */
    public static void readFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            System.out.print(b + " ");
            if (++i % 10 == 0) {
                System.out.println();
            }
        }
        fis.close();
    }

    public static void printReadFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] bytes = new byte[2 * 1024];
        StringBuilder sb = new StringBuilder();
        while (fis.read(bytes) != -1) {
            sb.append(new String(bytes, "UTF-8"));
        }
        System.out.println(sb);
        fis.close();
    }


    public static void readFile1(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        char[] chars = new char[10];
        StringBuilder sb = new StringBuilder();
        while (fr.read(chars, 0, chars.length) != -1) {
            sb.append(chars);
        }
        System.out.println(sb);

    }
}
