package com.yy.innerclass;

/**
 * @Date 2021/8/31 19:25
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private int next = 0;
    private Object[] items;

    Sequence(int size) {
        items = new Object[size];
    }

    void add(Object o) {
        if (next < items.length) {
            items[next++] = o;
        }
    }

    private class SelectorSequence implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public SelectorSequence selectorSequence() {
        return new SelectorSequence();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selectorSequence();
        while (!selector.end()) {
            System.out.print(selector.current()+" ");
            selector.next();
        }
    }
}
