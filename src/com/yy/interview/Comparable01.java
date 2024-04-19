package com.yy.interview;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @date 2024/4/6
 */
public class Comparable01 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ha");
        words.add("hallo");
        words.add("helloWorld");
        words.add("springMVC");
        words.add("springboot");

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }.reversed());
        System.out.println(words);

        words.sort((a, b) -> Integer.compare(a.length(), b.length()));

        words.sort((a, b) -> a.length() - b.length());

        words.sort(Comparator.comparingInt(String::length));




        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello world");
            }
        }).start();
    }
}
