package lesson11Poly;

import lesson11Poly.weapon.*;

public class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Gun(),
                new MachineGun(),
                new Rifle(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >=  this.getSlotsCount() || slot < 0) {
            System.out.println("Выход за рамки дозволенного. Попробуйте снова.");
            System.out.println();
            return;
        }
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
    }
}