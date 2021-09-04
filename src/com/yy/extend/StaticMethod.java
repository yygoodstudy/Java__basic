package com.yy.extend;

/**
 * @Date 2021/7/20 8:32
 */
public class StaticMethod {

    static {
        System.out.println("StaticMethod静态方法.....");
    }

    public StaticMethod() {
        System.out.println("StaticMethod....构造方法");
    }

    {
        System.out.println("StaticMethod实例代码块");
    }
}

class StaticMethodChild extends StaticMethod {
    static {
        System.out.println("Child的静态代码");
    }

    {
        System.out.println("Child的实例代码");
    }

    public static void main(String[] args) {
        new StaticMethodChild();
    }
}

