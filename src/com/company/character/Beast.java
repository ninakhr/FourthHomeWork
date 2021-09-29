package com.company.character;

import com.company.character.Hero;
import com.company.character.Informational;

public class Beast implements Informational {
    private String name;
    private int hitPoints;
    private int damage;

    @Override
    public void info() {
        System.out.println("I'm " + this.name);
    }

    public Beast(String name, int hitPoints, int damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public Beast(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        System.out.println("I can't damage you.");
    }


    final void attackLikeABeast (Hero hero){
        hero.setHitPoints(hero.getHitPoints() - this.damage);
        System.out.println("Hero was attacked by a beast for " + this.damage + "hp.");
    }
}
