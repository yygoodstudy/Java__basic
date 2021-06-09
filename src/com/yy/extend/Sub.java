package com.yy.extend;

/**
 * @Date 2021/6/5 16:42
 */
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

public class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.getField();
    }
}

class FieldAccess {
    public static void main(String[] args) {
        // 当Sub对象转型为Super引用时，任何类属性访问操作都是由编译器解析的，因此不是多态。
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + ",sup.getField = " + sup.getField()); // 属性同名：属性看父类，方法覆盖：方法看子类
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ",sub.getField = " + sub.getField() + ",sub.getSuperField() = " + sub.getSuperField());

    }
}
