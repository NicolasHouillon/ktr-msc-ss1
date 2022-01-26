public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage");
        this.setLife(70);
        this.setAgility(10);
        this.setStrength(3);
        this.setWit(10);
        System.out.println(name+": May the gods be with me.");
    }

    public void attack(String weapon) {
        super.attack(weapon);
        if (weapon.equals("magic") || weapon.equals("wand")) {
            System.out.println(this.name+": Feel the power of my "+weapon+"!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back furtively.");
    }
}
