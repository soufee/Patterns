package bridges;

/**
 * Created by Shoma on 04.05.2017.
 */
public class Detective {
    BasicSocialWeb basicSocialWeb;

    public Detective(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }
ExtendedSocialWeb socialWeb = new ExtendedSocialWebAdapter(basicSocialWeb);

 public    void getAllData (ExtendedSocialWeb socialWeb)
    {
        System.out.println("Пользователь получил лайков : "+socialWeb.getLikes(1, true, 2));
        System.out.println("За срок : " + socialWeb.getHistory(1, "Сегодня"));
        System.out.println("Платежей совершено на сумму: " + basicSocialWeb.getMoney());
    }


}
