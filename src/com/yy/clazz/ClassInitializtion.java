package com.yy.clazz;

import java.util.Random;

/**
 * @Date 2021/6/6 17:55
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitializtion.random.nextInt(1000); // 编译器常量

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitializtion {
    public static Random random = new Random(47);
    Number number;

    public static void main(String[] args) {
        Class<Initable> initableClass = Initable.class; // 不会初始化类(执行静态代码块)
        System.out.println("After creating Initable");
        System.out.println(Initable.staticFinal);
        System.out.println("Initable.staticFinal2 = " + Initable.staticFinal2);
        System.out.println("-------------------");
        System.out.println("Initable2.staticNonFinal = " + Initable2.staticNonFinal);
        System.out.println("-----------------");
        try {
            Class<?> aClass = Class.forName("com.yy.clazz.Initable3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After creating Initable3");
        System.out.println("Initable3.staticNonFinal = " + Initable3.staticNonFinal);
//        Class<Number> intClass = int.class;
//        intClass = double.class;
        System.out.println("----------------");
        Class<? super Integer> superclass = Integer.class.getSuperclass();
        System.out.println("int.class.getCanonicalName() = " + int.class.getCanonicalName());
        System.out.println("Integer.class.getCanonicalName() = " + Integer.class.getCanonicalName());
        System.out.println("superclass.getCanonicalName() = " + superclass.getCanonicalName());
        System.out.println("------------------");
        Class<?> class1 = int.class;
        System.out.println("class1.getName() = " + class1.getName());
        class1 = double.class;
        System.out.println("class1.getName() = " + class1.getName());

    }
}
