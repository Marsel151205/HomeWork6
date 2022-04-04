package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weaponBoss = new Weapon();
        weaponBoss.setWeaponName("Огненная рубка");
	Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(50);
    boss.setWeapon(weaponBoss);
    //    System.out.println("Boss health: " + boss.getHealth() + " Boss Damage: " + boss.getDamage() + " Boss weapon: "
    //    + boss.getBossWeapon());

        Weapon weaponSkeleton = new Weapon();
        weaponSkeleton.setWeaponName("Отравленные Стреллы");

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(250);
        skeleton.setDamage(20);
        skeleton.setNumberOfArrows(30);
        skeleton.setWeapon(weaponSkeleton);

        Weapon weaponSkeleton2 = new Weapon();
        weaponSkeleton.setWeaponName("Обычные стрелы");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(200);
        skeleton2.setDamage(30);
        skeleton2.setNumberOfArrows(20);
        skeleton2.setWeapon(weaponSkeleton2);


        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}
