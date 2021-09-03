package com.company;

public class HealerDruid extends Healer{
    Beast beast;

    public HealerDruid(int hitPoints, int level, int healPower, int damage) {
        super(hitPoints, level, healPower, damage);
    }

    public void tameBeast(Beast beast){
        System.out.println("I've tamed the " + this.beast);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("I am druid healer");
    }
}
