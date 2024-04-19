package com.yy.collection.map;

import java.util.HashMap;

/**
 * @date 2024/4/16
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张洁", 28);
        hm.put("姚远", 28);
        hm.put("邓紫棋", 35);

        int size = 1 << 5;
        int a = 2 << 2;
        System.out.println("size = " + size);
        System.out.println("a = " + a);
    }
}
