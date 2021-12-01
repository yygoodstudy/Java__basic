package com.yy.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @date 2021/11/25
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {

        Set<String> set = new HashSet<>();
        return INSTANCE;
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> es = new HashSet<>(s1);
        es.addAll(s2);
        return es;
    }

}
