package com.company;

public class Fairy extends Wizard implements Trainee{
    @Override
    public void say() {
        System.out.println("I can read you a fairytale");
    }

    @Override
    public void train() {
        System.out.println("Wiuuuu");
    }
}
