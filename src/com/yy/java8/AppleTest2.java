package com.yy.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Date 2021/9/12 19:01
 */
public class AppleTest2 {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("green", 0.5), new Apple("red", 0.36),
                new Apple("yellow", 0.25), new Apple("green", 0.23));
        List<Apple> appleList = filterApple(apples, x -> x.getWeight() < 0.5);
        appleList.stream().map(d -> d.getWeight()).distinct().collect(Collectors.toList()).forEach(System.out::println);

        sortApples(apples, (o1, o2) -> (int) (o1.getWeight() - o2.getWeight())).stream().forEach(System.out::println);
    }

    public static List<Apple> sortApples(List<Apple> apples, Comparator<Apple> comparator) {
        Collections.sort(apples, comparator);
        return apples;
    }

    public static List<Apple> filterApple(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> newApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple))
                newApples.add(apple);
        }
        return newApples;
    }
}
