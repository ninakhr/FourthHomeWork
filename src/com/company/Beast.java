package com.company;

public class Beast {
    private String name;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Beast(String name, int hitPoints, int damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    final void attackLikeABeast (Hero hero){
        hero.setHitPoints(hero.getHitPoints() - this.damage);
        System.out.println("Hero was attacked by a beast for " + this.damage + "hp.");
    }
}
