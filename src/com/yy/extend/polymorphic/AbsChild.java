package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 18:49
 */
public class AbsChild extends Abs{
    @Override
    public int method2() {
        return super.n1;
    }

    public void show(){
        System.out.println("show()....");
    }
}
