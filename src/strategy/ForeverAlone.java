package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class ForeverAlone implements HolidayStrategy{
    @Override
    public void celebrate() {
        System.out.println("Я самодостаточная сильная личность с 40 кошками");
    }
}
