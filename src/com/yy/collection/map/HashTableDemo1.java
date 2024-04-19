package com.yy.collection.map;

import java.util.Hashtable;

/**
 * @date 2024/4/17
 */
public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("k1", "v1");
        ht.put("k2", "v2");
//        ht.put(null, "hello");
        ht.put("k3", null);
        System.out.println(ht);
    }
}
