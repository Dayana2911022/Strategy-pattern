import java.util.Scanner;

public class Main {

    private static int numMenu;

    public static void main(String[] args) {
        Character queen = new Queen();
        queen.display();
        queen.fight();
        queen.performWeapon();

        Character troll = new Troll();
        troll.display();
        troll.fight();
        troll.performWeapon();



    }
}