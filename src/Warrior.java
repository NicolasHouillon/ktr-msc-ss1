public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior");
        this.setLife(100);
        this.setStrength(10);
        this.setAgility(8);
        this.setWit(3);
        System.out.println(name+": My name will go down in history!");
    }

    public void attack(String weapon) {
        super.attack(weapon);
        if (weapon.equals("hammer") || weapon.equals("sword")) {
            System.out.println(this.name+": I'll crush you with my "+weapon+"!");
        }
    }
}
