package factory.beretto;

import factory.*;

/**
 * Created by Shoma on 03.05.2017.
 */
public class BerettoFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new BerettoRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new BerettoRifle();
    }

    @Override
    public Gun createGun() {
        return new BerettoGun();
    }

    @Override
    public BFG createBFG() {
        return new BerettoBFG();
    }
}
