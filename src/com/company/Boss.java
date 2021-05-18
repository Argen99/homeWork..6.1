package com.company;

public class Boss extends gameEntity {

    Weapon weapon;


    public Boss(Weapon weapon, String name, int health, int damage){
        super(name,health,damage);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
