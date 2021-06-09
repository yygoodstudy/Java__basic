package com.yy.typeinfo;

import java.lang.reflect.Method;

/**
 * @Date 2021/6/6 19:25
 */
class Base {
}

class Derived extends Base {
}

public class FamilyVsExactType {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void test(Object o) {
        System.out.println("o.getClass() = " + o.getClass());
        boolean b = o instanceof Base;
        System.out.println("b = " + b);
        boolean instance = Derived.class.isInstance(o);
        System.out.println("instance = " + instance);
    }

    public static void main(String[] args) {
        Class<FamilyVsExactType> familyVsExactTypeClass = FamilyVsExactType.class;
        Method[] methods = familyVsExactTypeClass.getMethods();
        System.out.println("--------------------");
        for (Method method : methods) {
            System.out.println("method.toString() = " + method.toString());
            System.out.println("method.getName() = " + method.getName());
        }
        System.out.println("--------------------");
        Method[] methods1 = familyVsExactTypeClass.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println("method.getName() = " + method.getName());
        }

//        test(new Base());
//        System.out.println("---------");
//        test(new Derived());
    }
}
