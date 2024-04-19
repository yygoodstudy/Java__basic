package com.yy.data;

import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/6/4 22:13
 */
public class AsInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new slush(), new Power());
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        System.out.println("snow2 = " + snow2);
    }
}

class Snow {
}

class Power extends Snow {
}

class Light extends Power {
}

class Heavy extends Power {
}

class Crusty extends Snow {
}

class slush extends Snow {
}
