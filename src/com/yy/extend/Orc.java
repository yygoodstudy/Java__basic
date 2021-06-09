package com.yy.extend;

/**
 * @Date 2021/6/5 15:01
 */
class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + this.name;
    }
}

public class Orc extends Villain {
    private int OrcNumber;

    public Orc(String name, int number) {
        super(name);
        this.OrcNumber = number;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.OrcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + OrcNumber + " : " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limuger", 12);
        System.out.println(orc);
        orc.change("王杰", 55);
        System.out.println(orc);
    }
}
