package StrategyPattern;

public class Hero {
    private String name;
    private Attacker attacker;
    public Hero(String name) {
        this.name = name;
    }
    public void SetWeapon(Attacker attacker) {
        this.attacker = attacker;
    }
    public void Attack() {
        System.out.println(">>>");
        if (attacker == null) {
            System.out.println(name + " can't attack. Set a weapon.");
            return;
        }
        System.out.println(name + " stands menacingly");
        System.out.print(name + " ");
        attacker.Shoot();
        System.out.println(name + " ceases to stand menacingly");
    }
}
