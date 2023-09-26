package com.codeclan;

public class Barbarian extends Fighter{

    public Barbarian(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack(Enemy enemy) {
        this.getWeapon().attack(enemy);
    }
}
