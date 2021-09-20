public class TankDriver extends Militory{
    public TankDriver() {
        super(new RifleUsing(),new TankUsing());
    }

    @Override
    public void fight() {
    }

    @Override
    public void display() {
        System.out.println("Tank Driver");
    }
}
