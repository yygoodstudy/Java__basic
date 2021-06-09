package com.yy.typeinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Date 2021/6/6 19:08
 */
public interface Factory<T> {
    T create();
}

class Part {
    public String toString() {
        return this.getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();

    static {
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new FuelFilter.Factory());
    }

    private static Random random = new Random(47);
    public static Part createRandom(){
        int i = random.nextInt(partFactories.size());
        return partFactories.get(i).create();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Part random = createRandom();
            System.out.println("random = " + random);
        }
    }
}

class Filter extends Part {
}

class AirFilter extends Filter {
    public static class Factory implements com.yy.typeinfo.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class FuelFilter extends Filter {
    public static class Factory implements com.yy.typeinfo.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}