package com.company;

public class Healer extends Hero{
    private int healPower;

    public Healer(int hitPoints, int level, int damage, int healPower) {
        super(hitPoints,level, damage);
        this.healPower = healPower;
    }

    void heal(Hero hero){
        hero.setHitPoints(hero.getHitPoints() + this.healPower);
        System.out.println("Hero is healed by " + this.healPower + " points.");
    }

    @Override
    public void info(){
        super.info();
        System.out.println("I'm a healer. I can heal by " + this.healPower + " points.");
    }

}
