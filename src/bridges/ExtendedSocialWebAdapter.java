package bridges;

import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class ExtendedSocialWebAdapter implements ExtendedSocialWeb {
    BasicSocialWeb basicSocialWeb;

    public ExtendedSocialWebAdapter(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

    @Override
    public String getHistory(int userID, String date) {
        if (basicSocialWeb instanceof VKSocialWeb)
        {
          return   new VKSocialWeb().getHistory();
        }
        if (basicSocialWeb instanceof FBSocialWeb)
        {
         return new FBSocialWeb().getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userID, boolean showNegative, int messageID) {
      if (basicSocialWeb instanceof VKSocialWeb)
      {
          return new VKSocialWeb().getLikes(userID,messageID);
      }
      if (basicSocialWeb instanceof FBSocialWeb)
      {
          return new FBSocialWeb().getLikes(messageID,showNegative,userID);
      }


        return null;
    }

}
