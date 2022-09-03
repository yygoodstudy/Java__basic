package com.yy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Date 2022/9/3 0:20
 */
public class StreamTest1 {
    public static void main(String[] args) {
        ArrayList<String> stars = new ArrayList<>();
        stars.add("zhangsan");
        stars.add("lisi");
        stars.add("wangwu");
        stars.add("zhaoliu");
        Stream<String> stream = stars.stream();
        stream.forEach(System.out::printf);

        Stream<Object> stream1 = Arrays.stream(stars.toArray());

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);

        // 创建无限流
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        List<Integer> collect = stream3.limit(3).collect(Collectors.toList());
        collect.forEach(System.out::println);
//        stream3.forEach(System.out::println);
    }
}
