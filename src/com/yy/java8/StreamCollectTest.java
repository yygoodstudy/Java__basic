package com.yy.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description Stream流收集操作
 * @Date 2022/9/3 21:14
 */
public class StreamCollectTest {
    static List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 25, 10000d), new Employee("zhangsan", 13, 10000d),
            new Employee("lisi", 14, 10000d), new Employee("wangwu", 14, 10000d),
            new Employee("yaoyuan", 25, 13000d));

    public static void toMap() {
        Map<String, Integer> collect = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println(collect);
    }

    public static void stringJoin(){
        // 对所有员工的姓名进行一个操作
        String nameString = employees.stream().map(Employee::getName).collect(Collectors.joining(",","(",")"));
        System.out.println("nameString = " + nameString);

        // 将employees中的姓名生成新的stream流
        employees.stream().map(employee -> {
            employee.setName("x");
            return employee.getName();
        }).forEach(System.out::println);

        // 求最大年龄
        Integer maxAge = employees.stream().map(Employee::getAge).max(Integer::compare).get();
        System.out.println("maxAge = " + maxAge);

        // 求年龄的平均值
        double asDouble = employees.stream().mapToInt(Employee::getAge).average().getAsDouble();
        System.out.println("asInt = " + asDouble);

        // 分组
        Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("map = " + map);

    }

    public static void main(String[] args) {
//        toMap();
        stringJoin();
    }
}
