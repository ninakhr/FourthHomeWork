package com.company.character.warrior;

import com.company.character.Hero;
import com.company.character.Informational;
import com.company.character.Trainable;

public abstract class Warrior extends Hero implements Informational, Trainable {
    private int damageMultiplier;

    public Warrior(int points, int hitPoints, int level, int damage) {
        super(hitPoints, level, damage);
    }

    void punch(int damageMultiplier, int damage) {
        damage *= damageMultiplier;
    } // стоит сделать его абстрактным?

}
