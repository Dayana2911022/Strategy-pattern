public class MachineGunner extends Militory{
    public MachineGunner() {
        super(new MachineGunUsing(),new MilitaryTruck());
    }

    @Override
    public void fight() {

    }

    @Override
    public void display() {
        System.out.println("Machine Gunner");
    }
}
