package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 15:38
 */
public class Chinese implements Language{
    @Override
    public void voice() {
        System.out.println("您好，有什么可以帮助到您的？");
    }
}
