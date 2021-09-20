public class Main {
    public static void main(String[] args) {
        System.out.println(" My army consists:");
        System.out.println("1)");
        Militory machinegunner=new MachineGunner();
        machinegunner.display();
        machinegunner.performWeapon();
        machinegunner.performVehicle();
        System.out.println("2)");
        Militory sniper=new Sniper();
        sniper.display();
        sniper.performWeapon();
        sniper.performVehicle();
        System.out.println("3)");
        Militory tankdriver=new TankDriver();
        tankdriver.display();
        tankdriver.performWeapon();
        tankdriver.performVehicle();



    }
}
