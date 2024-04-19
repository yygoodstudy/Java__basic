package com.yy.java8.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Consumer:消费性接口，接收一个参数，消费，但无返回值
 *
 * @date 2023/8/17
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
    }
}

class SupplierDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> newNumbers = numbers.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(newNumbers);

        List<Integer> nums = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        nums.forEach(System.out::println);


        Map<Byte, Integer> collect = numbers.stream().collect(Collectors.toMap(Integer::byteValue, item -> item * 2, (val1, val2) -> val2));
        for (Map.Entry<Byte, Integer> byteIntegerEntry : collect.entrySet()) {
            Byte key = byteIntegerEntry.getKey();
            System.out.println("key = " + key);
            System.out.println("Value = " + byteIntegerEntry.getValue());
        }

        System.out.println("---------------------------------------");

        List<Book> books = Arrays.asList(new Book("Java编程思想", new BigDecimal("99.99"), "CODING"),
                new Book("Redis入门指南", new BigDecimal("55.00"), "CODING"),
                new Book("数据结构与算法分析", new BigDecimal("100.99"), "CODING"),
                new Book("中华上下五千年", new BigDecimal("50.50"), "HISTORY"),
                new Book("苏州河", new BigDecimal("12.699612312"), "MUSIC"));
        Map<String, List<Book>> booksMap = books.stream().collect(Collectors.groupingBy(Book::getType));
        Map<String, BigDecimal> decimalHashMap = new HashMap<>();
        booksMap.forEach((k, v) -> {
            // 对List<BigDecimal>求和
            BigDecimal sum2 = v.stream().map(Book::getPrice).collect(Collectors.toList()).stream().reduce(BigDecimal.ZERO, BigDecimal::add);
            // 然后在求平均值
            BigDecimal avg = sum2.divide(BigDecimal.valueOf(v.size()), RoundingMode.HALF_UP);
            decimalHashMap.put(k, avg);
        });
        decimalHashMap.forEach((k, v) -> System.out.println("书名：" + k + "，平均价格：" + v));
    }
}