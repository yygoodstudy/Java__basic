package com.yy.variable;

/**
 * Java1.5之后枚举类型的写法
 * 1.构造方法必须私有化
 * 2.类首行写常量变量
 * 3.类标识符用Enum关键字修饰
 */
public class EnumAfter15 {
    public static void main(String[] args) {
        Week saturday = Week.SATURDAY;
        System.out.println("saturday = " + saturday);
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");
    private String description;

    Week(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}