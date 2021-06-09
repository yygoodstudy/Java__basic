package com.yy.clazz;

/**
 * @Date 2021/6/5 14:11
 */
class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(".dilute()");
    }

    public void apply() {
        append(".apply()");
    }

    public void scrub() {
        append(".scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleanser{
    @Override
    public void scrub() {
        append(" .Detergent.scrub() ");
        super.scrub();
    }

    public void foam(){
        append(" .foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute(); //Cleanser.dilute()
        detergent.apply(); // Cleanser.dilute().apply()
        detergent.scrub(); // Cleanser.dilute().apply().Detergent.scrub()
        detergent.foam();
        System.out.println(detergent);
    }
}
