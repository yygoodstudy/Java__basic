package com.yy.extend.extend_;

/**
 * @date 2023/8/17
 */
public class A {
    private int i = 1;
    protected int j = 2;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void func() {
        System.out.println("a.func()....");
        System.out.println("i+j=" + (i + j));
    }
}

class B extends A {
    private int z;
    private int i = 3;
    protected int j = 4;

    public B(int i, int j) {
        super(i, j);
        this.i = i;
        this.j = j;
    }

    public B() {
        super(1, 3);
        System.out.println("B类无参构造方法执行2");
    }

    @Override
    public void func() {
//        System.out.println("b.func()....");
        super.func();
    }

    public void bm() {
        System.out.println("b.bm()...");
    }
}

class Main {
    public static void main(String[] args) {
        A a = new B(6, 6);
        a.func();
    }
}