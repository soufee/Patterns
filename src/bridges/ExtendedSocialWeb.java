package bridges;

import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public interface ExtendedSocialWeb {
    String getHistory(int userID, String date);
    List<Integer> getLikes(int userID, boolean showNegative, int messageID);
}
