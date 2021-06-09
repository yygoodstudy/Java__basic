package com.yy.clazz;

/**
 * @Date 2021/6/5 14:34
 */
class Game{
    Game(int i){
        System.out.println("Game Constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame Constructor");
    }
}
public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
