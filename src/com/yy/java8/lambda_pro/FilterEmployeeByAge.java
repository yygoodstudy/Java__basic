package com.yy.java8.lambda_pro;

/**
 * @date 2022/5/24
 */
public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }
}
