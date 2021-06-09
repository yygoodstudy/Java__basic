package com.yy.clazz;

/**
 * @Date 2021/6/6 17:18
 */
interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + "is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name:" + cc.getCanonicalName());
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.yy.clazz.FancyToy"); // 加载类，获取类信息
        } catch (ClassNotFoundException e) {
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
//        Class[] interfaces = c.getInterfaces();
        for (Class anInterface : c.getInterfaces()) {
            printInfo(anInterface);
        }
        Class superclass = c.getSuperclass();
        Object obj = null;
        try {
            obj = superclass.newInstance();
        } catch (InstantiationException e) {
            System.out.println("can't instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("can't access");
            System.exit(1);
        }
        printInfo(obj.getClass());

        System.out.println("-----------------------------------------------");
        System.out.println("boolean.class = " + boolean.class);
        System.out.println("Boolean.TYPE = " + Boolean.TYPE);
        System.out.println("A.class = " + A.class); // 不会加载类
        try {
            Class.forName("com.yy.clazz.A"); // 会加载类；从classpath所指定的路径中查找，非必须；通过找到的字节码创建一个Class对象
        } catch (ClassNotFoundException e) {
            System.out.println("can't find A");
        }
    }
}
class A{
    static {
        System.out.println("A......");
    }
}