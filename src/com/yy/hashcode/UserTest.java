package com.yy.hashcode;

import java.util.HashMap;

/**
 * @date 2024/4/16
 */
public class UserTest {
    public static void main(String[] args) {
        HashMap<User, String> map = new HashMap<>();
        User user1 = new User("yaoyuan");
        User user2 = new User("yaoyuan");
        System.out.println("user2.equals(user2) = " + user1.equals(user2));
        map.put(user1, "123");
        map.put(user2, "345");
        String s = map.get(user2);
        System.out.println("s = " + s);
        String s1 = map.get(new User("yaoyuan"));
        System.out.println("s1 = " + s1);
    }
}
