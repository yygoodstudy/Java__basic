package com.yy.interfaces;

/**
 * @Date 2021/6/5 18:23
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
public class VeryBadVampire implements Vampire{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}
