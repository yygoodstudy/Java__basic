package com.yy.interview;

/**
 * @date 2022/5/5
 */
public class StringDemo {
    public static void main(String[] args) {
        String a = "asdf"; // String是不可变的，如果尝试去修改会新生成一个字符串对象。频繁的对String对象进行修改会创建大量的String对象影响内存，资源浪费
        a = "asdffff";
        System.out.println("a = " + a);

        // StringBuffer：线程安全
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("string buffer");
        stringBuffer.append("十个字");
        System.out.println(stringBuffer);

        // StringBuilder：线程不安全，所以在单线程环境下，StringBuilder效率更高；
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string builder");
        stringBuilder.append("九个字");
        System.out.println("stringBuilder = " + stringBuilder);

        String aa = "abcd";
        String bb = "abcd";
        boolean c = (aa == bb);
        System.out.println("c = " + c);
        System.out.println("aa.equals(bb) = " + aa.equals(bb));
    }
}
