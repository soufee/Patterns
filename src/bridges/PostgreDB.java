package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class PostgreDB implements DB {
    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("postgre Masha", "postgre Vova", "postgre Katya");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("postgre story3", "postgre story1", "postgre story2");
    }
}
