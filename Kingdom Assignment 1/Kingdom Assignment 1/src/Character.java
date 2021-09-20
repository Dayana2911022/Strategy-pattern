public  abstract class Character {
    private WeaponBehavior weaponBehavior;

    public Character() {
    }
    public abstract void fight();
    public abstract void display();
    public Character(WeaponBehavior weaponBehavior){
        this.weaponBehavior=weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){
        this.weaponBehavior.useWeapon();
    }

}

