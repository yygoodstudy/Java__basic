package com.yy.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @date 2024/4/16
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("ff");
        String s = strings.get(0);
        System.out.println("s = " + s);

        HashSet<String> names = new HashSet<>();
        names.add("zhangjie");
        names.add("yaoyuan");

        strings.addAll(1, names);
        System.out.println("strings = " + strings);
        strings.set(0, "hello");
        System.out.println("strings = " + strings);
        int size = strings.size();
        System.out.println("集合的长度 = " + size);
//        strings.clear(); // 清空集合
        List<String> newStrings = new ArrayList<>(strings);
        strings.stream().forEach(x -> {
            if ("safsdf".equals(x)) {
                newStrings.add("HHHH");
            }
        });

        strings = newStrings;
        System.out.println("strings = " + strings);

        List<String> strings1 = strings.subList(0, 3);
        System.out.println("strings1 = " + strings1);

        boolean zhangjie = strings.contains("zhangjie");
        System.out.println("zhangjie = " + zhangjie);
        System.out.println(strings.indexOf("zhangjie"));
        strings.add("ff");
        System.out.println("strings.indexOf(\"ff\") = " + strings.indexOf("ff"));
        System.out.println("strings.lastIndexOf(\"ff\") = " + strings.lastIndexOf("ff"));
        strings.remove("ff");
        System.out.println("strings = " + strings);
    }
}
