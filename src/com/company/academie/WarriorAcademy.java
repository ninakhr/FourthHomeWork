package com.company.academie;

import com.company.character.Trainable;
import com.company.character.warrior.Warrior;

public class WarriorAcademy extends Academy {
    @Override
    public void teach(Trainable trainee) {
        if(trainee instanceof Warrior){
            super.teach(trainee);
        }
    }
}
