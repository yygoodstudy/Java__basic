package com.yy.java8.lambda_pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @date 2022/5/24
 */
public class TestLambda1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("张三", 13, 1000.00),
                new Employee("张洁", 27, 1200.00),
                new Employee("姚远", 29, 1300.00),
                new Employee("李小璐", 39, 200000.00),
                new Employee("杨幂", 42, 500000.00));

        // 年龄大于35岁的员工
        List<Employee> employeeList = test3();
        System.out.println("年龄大于35岁的员工：" + employeeList);
        // 工资低于2000的员工
        List<Employee> employees1 = filterEmployees(employees);
        System.out.println("工资低于2000的员工：" + employees1);

        System.out.println("------------------------");
        // 优化方式1：策略设计模式
        List<Employee> list = filterEmployeeByPredicate(employees, new FilterEmployeeByAge());
        System.out.println("优化方式1：" + list);

        // 优化方式2：匿名内部类,代码比较臃肿
        List<Employee> employeeList1 = filterEmployeeByPredicate(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() >= 35;
            }
        });
        System.out.println("优化方式2匿名内部类方式：employeeList1 = " + employeeList1);
        List<Employee> employeeList2 = filterEmployeeByPredicate(employees, employee -> employee.getSalary() <= 2000);
        // 推荐使用lambda表达式的方式：代码简洁
        System.out.println("优化方式2lambda表达式：employeeList2 = " + employeeList2);

        System.out.println("-----------------------------");
        System.out.println("foreach的用法：");
        test4();

        // 优化方式4：Stream流
        System.out.println("=============================");
        employees.stream().filter(e -> e.getSalary() <= 2000).limit(2).forEach(System.out::println);
        System.out.println("=============================");

        // 找出所有员工的名字
        employees.stream().map(Employee::getName).forEach(System.out::println);

        test5();
    }

    // 1.匿名内部类写法
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
    }

    // 2.lambda表达式的写法
    public void test2() {
        Comparator<Double> comparator = (Double x, Double y) -> Double.compare(x, y);
    }

    // 3.找出员工中年龄大于35岁的
    public static List<Employee> test3() {
        List<Employee> employees = Arrays.asList(new Employee("张三", 13, 1000.00),
                new Employee("张洁", 27, 1200.00),
                new Employee("姚远", 29, 1300.00),
                new Employee("李小璐", 39, 200000.00),
                new Employee("杨幂", 42, 500000.00));

        List<Employee> emps = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > 35) {
                emps.add(employee);
            }
        }
        return emps;
    }

    // 4.找出工资低于2000的员工
    public static List<Employee> filterEmployees(List<Employee> employees) {
        List<Employee> emps = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() <= 2000) {
                emps.add(employee);
            }
        }
        return emps;
    }

    // 1.优化方式1
    public static List<Employee> filterEmployeeByPredicate(List<Employee> employees, MyPredicate<Employee> predicate) {
        List<Employee> emps = new ArrayList<>();
        for (Employee employee : employees) {
            if (predicate.test(employee))
                emps.add(employee);
        }
        return emps;
    }

    public static void test4() {
        List<Employee> employees = Arrays.asList(new Employee("张三", 13, 1000.00),
                new Employee("张洁", 27, 1200.00),
                new Employee("姚远", 29, 1300.00),
                new Employee("李小璐", 39, 200000.00),
                new Employee("杨幂", 42, 500000.00));
        employees.forEach(System.out::println);
    }

    public static void test5() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }).start();

        Runnable runnable = () -> System.out.println("Hello Lambda");
    }


}
