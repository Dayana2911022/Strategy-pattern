public class Gunner extends Militory{
    public Gunner() {
        super(new RifleUsing(),new TankUsing());
    }

    @Override
    public void fight() {

    }

    @Override
    public void display() {
        System.out.println("Gunner");
    }
}
