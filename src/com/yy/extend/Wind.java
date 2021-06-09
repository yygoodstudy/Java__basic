package com.yy.extend;

/**
 * @Date 2021/6/5 15:13
 */
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument play()");
    }
}

public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind play()" + n);
    }
}
class Music{
    public static void tune(Instrument i){
        i.play(Note.B_FLAT);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}