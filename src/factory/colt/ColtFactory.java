package factory.colt;

import factory.*;

/**
 * Created by Shoma on 03.05.2017.
 */
public class ColtFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new ColtRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public Gun createGun() {
        return new ColtGun();
    }

    @Override
    public BFG createBFG() {
        return new ColtBFG();
    }
}
