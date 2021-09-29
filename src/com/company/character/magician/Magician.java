package com.company.character.magician;

import com.company.character.Hero;
import com.company.character.Informational;

public  abstract class Magician extends Hero implements Informational {
    public Magician(int hitPoints, int level, int damage) {
        super(hitPoints, level, damage);
    }

    public abstract void say();
    int magicianDamage;
    public abstract void magicianAttack();
}
