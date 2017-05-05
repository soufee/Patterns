package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class NewspaperRumors extends Rumor{
    private long balance = 0;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public void obs() {
if (balance>10000)
{
    System.out.println("Rumors were false");
    return;
}
        System.out.print("Newspapers write: ");
        super.obs();
    }
}
