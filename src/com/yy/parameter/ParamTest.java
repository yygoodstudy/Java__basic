package com.yy.parameter;

/**
 * @Date 2021/5/23 13:26
 * 方法的参数传递机制
 * 形参的数据类型是（基本数据类型），实参给形参的是数据值，形参修改了，和实参无关
 * 形参的数据类型是(引用数据类型)，实参给形参的是地址值，形参通过这个地址值改变了堆中的成员变量，
 * 会影响实参。实参和形参指的是同一块堆中的内存区域
 * 但是需要注意：形参是否有指向新的堆内存地址。如果有和实参就无关了。
 */
public class ParamTest {

    public static void main(String[] args) {
        int a = 5;
        ParameterPassing.change(a);
        System.out.println("a = " + a);

        int[] arr = {1, 2, 3, 4, 5};
        ParameterPassing1.change2(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        ParameterPassing2 p2 = new ParameterPassing2();
        p2.x = 1;
        change(p2); // 因为change中的p2指向了新的内存地址
        System.out.println("p2.x = " + p2.x);
    }

    static void change(ParameterPassing2 passing2){
        passing2 = new ParameterPassing2();
        passing2.x = 3;
    }
}

class ParameterPassing {
    public static void change(int i) {
        i *= 2;
    }
}

class ParameterPassing1 {
    public static void change2(int[] arr) {
        arr[0] = 2;
    }
}

class ParameterPassing2{
    int x;
}
