package com.yy.io;

import java.io.*;

/**
 * @Date 2021/9/4 16:22
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("demo/test.properties");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fileOutputStream);
        dos.writeDouble(3.33d);
        dos.writeInt(3);
        dos.writeBoolean(false);
        dos.writeUTF("中国");
        dos.close();
        fileOutputStream.close();
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);


        System.out.println("dis.readInt() = " + dis.readInt());
    }
}
