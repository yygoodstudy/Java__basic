package com.yy.hashcode;

/**
 * @date 2024/4/16
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (this.name.equals(user.name)) {
            return true;
        }
        return false;
    }
}
