package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 15:44
 */
public class French implements Language{
    @Override
    public void voice() {
        System.out.println("Comment puis - je vous aider?");
    }
}
