package com.yy.interfaces;

/**
 * @Date 2021/8/30 21:21
 */
public class CustomerService {
    public static void main(String[] args) {
        Language language = new Chinese();
        speak(language);
        Language english = new English();
        speak(english);

        System.out.println("==========================");
        speak(contact(33));
    }

    public static Language contact(int areaCode) {
        if (areaCode == 86) {
            return new Chinese();
        } else if (areaCode == 33) {
            return new English();
        } else {
            return new Chinese();
        }
    }

    public static void speak(Language language) {
        language.voice();
    }
}
