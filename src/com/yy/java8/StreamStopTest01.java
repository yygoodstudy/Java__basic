package com.yy.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description Stream流的终止操作
 * @Date 2022/9/3 20:05
 */
public class StreamStopTest01 {
    static List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26, 10000d), new Employee("zhangsan", 13, 10000d),
            new Employee("lisi", 14, 10000d), new Employee("wangwu", 35, 10000d),
            new Employee("yaoyuan", 25, 13000d));

    // 接收一个 Predicate 函数，当流中每个元素都符合该断言时才返回true，否则返回false
    public static void allMatch() {
        boolean b = employees.stream().allMatch(x -> x.getSalary() >= 11000d);
        System.out.println("b = " + b);
    }

    // 流中元素有任意一个满足条件返回true
    public static void anyMatch() {
        boolean b = employees.stream().anyMatch(x -> x.getSalary() == 13000d);
        System.out.println("b = " + b);
    }

    // 接收一个 Predicate 函数，当流中每个元素都不符合该断言时才返回true，否则返回false
    public static void noneMatch() {
        boolean b = employees.stream().noneMatch(x -> x.getAge() > 20);
        System.out.println("b = " + b);
    }

    public static void findFirst() {
        Employee employee = employees.stream().findFirst().get();
        System.out.println("first employee = " + employee);

        System.out.println("---------------------");
        long count = employees.stream().count(); // 统计集合中个数
        System.out.println("count = " + count);
        System.out.println("---------------------");

        employees.stream().limit(2).forEach(System.out::println); // limit：取list中前两个元素
        System.out.println("---------------------");

        employees.stream().skip(2).forEach(System.out::println); // 跳过前两个元素，取剩下的元素
        System.out.println("---------------------");

        Employee employee1 = employees.stream().min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("employee1 = " + employee1);

        System.out.println("=============================");
    }

    public static void findAny() {
        Employee employee2 = employees.stream().findAny().get();
        System.out.println("employee2 = " + employee2);
    }

    public static void reduce() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sum = list.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }

    public static void reduceBigDecimal() {

        List<User> list = new ArrayList<>();

        User user1 = new com.yy.java8.User();
        user1.setNum1(new BigDecimal(123));
        user1.setNum2(new BigDecimal(100));
        list.add(user1);

        User user2 = new User();
        user2.setNum1(new BigDecimal(200));
        user2.setNum2(new BigDecimal(100));
        list.add(user2);
//        BigDecimal sum = list.stream().map(User::getNum1).reduce(BigDecimal::add).get();
        BigDecimal sum = list.stream().map(User::getNum1).reduce(BigDecimal::max).get();
        System.out.println(sum);
    }

    public static void testMap() {
        List<User> list = new ArrayList<>();

        User user1 = new com.yy.java8.User();
        user1.setNum1(new BigDecimal(123));
        user1.setNum2(new BigDecimal(100));
        list.add(user1);

        User user2 = new User();
        user2.setNum1(new BigDecimal(100));
        user2.setNum2(new BigDecimal(100));
        list.add(user2);

        list.stream().map(x -> x.getNum1()).forEach(System.out::println);
    }


    public static void main(String[] args) {
//        allMatch();
//        anyMatch();
//        noneMatch();
//        reduce();
//        testMap();
        reduceBigDecimal();
    }
}
