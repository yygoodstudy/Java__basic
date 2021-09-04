package com.yy.io;

import java.io.*;

/**
 * @Date 2021/9/4 17:13
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("demo/user.text");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
        User user = new User("周杰伦", 46, false);
        os.writeObject(user);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object o = ois.readObject();
        System.out.println(o);
    }
}
