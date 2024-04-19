package com.yy.java8.lambda_pro;

import java.util.function.Consumer;

/**
 * @date 2022/5/24
 */
public class TestValue {
    public static void main(String[] args) {
        Integer a = 11;
        Integer b = test1(11);
        test2();
    }

    public static Integer test1(Integer a) {
        a = 10;
        return a;
    }

    public static void test2() {
        Consumer tConsumer = System.out::println;
        tConsumer.accept("yaoYuan love zhangJie 1314");
    }
}
