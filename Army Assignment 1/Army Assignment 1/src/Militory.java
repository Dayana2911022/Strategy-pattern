public abstract class Militory {
    private WeaponUsing weaponUsing;
    private CombatVehicleUsing combatVehicleUsing;
    public abstract void fight();
    public abstract void display();
    public Militory(WeaponUsing weaponUsing,CombatVehicleUsing combatVehicleUsing){
        this.weaponUsing=weaponUsing;
        this.combatVehicleUsing=combatVehicleUsing;
    }

    public void setWeaponUsing(WeaponUsing weaponUsing) {
        this.weaponUsing = weaponUsing;
    }

    public void setCombatVehicleUsing(CombatVehicleUsing combatVehicleUsing) {
        this.combatVehicleUsing = combatVehicleUsing;
    }
    public void performWeapon(){
        this.weaponUsing.useWeapon();
    }
    public void performVehicle(){
        this.combatVehicleUsing.useCombatVehicle();
    }

    }
