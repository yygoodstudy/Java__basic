package com.yy.variable;

/**
 * 枚举类型：这个类的对象只有固定的那么几个
 * 枚举类型；jdk1.5之前的用法
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Season.SPRING = " + Season.SPRING.seasonName);
        Season spring = Season.SPRING;
        Season spring1 = Season.SPRING;
        System.out.println(spring == spring1);
    }
}

class Season {
    String seasonName;
    public static final Season SPRING = new Season("spring"); // final修饰的对象，对象引用不能改变(地址值)，但是对象本身可以改变
    public static final Season SUMMER = new Season("summer");
    public static final Season AUTUMN = new Season("autumn");
    public static final Season WINTER = new Season("winter");

    private Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }
}