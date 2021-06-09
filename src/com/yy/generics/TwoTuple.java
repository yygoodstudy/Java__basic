package com.yy.generics;

/**
 * @Date 2021/6/9 19:59
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "first= " + first + ",second= " + second;
    }

    public static void main(String[] args) {
        TwoTuple<String, Double> twoTuple = new TwoTuple<>("All for Love", 3.14);
        System.out.println("twoTuple.second = " + twoTuple.second);
//        twoTuple.second = 3.15;
        System.out.println("twoTuple = " + twoTuple);
    }
}

class ThreeTuple<A, B, C> extends TwoTuple {
    private C three;

    ThreeTuple(A a, B b, C c) {
        super(a, b);
        three = c;
    }

    @Override
    public String toString() {
        return super.toString() + ",three=" + three;
    }

    public static void main(String[] args) {
        ThreeTuple<String, Double, Character> threeTuple = new ThreeTuple<>("Breath And Life", 2.33, 'C');
        System.out.println(threeTuple);
        System.out.println("threeTuple.first = " + threeTuple.first);
    }
}