package com.yy.clazz;

/**
 * @Date 2021/6/4 18:58
 */
public class Window {
    Window(int marker){
        System.out.println("marker="+marker);
    }
}

class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }

    Window w3 = new Window(3);

    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
