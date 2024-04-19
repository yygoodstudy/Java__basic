package com.yy.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Date 2022/9/3 19:08
 */
public class StreamTest4 {
    public static void filter() {
        Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);
        stream.filter(x -> x > 5) // 过滤掉小于等于5的元素
                .distinct() // 去重
                .skip(2)   // 跳过前两个
                .limit(2)  // 取前两个
                .forEach(System.out::println);
    }

    public static void map() {
        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        list.stream().map(x -> x.replace(",", "")).forEach(System.out::println);
    }

    // 对每个元素进行操作
    public static void flatMap() {
        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        Stream<String> stringStream = list.stream().flatMap(x -> {
            String[] split = x.split(",");
            Stream<String> stream = Arrays.stream(split);
            return stream;
        });
        stringStream.forEach(System.out::println);
    }

    // sorted()排序：要实现comparable<T>接口
    public static void sorted() {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26, 10000d), new Employee("zhangsan", 13, 10000d),
                new Employee("lisi", 14, 10000d), new Employee("wangwu", 25, 10000d));
        employees.stream().sorted().forEach(System.out::println);
    }

    // 排序：自定义comparator接口
    public static void sortedWithComparator() {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26, 10000d), new Employee("zhangsan", 13, 10000d),
                new Employee("lisi", 14, 10000d), new Employee("wangwu", 25, 10000d),
                new Employee("yaoyuan", 25, 13000d));
        employees.stream().sorted((e1, e2) -> {
            if (e1.getName().length() == e2.getName().length()) {
                return Integer.compare(e1.getAge(), e2.getAge());
            } else {
                return Integer.compare(e1.getName().length(), e2.getName().length());
            }
        }).forEach(System.out::println);
    }

    /**
     * peek：如同于map，能得到流中的每一个元素。但map接收的是一个Function表达式，有返回值；而peek接收的是Consumer表达式，没有返回值
     */
    public static void peek() {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26, 10000d), new Employee("zhangsan", 13, 10000d),
                new Employee("lisi", 14, 10000d), new Employee("wangwu", 25, 10000d),
                new Employee("yaoyuan", 25, 13000d));
        employees.stream().peek(x -> x.setSalary(10000d)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        filter();
        map();
        flatMap();
        sorted();
        System.out.println("-----------");
        sortedWithComparator();
        System.out.println("-----------------------");
        peek();
    }
}
