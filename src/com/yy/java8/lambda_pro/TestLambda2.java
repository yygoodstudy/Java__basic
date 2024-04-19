package com.yy.java8.lambda_pro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date 2022/5/24
 */
public class TestLambda2 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("张三", 13, 1000.00),
                new Employee("张洁", 27, 1300.00),
                new Employee("姚远远", 29, 1300.00),
                new Employee("李小璐", 39, 200000.00),
                new Employee("杨幂", 42, 500000.00));
//        filterEmployee(employees);
        List<Employee> collect = employees.stream().filter(x -> x.getName().contains("张") || x.getName().contains("远")).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    public static void filterEmployee(List<Employee> employees, Comparator<Employee> comparator) {
        Collections.sort(employees, (x, y) -> {
            if (x.getAge() == y.getAge()) {
                return x.getName().compareTo(y.getName());
            } else
                return x.getAge() - y.getAge();
        });
    }
}