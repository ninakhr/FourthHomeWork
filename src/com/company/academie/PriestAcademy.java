package com.company.academie;

import com.company.character.Trainable;
import com.company.character.healer.Healer;

public class PriestAcademy extends Academy {
    @Override
    public void teach(Trainable trainee) {
        if(trainee instanceof Healer){
            super.teach(trainee);
        }
    }
}
