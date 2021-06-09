package com.yy.enumm;

/**
 * @Date 2021/6/4 19:57
 */
public class SimpleEnumUse {
    Spiciness sc;

    SimpleEnumUse(Spiciness sc) {
        this.sc = sc;
    }

    void describe() {
        switch (sc) {
            case ONE:
                System.out.println("one");
                break;
            case TWO:
                System.out.println("two");
                break;
            case THREE:
                System.out.println("three");
                break;
            default:
                System.out.println("others");
        }
    }

    public static void main(String[] args) {
        Spiciness one = Spiciness.ONE;
        System.out.println("one = " + one);
        for (Spiciness value : Spiciness.values()) {
            System.out.println("value = " + value + ",ordinal=" + value.ordinal());
        }
        System.out.println("-------------------");
        SimpleEnumUse simpleEnumUse = new SimpleEnumUse(Spiciness.FIVE);
        simpleEnumUse.describe();
    }
}

enum Spiciness {
    ONE, TWO, THREE, FOUR, FIVE, SEX
}