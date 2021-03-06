package com.yy.clazz;

/**
 * @Date 2021/6/4 20:53
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(), right = new Door();
    public Car(){
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }
}
class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel{
    public void inflate(int psi){}
}
class Wd{
    public void rollup(){}
    public void rolldown(){}
}
class Door{
    public Wd window = new Wd();
    public void open(){}
    public void close(){}
}
