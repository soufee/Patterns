package bridges;

import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public interface DB {
   List<String>  getListOfFriends();
   int getMoney();
   List<String> getWall();
}
