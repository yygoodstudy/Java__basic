package com.yy.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Date 2021/9/12 15:02
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("醋溜白菜", 100.63, true));
        dishes.add(new Dish("凉拌黄瓜", 68.01, true));
        dishes.add(new Dish("凉拌黄瓜", 69.01, true));
        dishes.add(new Dish("红烧排骨", 333.55, false));
        dishes.add(new Dish("糖醋里脊", 366.66, false));
        dishes.add(new Dish("爆炒牛肚", 533.69, false));
        dishes.add(new Dish("红烧肉", 623.00, false));

        List<String> names = dishes.stream().map(d -> d.getName()).collect(Collectors.toList());
//        names.forEach(System.out::println);

        List<String> collect = dishes.stream().filter(d -> {
            System.out.println("filtering " + d.getName());
            return d.getCaloric() < 300;
        }).map(dish -> {
            System.out.println("mapping " + dish.getName());
            return dish.getName();
        }).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        long count = dishes.stream().filter(d -> d.isVegetable()).map(d -> d.getName()).distinct().count();
        System.out.println("count = " + count);

        System.out.println("---------------------");
        System.out.println(filterName());
        System.out.println("---------------------");

        dishFilter(dishes, d -> d.getCaloric() > 400 && !d.isVegetable());
        System.out.println("-----------------------");
//        streamMap(dishes);
        streamMap1(dishes);
        System.out.println("-----------------------");
        streamMap2();
        System.out.println("--------------");
        streamMap3();
        allMatch();
        reduce();

    }

    private static void dishFilter(List<Dish> dishes, Predicate<? super Dish> predicate) {
        dishes.stream()
                .filter(predicate) // 筛选
                .map(d -> d.getName()) //类似从MySQL表中查询一列信息的集合；从dishes列表中提取name
                .distinct() // 去重
                .limit(3) // 取前两个元素
                .skip(1) // 丢掉前1个元素
//                .collect(Collectors.toList()) //将筛选的结果组装成新的List --终端流的操作
                .forEach(System.out::println);

    }

    private static void streamMap(List<Dish> dishes) {
        dishes.stream()
                .map(Dish::getName)
                .map(d -> d.length())// 提取集合中每个字符串的长度，返回一个Stream<Integer>
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void streamMap1(List<Dish> dishes) {
        List<String> collect = dishes.stream()
                .map(d -> d.getName()).distinct()
                .map(d -> Arrays.asList(d.split("")))
                .flatMap(Collection::stream)//将各个生成流转化为单个流
                .distinct()
                .collect(Collectors.toList());
    }

    private static void streamMap2() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void streamMap3() {
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);
        List<Integer[]> collect = num1.stream()
                .flatMap(i -> num2.stream().filter(z -> (z + i) % 3 == 0).map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
        for (Integer[] integers : collect) {
            System.out.println(Arrays.asList(integers));
        }
    }

    private static void allMatch() {
        String[] names = {"zhangSan", "liSi", "wangWu", "zhaoLiu"};
        boolean b = Arrays.stream(names).allMatch(d -> d.length() == 5); // 所有都匹配才返回true
        System.out.println("b = " + b);
        boolean c = Arrays.stream(names).anyMatch(d -> d.length() == 4); // 有一个匹配就返回true
        System.out.println("c = " + c);
        boolean e = Arrays.stream(names).noneMatch(d -> d.length() == 3); // 没有一个匹配才返回true
        System.out.println("e = " + e);
        Arrays.stream(names).findFirst().ifPresent(d -> System.out.println(d)); // ifPresent()：Optional中包含值返回true
        Optional<String> first = Arrays.stream(names).filter(d -> "wangWu".equals(d)).findFirst();
        System.out.println("first = " + first.get());
        String s = Arrays.stream(names).findAny().get();
        System.out.println("s = " + s);
    }

    private static void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 3, 4, 4);
        Integer reduce = numbers.stream().reduce(1, (a, b) -> a * b);
        Optional<Integer> reduce1 = numbers.stream().reduce((a, b) -> a + b);
        reduce1.ifPresent(d -> System.out.println(d + "asvsdfs"));
        System.out.println("reduce = " + reduce);
        System.out.println("---------------------");
        System.out.println("numbers.stream().reduce(Integer::max).get() = " + numbers.stream().reduce(Integer::min).get());
        Integer size = numbers.stream()
                .map(d -> d = 1) // 将集合中的每个元素变为1
                .reduce(0, (a, b) -> (a + b));// 求和
        long count = numbers.stream().count();
        System.out.println("size = " + size + " " + count);
    }

    public static List<String> filterName() {
        String[] names = {"zhangSan", "liSi", "wangWu", "zhaoLiu"};
        List<String> nameList = Arrays.stream(names).filter(d -> d.equals("zhangSan")).collect(Collectors.toList());
        return nameList;
    }
}
