package com.company;

public class PriestAcademy extends Academy{
    @Override
    public void teach(Trainee trainee) {
        if(trainee instanceof Healer){
            super.teach(trainee);
        }
    }
}
