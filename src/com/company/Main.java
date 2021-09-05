package com.company;

public class Main {

    public static void main(String[] args) {
//	Hero hero = new Hero(67, 10, 10);
////	hero.info();
//
//	Healer healer = new Healer(99,20,0,20);
////	healer.info();
////	healer.heal(hero);
////	hero.info();
//
//	System.out.println("");
//
//	Beast beast = new Beast("bear", 33,70);
////	beast.attackLikeABeast(hero);
////	hero.info();
//

////	healerDruid.tameBeast(beast);
////	healerDruid.info();
////	healerDruid.train();
////	healerDruid.trainFaster();
//
	Warrior warrior = new Warrior(100,302,10,3);
//	warrior.info();

	Saber saber = new Saber("Big saber", 25);
//
//	Cossack cossack = new Cossack(10,12,40,4,saber);

//		Villian villian  = new Villian();
//		villian.say();
		Fairy wizard = new Fairy();
		Academy academy = new Academy();
		academy.teach(wizard);
//		wizard.say();

		Cossack warrior2 = new Cossack(100,200,10,3, saber);
		WarriorAcademy warriorAcademy = new WarriorAcademy();
		warriorAcademy.teach(warrior2);

		Trainee healerDruid = new HealerDruid(12,10,50,0);
		PriestAcademy priestAcademy = new PriestAcademy();
		priestAcademy.teach(healerDruid);




    }
}
