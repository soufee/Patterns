package bridges;

/**
 * Created by Shoma on 04.05.2017.
 */
public class Inspector {
    BasicSocialWeb basicSocialWeb;

    public Inspector(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

   public void printPayments(){
        String socialWeb = basicSocialWeb.getClass().getSimpleName();
        int allMoney = basicSocialWeb.getMoney();
        System.out.println("В социальной сети "+socialWeb+" совершено платежей на сумму "+allMoney);
    }
}
