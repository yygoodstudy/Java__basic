package com.yy.extend.polymorphic;

/**
 * @Date 2021/11/9 17:39
 */
public class CustomerService {

    public static Language contact(String areaCode) {
        if (areaCode.equals("33")) {
            return new English();
        } else if (areaCode.equals("86")) {
            return new Chinese();
        } else {
            return new French();
        }
    }

    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.voice();

        English english = new English();
        english.voice();

        Language language = contact("56");
        language.voice();
    }
}
