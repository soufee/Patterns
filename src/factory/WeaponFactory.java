package factory;

/**
 * Created by Shoma on 03.05.2017.
 */
public interface WeaponFactory {
    Revolver createRevolver();
    Rifle createRifle();
    Gun createGun();
    BFG createBFG();

}
