package com.yy.clazz;

/**
 * @Date 2021/6/6 18:50
 */
class Building {
}

class Houses extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new Houses();
        Class<Houses> housesClass = Houses.class;
        Houses cast = housesClass.cast(b);
        cast = (Houses) b;
    }
}
