package com.yy.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Date 2022/9/3 0:33
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26,10000d), new Employee("zhangsan", 13,10000d),
                new Employee("lisi", 14,10000d), new Employee("wangwu", 25,10000d));
        List<Employee> employeeList = employees.stream().filter(x -> x.getAge() < 20).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

        List<Employee> collect = employees.stream().limit(2).collect(Collectors.toList());
        collect.forEach(System.out::println);

        boolean b = employees.stream().allMatch(x -> x.getAge() > 20);
        System.out.println("b = " + b);

//        Employee employee = employees.stream().findFirst().get();
//        System.out.println("employee = " + employee);

        Employee employee1 = employees.stream().findAny().get();
        System.out.println("employee1 = " + employee1);

        boolean b1 = employees.stream().anyMatch(x -> x.getName().length() > 6);
        System.out.println("b1 = " + b1);
        System.out.println("---------------");
        String maxLengthStr = getMaxLengthStr();
        System.out.println("maxLengthStr = " + maxLengthStr);

        String str = getMaxLengthStrByLambda();
        System.out.println("str = " + str);

        System.out.println("----------------");
        System.out.println(getMaxNumber());

        System.out.println("=======================");
        System.out.println("getEmployeeByAge() = " + getEmployeeByAge());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        toUpperCase();
    }

    public static String getMaxLengthStr() {
        List<String> strings = Arrays.asList("zhangsan", "lisi", "asfsdfsdfsdfdsfs", "wangwu", "zhaoliu", "wangmazi", "888888000");
        int max = 0;
        String str = "";
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
                str = string;
            }
        }
        return str;
    }

    public static String getMaxLengthStrByLambda() {
        List<String> strings = Arrays.asList("zhangsan", "lisi", "asfsdfsdfsdfdsfs", "wangwu", "zhaoliu", "wangmazi", "888888000");
        String s = strings.stream().max((x, y) -> x.length() - y.length()).get();
        return s;
    }

    /**
     * stream().max(Comparator) :求最大值
     *
     * @return
     */
    public static Integer getMaxNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4000, 100, 99);
//        Integer max = numbers.stream().max((x, y) -> Integer.compare(x, y)).get();
        Integer max = numbers.stream().max(Integer::compare).get();
        return max;
    }

    public static Employee getEmployeeByAge() {
        List<Employee> employees = Arrays.asList(new Employee("zhaoliu", 26,10000d), new Employee("zhangsan", 13,10000d),
                new Employee("lisi", 14,10000d), new Employee("wangwu", 25,10000d));
        Employee employee = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("年龄最大的员工是：" + employee);
        return employee;
    }

    public static void toUpperCase(){
        List<String> strings = Arrays.asList("zhangsan", "lisi", "asfsdfsdfsdfdsfs", "wangwu", "zhaoliu", "wangmazi", "888888000");
        strings.stream().map(x->x.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
