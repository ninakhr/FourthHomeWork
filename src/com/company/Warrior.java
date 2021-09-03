package com.company;

public class Warrior extends Hero {
    private int damageMultiplier;

    public Warrior(int hitPoints, int level, int damage, int damageMultiplier) {
        super(hitPoints, level, damage);
        this.damageMultiplier = damageMultiplier;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("I'm a warrior. I multiply damage by " + this.damageMultiplier + " points.");
    }

    void punch(int damageMultiplier, int damage){
        damage *= damageMultiplier;
    }

}
