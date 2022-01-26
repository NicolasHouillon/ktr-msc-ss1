package exceptions;

public class Character implements Movable {
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public Character(String name) {
        this.name = name;
        this.RPGClass = "Character";
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void attack(String arg) throws WeaponException {
        if (arg.equals("")) {
            throw new WeaponException(this.name+": I refuse to fight with my bare hands.");
        }
        System.out.println(this.name+": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.name+": unsheathes his weapon.");
    }

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException w) {
            System.out.println(w.getMessage());
        }
    }
}
