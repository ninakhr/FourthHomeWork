package com.company.character.magician;

import com.company.character.Trainable;

public class OLdMagician extends Magician implements Trainable {
    public OLdMagician(int hitPoints, int level, int damage) {
        super(hitPoints, level, damage);
    }

    @Override
    public void say() {

    }

    @Override
    public void magicianAttack() {
        System.out.println("I am old magician! Khe-khe!");
    }

    @Override
    public void train() {
        System.out.println("Wiuuuu");
    }

    @Override
    public void info() {

    }
}
