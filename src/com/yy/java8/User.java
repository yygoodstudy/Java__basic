package com.yy.java8;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Date 2022/9/3 21:00
 */
public class User {
    private BigDecimal num1;
    private BigDecimal num2;

    @Override
    public String toString() {
        return "User{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }
}
