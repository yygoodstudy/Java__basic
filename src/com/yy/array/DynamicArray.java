package com.yy.array;

/**
 * @Date 2021/6/4 19:25
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }
}