package com.codeclan;

public class Sword implements IWeapon{
    int damage;

    public Sword(int damage) {
        this.damage = damage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
