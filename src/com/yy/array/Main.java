package com.yy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @date 2023/5/27
 */
public class Main {

    static String article = "Youth is not a time of life; it is a state of mind; it is not a matter of rosy cheeks, red lips and supple knees; it is a matter of the will, a quality of the imagination, a vigor of the emotions; it is the freshness of the deep springs of life.\n" +
            "\n" +
            "Youth means a temperamental predominance of courage over timidity, of the appetite for adventure over the love of ease. This often exists in a man of 60 more than a boy of 20. Nobody grows old merely by a number of years. We grow old by deserting our ideals.\n" +
            "\n" +
            "Years may wrinkle the skin, but to give up enthusiasm wrinkles the soul. Worry, fear, self-distrust bows the heart and turns the spirit back to dust.\n" +
            "\n" +
            "Whether 60 or 16, there is in every human being’s heart the lure of wonders, the unfailing appetite for what’s next and the joy of the game of living. In the center of your heart and my heart, there is a wireless station; so long as it receives messages of beauty, hope, courage and power from man and from the infinite, so long as you are young.\n" +
            "\n" +
            "When your aerials are down, and your spirit is covered with snows of cynicism and the ice of pessimism, then you’ve grown old, even at 20; but as long as your aerials are up, to catch waves of optimism, there’s hope you may die young at 80.";

    public static void main(String[] args) {
        String a = ":", b = " ", c = ",", d = "\\.", e = ";";
        HashMap<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        String[] article1 = article.split(a);
        for (String s : article1) {
            String[] article2 = s.trim().split(b);
            for (String s1 : article2) {
                String[] s2 = s1.trim().split(c);
                for (String s3 : s2) {
                    String[] split = s3.trim().split(d);
                    for (String s4 : split) {
                        String[] strings1 = s4.trim().split(e);
                        for (String s5 : strings1) {
                            strings.add(s5.trim());
                        }
                    }
                }
            }
        }
        for (String string : strings) {
            map.put(string, 0);
        }
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer count = count(s, strings); // 统计某个字符串在字符串集合中出现的次数
            map.put(s, count);
        }
        System.out.println(map);
    }

    public static Integer count(String target, List<String> strings) {
        int num = 0;
        for (String string : strings) {
            if (string.equals(target)) {
                num++;
            }
        }
        return num;
    }
}
