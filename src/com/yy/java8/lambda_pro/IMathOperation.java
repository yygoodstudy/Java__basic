package com.yy.java8.lambda_pro;

/**
 * @date 2023/8/17
 */
@FunctionalInterface
public interface IMathOperation {

    int operation(int a, int b);
}

class Main {
    public static void main(String[] args) {
        IMathOperation operation = Integer::sum;
        int operation1 = operation.operation(1, 2);

    }
}