package com.yy.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2024/4/22
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            list.add(i);
            System.out.println(i);
        }

    }
}
