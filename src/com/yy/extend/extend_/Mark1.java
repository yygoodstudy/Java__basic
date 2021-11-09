package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 15:20
 */
public class Mark1 {
    protected String title;
    protected String color;
    protected String movie;

    public void description() {
        System.out.println("战甲名字：" + title);
        System.out.println("战甲颜色：" + color);
        System.out.println("首次出演电影：" + movie);
    }

    private void fire() {
        System.out.println(title + ":利用火焰喷射器发射");
    }

    public static void main(String[] args) {
        Mark1 mark1 = new Mark1();
        mark1.title = "反浩克战甲";
        mark1.color = "BLACK";
        mark1.movie = "复仇者联盟1";
        mark1.description();
        mark1.fire();
    }
}
