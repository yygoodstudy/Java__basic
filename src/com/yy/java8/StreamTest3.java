package com.yy.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Date 2022/9/3 1:25
 */
public class StreamTest3 {

    private static void testStreamMap() {
        List<Integer> list = Arrays.asList(1, 17, 27, 7);
        List<Integer> collect = list.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("====================");
        testMap1();
    }

    public static void testMap1() {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26, 10000d), new Employee("zhangsan", 13, 10000d),
                new Employee("lisi", 14, 12000d), new Employee("wangwu", 25, 14000d));
        List<Employee> employeeList = employees.stream().map(x -> {
            x.setSalary(x.getSalary() + 500);
            return x;
        }).collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testStreamMap();
    }
}
