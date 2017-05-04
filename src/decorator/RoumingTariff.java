package decorator;

/**
 * Created by Shoma on 04.05.2017.
 */
public class RoumingTariff extends TariffDecorator {
    public RoumingTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 1Gb in rouming");
        super.processTariff();
    }


}
