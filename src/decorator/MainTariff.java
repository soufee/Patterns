package decorator;

/**
 * Created by Shoma on 04.05.2017.
 */
public class MainTariff implements CountTariffInterface{
    @Override
    public void processTariff() {
        System.out.println("This is MTS Tariff");
    }
}
