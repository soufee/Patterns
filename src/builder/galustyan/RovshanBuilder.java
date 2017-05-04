package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by Shoma on 03.05.2017.
 */
public class RovshanBuilder implements HouseBuilder {
    String basement;
    String wall;
    String roof;

    @Override
    public void fillBasement() {
        basement = "Насяйника";
    }

    @Override
    public void createWalls() {
        wall = "Зачем";
    }

    @Override
    public void createRoof() {
        roof = "Ругаешься";
    }

    public String getResult() {
        return basement + " " + wall + " " + roof;
    }
}
