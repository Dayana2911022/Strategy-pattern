public class Troll extends Character{

    public Troll() {
        super(new BrowAndArrowBehavior());
    }

    public void fight() {}

    public void display() {
        System.out.println("Hello, i am a troll!");
    }
}
