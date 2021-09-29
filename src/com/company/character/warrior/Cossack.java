package com.company.character.warrior;

import com.company.character.warrior.Warrior;
import com.company.weapon.Saber;

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

    @Override
    public void train() {
        System.out.println("I'm training");
        setLevel(getLevel() + 1);
    }

    @Override
    void punch(int damageMultiplier, int damage) {
        super.punch(damageMultiplier, damage);
    }
}
