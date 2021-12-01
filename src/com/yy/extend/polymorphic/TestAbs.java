package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 18:48
 */
public class TestAbs {
    public static void main(String[] args) {
        Abs child = new AbsChild();
        child.method1();
        child.method2();
    }
}
