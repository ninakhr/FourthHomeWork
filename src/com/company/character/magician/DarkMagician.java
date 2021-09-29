package com.company.character.magician;


public class DarkMagician extends Magician {
    public DarkMagician(int hitPoints, int level, int damage) {
        super(hitPoints, level, damage);
    }

    @Override
    public void magicianAttack() {
        System.out.println("I am a dark magician! Kill!");
    }

    @Override
    public void say() {
        System.out.println("I am angry");
    }

    @Override
    public void info() {
        System.out.println("I'm dark magician. " + this.getLevel());
        this.say();
        this.magicianAttack();

    }
}
