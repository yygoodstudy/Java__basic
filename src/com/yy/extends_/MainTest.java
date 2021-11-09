package com.yy.extends_;

/**
 * @Date 2021/9/13 20:32
 */
public class MainTest {

    public static void func(ClassA ca) {
        ca.print();
    }

        public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.testing();
        graduate.showInfo();

        ClassA ca = new ClassB();
        ca.print();
    }
}
