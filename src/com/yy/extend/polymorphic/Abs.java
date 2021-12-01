package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 18:47
 */
abstract class Abs {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void method1() {
        System.out.println(this.n1);
    }

    public abstract int method2();
}
