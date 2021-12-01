package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 18:39
 */
public class English implements Language{
    @Override
    public void voice() {
        System.out.println("hello,May I help you?");
    }
}
