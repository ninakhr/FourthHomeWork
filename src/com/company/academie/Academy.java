package com.company.academie;

import com.company.character.Trainable;

public abstract class Academy {
    public void teach(Trainable trainee){
        trainee.train();
    }
}
