package com.codeclan;

public abstract class Enemy {
    String name;
    int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        this.setHealth(this.getHealth() - damage);
        return health;
    }
}
