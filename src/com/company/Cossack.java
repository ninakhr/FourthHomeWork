package com.company;

public class Cossack extends Warrior {
    Saber saber;

    public Cossack(int hitPoints, int level, int damage, int damageMultiplier, Saber saber) {
        super(hitPoints, level, damage, damageMultiplier);
        this.saber = saber;
    }

    public void cutBySaber(){
        System.out.println();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("I'm a Kozachek and I have a nice " + this.saber + ".");
    }
}
