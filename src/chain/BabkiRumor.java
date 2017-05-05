package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class BabkiRumor extends Rumor {
    private boolean isAlive = true;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void obs() {
        if (!isAlive){
            System.out.println("Babkia is dead");
            return;
        }
        System.out.print("Babka said: ");
        super.obs();
    }
}
