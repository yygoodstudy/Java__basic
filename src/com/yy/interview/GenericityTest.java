package com.yy.interview;

import java.math.BigDecimal;

/**
 * @date 2022/5/5
 */
public class GenericityTest {
    public static void main(String[] args) {
        MyList<BigDecimal> myList = new MyList<>();

        myList.add(new BigDecimal(1));
//        myList.add(new Integer(12));
        MyList myList1 = new MyList<>();
        myList1.add(new BigDecimal(1));
        myList1.add(new Integer(1));

    }
}

class MyList<E extends Number> {
    public void add(E e) {
    }
}

// 泛型类
class Genericity<E> {
    private E key;

    public Genericity(E key) {
        this.key = key;
    }

    // 普通方法
    public E getKey() {
        return key;
    }

    // 泛型方法，必须包含<T>
    public <E> E getKeyName(Class<E> genericity) throws InstantiationException, IllegalAccessException {
        E e = genericity.newInstance();
        return e;
    }

}