package builder.svetlakov;

import builder.HouseBuilder;

/**
 * Created by Shoma on 03.05.2017.
 */
public class Boss {
    private HouseBuilder builder;

    public Boss(HouseBuilder builder) {
        this.builder = builder;
    }

    public void build()
    {
        builder.fillBasement();
        builder.createWalls();
        builder.createRoof();
        System.out.println(builder.getResult());
    }
}
