package com.yy.java8;

import java.util.function.Predicate;

/**
 * @Date 2021/9/12 18:55
 */
public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate predicate = o -> "zhangSan".equals(o);

        System.out.println(predicate.test("lisi"));
        System.out.println(predicate.test("zhangSan"));
    }


}
