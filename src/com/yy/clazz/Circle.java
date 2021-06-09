package com.yy.clazz;

import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/6/6 16:52
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

public class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Shapes{
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}