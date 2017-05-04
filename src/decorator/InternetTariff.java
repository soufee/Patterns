package decorator;

/**
 * Created by Shoma on 04.05.2017.
 */
public class InternetTariff extends TariffDecorator {
    public InternetTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 Mb/s of internet");
        super.processTariff();
    }
}
