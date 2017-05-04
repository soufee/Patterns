package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by Shoma on 03.05.2017.
 */
public class DzhamshutBuilder implements HouseBuilder {
    String basement;
    String wall;
    String roof;

    @Override
    public void fillBasement() {
        basement = "Фундамент";
    }

    @Override
    public void createWalls() {
wall = "Стена";
    }

    @Override
    public void createRoof() {
roof = "Крыша";
    }

    public String getResult()
    {
        return basement+" "+wall+" "+roof;
    }
}
