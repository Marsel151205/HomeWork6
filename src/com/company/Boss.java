package com.company;

public class Boss extends GameEntity{
    private String bossWeapon;

    public String getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(String bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return super.info() + " Weapon: " + this.bossWeapon;
    }
}
