package StrategyPattern;

import StrategyPattern.Weapon.WaterGun;

public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero("Bogdan");
        hero.Attack();
        hero.SetWeapon(new WaterGun());
        hero.Attack();
    }
}
