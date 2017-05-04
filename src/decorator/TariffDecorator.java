package decorator;

/**
 * Created by Shoma on 04.05.2017.
 */
public class TariffDecorator implements CountTariffInterface {
  CountTariffInterface tariff;


  @Override
    public void processTariff() {
    tariff.processTariff();
    }

    public TariffDecorator(CountTariffInterface tariff)
    {
        this.tariff = tariff;
    }
}
