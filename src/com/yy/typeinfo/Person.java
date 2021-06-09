package com.yy.typeinfo;

/**
 * @Date 2021/6/7 20:33
 */
interface Null {
}

public class Person {
    private final String first;
    private final String second;
    private final String address;

    Person(String first, String second, String address) {
        this.first = first;
        this.second = second;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null {
        NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
