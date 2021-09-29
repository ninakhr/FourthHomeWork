package com.company;

import com.company.academie.PriestAcademy;
import com.company.academie.WarriorAcademy;
import com.company.character.*;
import com.company.character.warrior.Cossack;
import com.company.character.healer.HealerDruid;
import com.company.weapon.Saber;

public class Main {

    public static void main(String[] args) {

        Saber saber = new Saber("Big saber", 25);

        Cossack warrior2 = new Cossack(100, 200, 10, 3, saber);
        WarriorAcademy warriorAcademy = new WarriorAcademy();
        warriorAcademy.teach(warrior2);

        Trainable healerDruid = new HealerDruid(12, 10, 50, 0);
        PriestAcademy priestAcademy = new PriestAcademy();
        priestAcademy.teach(healerDruid);
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.print(i1 == i2);
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.print(i3 == i4);

    }
}
