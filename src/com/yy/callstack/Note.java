package com.yy.callstack;

/**
 * @Date 2021/8/29 11:54
 */
public enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }
}

class Music {

    public static void tune(Instrument i) {
        i.play(Note.B_FLAT);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);
    }
}