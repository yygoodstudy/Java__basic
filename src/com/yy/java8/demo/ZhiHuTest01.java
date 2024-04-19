package com.yy.java8.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @date 2023/8/17
 */
public class ZhiHuTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
    }
}
