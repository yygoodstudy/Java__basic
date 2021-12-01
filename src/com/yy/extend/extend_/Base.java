package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 19:56
 */
public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base()...");
    }

    public void test100() {
        System.out.println("test100()...");
    }

    protected void test200() {
        System.out.println("test200()...");
    }

    void test300() {
        System.out.println("test300()...");
    }

    private void test400() {
        System.out.println("test400()...");
    }

    public int findN4() {
        return this.n4;
    }
}
