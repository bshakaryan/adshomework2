package StrategyPattern.Weapon;

import StrategyPattern.Attacker;

public class WaterGun implements Attacker {
    public void Shoot() {
        System.out.println("attacks with a watergun");
    }
}
