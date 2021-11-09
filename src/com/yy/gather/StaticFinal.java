package com.yy.gather;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2021/10/16 18:33
 */
public class StaticFinal {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            names.add("hello" + i);
        }
        Object[] objects = names.toArray();
        ArrayList<String> strings = new ArrayList<>(names);
    }
}

class Demo {
    static final Object[] element = {};

}