package com.codeclan;

public abstract class Fighter extends Player implements IWeapon{

    IWeapon weapon;


    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;

    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void doesAttack(Enemy enemy){
        this.getWeapon().attack(enemy);
    }
}
