package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 18:39
 * <p>
 * 接口: 必须是public interface 修饰
 * 方法必须是public static 修饰
 * 属性必须是：public static final
 */
public interface Inter {
    void show();
}

abstract class Clazz {
    private int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void method1() {
        System.out.println(this.n1);
    }

    public abstract int method2();
}