package com.yy.collection.list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @date 2024/4/22
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("yao yuan");
        strings.add("zhang ji");
        strings.add("zhang san");

        System.out.println(strings);
        String s = strings.get(1);
        System.out.println(s);

        Deque deque = new LinkedList();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        deque.push("d");
        System.out.println("deque = " + deque);
    }
}
