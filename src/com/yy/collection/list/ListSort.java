package com.yy.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @date 2022/5/24
 */
public class ListSort {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("sdf", 12, "sdfsf"));
        users.add(new User("bbbb", 23, "sdfsf"));
        users.add(new User("cccc", 20, "sdfsf"));
        users.add(new User("eeee", 39, "sdfsf"));
        users.add(new User("dddd", 30, "sdfsf"));
        users.add(new User("FFFF", 10, "sdfsf"));
//        users.sort(Comparator.comparingInt(User::getAge));
        Collections.sort(users, new UserComparator());
        System.out.println(users);
    }
}

class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}