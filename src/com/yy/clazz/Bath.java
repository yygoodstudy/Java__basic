package com.yy.clazz;

/**
 * @Date 2021/6/5 14:01
 */
class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castile;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14F;
        castile = new Soap();
    }

    @Override
    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1=" + s1 + ",s2=" + s2 + ",s3=" + s3 + ",s4=" + s4 + ",toy = " + toy + ",castile =" + castile;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
