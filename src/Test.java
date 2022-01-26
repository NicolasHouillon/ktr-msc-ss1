import exceptions.Mage;
import exceptions.Warrior;
import exceptions.WeaponException;

public class Test {
    public static void main(String[] args) throws WeaponException {
        /*
        exceptions.Character perso = new Character("Jean-Luc");
        System.out.println(warrior.getName());
        System.out.println(warrior.getLife());
        System.out.println(warrior.getAgility());
        System.out.println(warrior.getStrength());
        System.out.println(warrior.getWit());
        System.out.println(warrior.getRPGClass());
        warrior.attack("my weapon");
         */
        exceptions.Character warrior = new Warrior("Jean-Luc");
        exceptions.Character mage = new Mage("Robert");

        /*
        warrior.attack("hammer");
        mage.attack("magic");
         */

        /*
        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();


        warrior.unsheathe();
        mage.unsheathe();
        */

        warrior.tryToAttack("");
        mage.tryToAttack("hammer");
        /*
        try {
            warrior.attack("magic");
        } catch (WeaponException w) {
            System.out.println(w.getMessage());
        }
        try {
            mage.attack("hammer");
        } catch (WeaponException w) {
            System.out.println(w.getMessage());
        }

         */
    }
}
