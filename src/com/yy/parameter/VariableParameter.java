package com.yy.parameter;

/**
 * @Date 2021/5/23 14:49
 * 可变参数:
 * 调用的时候可以传入0-n个此种类型的参数，或者是一个此种类型的数组
 */
public class VariableParameter {
    public static void main(String[] args) {
        // 1.传入0-n个int类型的数据
        System.out.println(sum(1));
        System.out.println("sum(1,2,3,4,5) = " + sum(1, 2, 3, 4, 5));
        System.out.println("sum(22,30) = " + sum(22, 30));
        System.out.println("sum() = " + sum());
        // 2.传入一个数组
        int[] arr = {0, 1, 2, 3};
        System.out.println("sum(arr) = " + sum(arr));

    }

    static int sum(int... numbers) { // 可变参数：参数的类型，参数名确定，但是参数的个数不确定；这种情况可以使用可变参数；
        // 可变参数使用规则：当作数组来使用
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
