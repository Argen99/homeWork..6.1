package com.company;

public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon("Световой", "Меч");
	    Boss boss = new Boss(weapon,"Dart Wader",700,50);
	    boss.setWeapon(weapon);
        System.out.println(boss.getName() + " " + boss.getHealth() + " " + boss.getDamage()
                + " " + boss.getWeapon().getType() + " " + boss.getWeapon().getTitle());
    }
}
