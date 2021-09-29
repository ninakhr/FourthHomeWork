package com.company.character.healer;

import com.company.character.Beast;
import com.company.character.Hero;
import com.company.character.Trainable;
import com.company.character.magician.Magician;
import com.company.character.warrior.Warrior;

public class HealerDruid extends Healer implements Trainable {
    Beast beast;

    public HealerDruid(int hitPoints, int level, int healPower, int damage) {
        super(hitPoints, level, healPower, damage);
    }

    public void tameBeast(Beast beast) {
        System.out.println("I've tamed the " + this.beast);
    }

    @Override
    void heal(Hero hero) {
        hero.setHitPoints(hero.getHitPoints() + this.healPower);
        System.out.println("Hero is healed by " + this.healPower + " points.");
    }

    void heal(Warrior warrior){
        warrior.setHitPoints(warrior.getHitPoints() + this.healPower);
        System.out.println("Warrior is healed by " + this.healPower + " points.");
    }

    void heal() {
        System.out.println("Ich kann nicht dich heilen, entschuldigung");
    }

    void heal(Magician magician) {
        magician.setHitPoints(magician.getHitPoints() + this.healPower);
        System.out.println("Warrior is healed by " + this.healPower + " points.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("I am druid healer");
    }

    @Override
    public void train() {
        System.out.println("I can train");
    }
}
