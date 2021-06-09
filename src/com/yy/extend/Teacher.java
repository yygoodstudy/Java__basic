package com.yy.extend;

/**
 * @Date 2021/5/23 16:16
 */
public class Teacher extends Person{
    private String no;
    private String job;

    public Teacher(String name,String sex,String no,String job){
        super(name,sex);
        this.no = no;
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "no='" + no + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
