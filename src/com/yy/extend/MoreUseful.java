package com.yy.extend;

/**
 * @Date 2021/6/5 17:38
 */
class Useful{
    public void f(){}
    public void g(){}
}
public class MoreUseful extends Useful{
    public void f(){}
    public void g(){}
    public void h(){}
    public void j(){}
    public void k(){}
}
class Rtti{
    public static void main(String[] args) {
        Useful[] usefuls = {new Useful(), new MoreUseful()};
//        (MoreUseful)usefuls[0].f();
//        (MoreUseful)usefuls[1].g();
    }
}
