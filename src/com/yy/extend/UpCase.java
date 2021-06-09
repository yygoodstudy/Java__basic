package com.yy.extend;

import java.util.Arrays;

/**
 * @Date 2021/6/5 17:47
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

public class UpCase extends Processor {
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(","));
    }
}

class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }

    static String s = "asda,sdfs,1232,YHsdfs,0op";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}