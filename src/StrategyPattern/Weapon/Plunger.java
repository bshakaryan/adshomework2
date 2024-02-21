package StrategyPattern.Weapon;

import StrategyPattern.Attacker;

public class Plunger implements Attacker {
    public void Shoot() {
        System.out.println("attacks with a plunger");
    }
}
