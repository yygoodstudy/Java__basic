package com.yy.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/5/13
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("柳岩", 18);
        map.put("杨幂", 16);
        map.put("张洁", 27);
        map.put("姚远", 22);
        map.put("姚远", 39);

        int index = hash("张洁");
        int hashed = hash("姚远");
        System.out.println("index = " + index);
        System.out.println("hashed = " + hashed);

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
