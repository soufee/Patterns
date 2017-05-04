package builder;

/**
 * Created by Shoma on 03.05.2017.
 */
public interface HouseBuilder {
    void fillBasement();
    void createWalls();
    void createRoof();
    String getResult();
}
