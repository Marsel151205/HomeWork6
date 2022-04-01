package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(50);
    boss.setBossWeapon("Blade of Death");
    //    System.out.println("Boss health: " + boss.getHealth() + " Boss Damage: " + boss.getDamage() + " Boss weapon: "
    //    + boss.getBossWeapon());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(250);
        skeleton.setDamage(20);
        skeleton.setNumberOfArrows(30);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(200);
        skeleton2.setDamage(30);
        skeleton2.setNumberOfArrows(20);

        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
    }
}
