public class Test {
    public static void main(String[] args) {
        /*
        Character perso = new Character("Jean-Luc");
        System.out.println(warrior.getName());
        System.out.println(warrior.getLife());
        System.out.println(warrior.getAgility());
        System.out.println(warrior.getStrength());
        System.out.println(warrior.getWit());
        System.out.println(warrior.getRPGClass());
        warrior.attack("my weapon");
         */
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.attack("hammer");
        mage.attack("magic");
    }
}
