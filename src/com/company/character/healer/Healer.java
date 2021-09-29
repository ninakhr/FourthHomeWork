package com.company.character.healer;

import com.company.character.Hero;
import com.company.character.warrior.Warrior;

public abstract class Healer extends Hero {
    int healPower;

    public Healer(int hitPoints, int level, int damage, int healPower) {
        super(hitPoints, level, damage);
        this.healPower = healPower;
    }

    void heal(Hero hero) {
        hero.setHitPoints(hero.getHitPoints() + healPower);
    }


    void heal(Warrior warrior) {
        warrior.setHitPoints(warrior.getHitPoints() + this.healPower * 2);
    }


    @Override
    public void info() {
        super.info();
        System.out.println("I'm a healer. I can heal by " + this.healPower + " points.");
    }

}
