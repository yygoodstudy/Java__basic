package com.yy.innerclass;

/**
 * @Date 2021/6/7 20:56
 */
public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }

        @Override
        public String toString() {
            return "Destination{" +
                    "label='" + label + '\'' +
                    '}';
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = new Contents();
        System.out.println("c.i = " + c.i);
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
//        Contents contents = d.contents();
//        Destination abc = d.to("abc");
//        System.out.println("contents.i = " + contents.i);
//        System.out.println("abc.readLabel() = " + abc.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("All for love");
        Parcel1.Destination destination = parcel1.to("ssssS");
        System.out.println("destination = " + destination);
        Parcel1.Contents contents = parcel1.contents();
    }
}
