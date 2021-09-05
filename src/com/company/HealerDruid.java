package com.company;

public class HealerDruid extends Healer implements Trainee{
    Beast beast;
    Academy academy = new Academy();

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

    @Override
    public void train() {
        System.out.println("I can train");
    }
}
