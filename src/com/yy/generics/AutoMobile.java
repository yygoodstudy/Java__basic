package com.yy.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/6/9 19:19
 */
public class AutoMobile {

}

class AutoMobile1 extends AutoMobile {
}

class Holder1 {
    private AutoMobile a;

    public Holder1(AutoMobile a) {
        this.a = a;
    }

    AutoMobile get() {
        return a;
    }
}

class Holder2 {
    private Object a;

    public Holder2(Object o) {
        this.a = o;
    }

    public Object get() {
        return a;
    }

    public void set(Object o) {
        this.a = o;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new AutoMobile());
        AutoMobile o = (AutoMobile) holder2.get();
        System.out.println("o = " + o);
//        String o1 = (String) holder2.get();
//        System.out.println("o1 = " + o1);
        Holder2 holder21 = new Holder2(new Integer(1));
        String o2 = String.valueOf(holder21.get());
        System.out.println("o2 = " + o2);
    }
}

class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Integer> integerHolder3 = new Holder3<>(new Integer(1));
        System.out.println("integerHolder3.get() = " + integerHolder3.get());
        Holder3<String> all_for_love = new Holder3<>("all for love");
        System.out.println("all_for_love.get() = " + all_for_love.get());
        Holder3<Object> objectHolder3 = new Holder3<>(new Object());
        System.out.println("objectHolder3.get() = " + objectHolder3.get());
        Holder3<AutoMobile> autoMobileHolder3 = new Holder3<>(new AutoMobile1());

    }
}

class Holder4<T> {
    private List<T> list;
    private T a;
    private T b;
    private T c;

    public Holder4(T a, T b, T c, List<T> list) {
        this.list = new ArrayList<>(Arrays.asList(a, b, c));
    }

    public void setList(T t) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                list.set(i, t);
            }
        }
    }

    public List getList() {
        return list;
    }
}
class Holder4Test{
    public static void main(String[] args) {
        Holder4<String> stringHolder4 = new Holder4<>("天下", "难题", "时间说客", new ArrayList<>());
        List list = stringHolder4.getList();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
