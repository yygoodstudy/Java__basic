package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 18:26
 * 子类能够继承父类public/default/protect修饰的成员变量和方法
 */
public class Hulk extends Mark1 {

    public static void main(String[] args) {
        Hulk hulk = new Hulk();
        hulk.title = "气象站台";
        hulk.color = "WHITE";
        hulk.movie = "复仇者联盟4";
        hulk.description();

    }
}
