package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class FBSocialWeb extends BasicSocialWeb {
    String getHistory(String date)
    {
        return "Сегодня на FB";
    }

    List<Integer> getLikes(int messageID, boolean showNegative, int userID){
        return Arrays.asList(5,6,7);
    }
}
