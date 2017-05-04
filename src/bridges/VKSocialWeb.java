package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class VKSocialWeb extends BasicSocialWeb {
    String getHistory()
    {
        return "Сегодня на VK";
    }
    List<Integer> getLikes(int userID, int messageID){
        return Arrays.asList(1,2,3);
    }
}
