package com.yy.arithmetic;

/**
 * 水果类
 *
 * @date 2023/3/12
 */
public class Fruit {
    private Integer serialNumber; // 水果编号
    private Integer ni; //  此种水果的最大采摘数量
    private Integer wi; //  单个重量
    private Integer vi; // 单个水果的维生素

    public Fruit() {
    }

    public Fruit(Integer serialNumber, Integer ni, Integer wi, Integer vi) {
        this.serialNumber = serialNumber;
        this.ni = ni;
        this.wi = wi;
        this.vi = vi;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getNi() {
        return ni;
    }

    public void setNi(Integer ni) {
        this.ni = ni;
    }

    public Integer getWi() {
        return wi;
    }

    public void setWi(Integer wi) {
        this.wi = wi;
    }

    public Integer getVi() {
        return vi;
    }

    public void setVi(Integer vi) {
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "serialNumber=" + serialNumber +
                ", ni=" + ni +
                ", wi=" + wi +
                ", vi=" + vi +
                '}';
    }
}
