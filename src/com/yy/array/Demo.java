package com.yy.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Date 2021/7/29 0:13
 */
public class Demo {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int i1 = r.nextInt(30) + 1;
            if (i1 % 2 == 0) {
                numbers.add(i1);
            }
        }
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("hello world");
    }
}
