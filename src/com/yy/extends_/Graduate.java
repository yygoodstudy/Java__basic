package com.yy.extends_;

/**
 * @Date 2021/9/13 20:31
 */
public class Graduate extends Pupil{

    public Graduate() {
        super("zhangSan",19,60.0);
    }

    public Graduate(String name, Integer age, double score) {
        super(name, age, score);
    }

    @Override
    public void testing() {
        super.testing();
    }
}
