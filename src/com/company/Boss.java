package com.company;

public class Boss extends GameEntity{
    private Weapon weaponEntity;

    public Weapon getWeaponEntity() {
        return weaponEntity;
    }

    public void setWeapon(Weapon weaponBoss) {
        this.weaponEntity = weaponBoss;
    }

    public String printInfo(){
        return super.info() + " Weapon: " + getWeaponEntity().getWeaponName();
    }
}
