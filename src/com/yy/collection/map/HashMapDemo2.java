package com.yy.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/5/16
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("邓超", "book");
        map.put("王荣", "abc");
        map.put("张洁", "hesdfs");
        map.put("姚远", "2342");
        map.put("1333", "hello");
        map.put(null, null);
        map.put(null, "张三");
        map.put("abc", null);

        System.out.println(map);
        String name = map.get("张洁");
        Set<String> strings = map.keySet();
        System.out.println("strings = " + strings);

        Collection<String> values = map.values();
        System.out.println("values = " + values);

        boolean b = map.containsKey(null);
        System.out.println("b = " + b);

        boolean b1 = map.containsValue("2342");
        System.out.println("b1 = " + b1);
        System.out.println("name = " + name);

        System.out.println("map.remove(\"姚远\") = " + map.remove("姚远")); // remove方法返回的是删除的键对应的value值
        map.clear();

        System.out.println("map = " + map);
    }
}

class Book {
    private String name;
    private Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
