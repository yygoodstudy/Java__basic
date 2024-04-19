package com.yy.java8;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description TODO
 * @Date 2022/9/2 21:14
 */
public class TestMethodRef {

    public static void main(String[] args) {
        Consumer<String> tConsumer = (x) -> System.out.println(x);
        PrintStream printStream = System.out;
//        printStream::print;
        List<String> strs = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        strs.forEach(x -> System.out.println(x));

        Employee employee = new Employee();
        employee.setName("张三");
        Supplier<String> supplier = employee::getName;
        String name = supplier.get();
        System.out.println("name = " + name);
    }
}
