package com.company.character;

public abstract class Hero implements Informational{
    int hitPoints;
    private int level;
    private int damage;

    public void info(){
        System.out.println("HP: " + this.hitPoints + ".\nLevel: " + this.level + ".\nDamage: " + this.damage + ".");
    }

    public Hero(int hitPoints, int level, int damage) {
        this.hitPoints = hitPoints;
        this.level = level;
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
