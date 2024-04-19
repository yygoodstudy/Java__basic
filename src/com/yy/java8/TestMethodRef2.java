package com.yy.java8;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Description TODO
 * @Date 2022/9/2 23:27
 */
public class TestMethodRef2 {
    public static void main(String[] args) {

        // 1.匿名内部类写法
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                if (o instanceof Employee) {
                    Employee employee = (Employee) o;
                    System.out.println(employee.getName());
                }
            }
        };
        Employee employee = new Employee();
        employee.setName("zhangsan");
        consumer.accept(employee);

        // 2.lambda表达式
        Consumer<String> consumer1 = (x) -> System.out.println(x);
        consumer1.accept("hello");

        // 3.lambda表达式简写形式
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("world");
        testComparator();
        System.out.println("------------------------");
        testSupplier();
    }

    public static void testComparator() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare = comparator.compare(1, 2);
        System.out.println(compare);

        Comparator<Integer> handler = (x, y) -> Integer.compare(x, y);
        int compare1 = handler.compare(2, 1);
        System.out.println("compare1 = " + compare1);

        Comparator<Integer> compare2 = Integer::compare;
        int compare3 = compare2.compare(2, 2);
        System.out.println("compare3 = " + compare3);

        System.out.println("----------------");
        testFunction();

    }

    static void testFunction() {
        Function<Employee, String> function = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        Employee employee = new Employee();
        employee.setName("lisi");
        String apply = function.apply(employee);
        System.out.println("apply = " + apply);

        Function<Employee, String> function1 = (Employee e) -> e.getName();
        String apply1 = function1.apply(employee);
        System.out.println("apply1 = " + apply1);

        Function<Employee, String> function2 = Employee::getName;
        String apply2 = function2.apply(employee);
        System.out.println("apply2 = " + apply2);
    }

    static void testSupplier(){
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return String.valueOf(3);
            }
        };
        String s = supplier.get();
        System.out.println("s = " + s);

        Supplier<String> supplier1 = () -> "abc";
        String s1 = supplier1.get();
        System.out.println("s1 = " + s1);
    }
}
