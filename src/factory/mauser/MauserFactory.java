package factory.mauser;

import factory.*;

/**
 * Created by Shoma on 03.05.2017.
 */
public class MauserFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new MauserRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new MauserRifle();
    }

    @Override
    public Gun createGun() {
        return new MauserGun();
    }

    @Override
    public BFG createBFG() {
        return new MauserBFG();
    }
}
