public class Sniper extends Militory{
    public Sniper() {
        super(new WeaponOnly(),new MilitaryTruck());
    }

    @Override
    public void fight() {

    }

    @Override
    public void display() {
        System.out.println(" Sniper");
    }
}
