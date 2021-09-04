package com.yy.io;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Date 2021/8/31 22:51
 */
public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "慕课abc";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = "慕".getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = {-26, -123, -107};
        String string = new String(bytes2);
        System.out.println("string = " + string);
        System.out.println(System.getProperty("file.encoding"));

        System.out.println("-----------------------");
        byte[] b_gbk = "中".getBytes("GBK"); // 以指定的编码返回某字符串在该编码下的byte数组表示
        byte[] b_utf8 = "中".getBytes("UTF-8");
        byte[] b_iso88591 = "中".getBytes("ISO8859-1");
        System.out.println(Arrays.toString(b_gbk));
        System.out.println(Arrays.toString(b_utf8));
        System.out.println(Arrays.toString(b_iso88591));

    }
}
