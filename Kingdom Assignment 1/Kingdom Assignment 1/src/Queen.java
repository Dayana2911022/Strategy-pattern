public class Queen extends Character{


    public Queen() {
        super(new AxeBehavior());
    }
    public void fight() {
}
    @Override
    public void display() {
        System.out.println("Hello, i am a queen!");
    }
}
