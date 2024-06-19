package com.yy.hashcode;

import java.util.Hashtable;
import java.util.Map;

/**
 * @date 2024/5/9
 */
public class CompareDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean f = a == b;

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(f);
        boolean f1 = s1 == s2;
        System.out.println("f1 = " + f1);

        boolean f2 = s1.equals(s2);
        System.out.println(f2);

        Map<String, Object> hashtable = new Hashtable<>();
        hashtable.put(null, 123);
    }
}
