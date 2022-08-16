package lesson11Poly.weapon;

public class Rifle extends Weapon {
    @Override
    public void shot() {
        System.out.println("The rifle is shooting!");
        System.out.println();
    }
}