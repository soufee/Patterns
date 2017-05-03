import factory.mauser.MauserFactory;

/**
 * Created by Shoma on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MauserFactory factory = new MauserFactory();
        factory.createBFG();
        factory.createGun();
        factory.createRevolver();
        factory.createRifle();
    }
}
