package com.yy.parameter;

/**
 * 方法调用的内存分析：
 * 方法调用时，会在栈中开辟一块空间，用来存储这个方法的局部变量等信息
 * 按照调用的顺序，先调用的先'入栈'，后调用的后'入栈'
 * 方法调用结束，会有'出栈'的动作，释放内存空间
 *
 * 本例
 * （1）main方法最先入栈
 * （2）println()方法入栈
 *  (3)sum()方法入栈
 *  (4)sum()方法出栈
 *  (5)println()方法出栈
 *  (6)main()方法出栈
 */
public class MethodCall {
    // main方法后入栈，在栈底
    public static void main(String[] args) {
        // 发生方法的调用，传参就是给形参赋值的过程
        System.out.println(sum(500, 20));
    }

    // sum方法后入栈，在栈顶
    static int sum(int a, int b){ // 形参也是变量，而且是局部变量，在栈中开辟空间
        return a+b;
    }
}
