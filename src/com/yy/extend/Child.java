package com.yy.extend;

/**
 * @Date 2021/5/25 22:08
 */
public class Child extends Father{

    private String school;
    private Boolean hasGirlFriend;

    public Child(String name, Integer age, Double property,String school,Boolean hasGirlFriend) {
        super(name, age, property);
        this.school = school;
        this.hasGirlFriend = hasGirlFriend;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Boolean getHasGirlFriend() {
        return hasGirlFriend;
    }

    public void setHasGirlFriend(Boolean hasGirlFriend) {
        this.hasGirlFriend = hasGirlFriend;
    }

    @Override
    public void eat() {
        System.out.println("儿子爱吃饺子~~");
    }
}
