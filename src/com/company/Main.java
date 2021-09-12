package com.company;

public class Main {

    public static void main(String[] args) {
	Boss Madara = new Boss();
	Madara.setHealth(1500);
	Madara.setDamage(2000);
	Madara.weapon.setNameWeapon("Gunbai");
	Madara.weapon.setTypeWeapon("Sword");
		System.out.println(Madara.printInfo());

	Skeleton skelet1 = new Skeleton();
	skelet1.setNumberArrows(100);
	skelet1.setHealth(1000);
	skelet1.setDamage(1200);
	skelet1.weapon.setNameWeapon("Dragon");
	skelet1.weapon.setTypeWeapon("Bow");
		System.out.println(skelet1.printInfo());

		Skeleton skelet2 = new Skeleton();
		skelet2.setNumberArrows(200);
		skelet2.setHealth(1300);
		skelet2.setDamage(1400);
		skelet2.weapon.setNameWeapon("Super Dragon");
		skelet2.weapon.setTypeWeapon("Super Bow");
		System.out.println(skelet2.printInfo());
    }
}
