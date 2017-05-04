package bridges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb{
    private DB postgreDB = new PostgreDB();
    List<String> list = new ArrayList<>();
    {
        list.add("Alexey");
        list.add("Misha");
        list.add("Masha");

    }
  public   int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    List<String> wallMessages = new ArrayList<>();
    {
        wallMessages.add("Привет");
        wallMessages.add("Пока");
        wallMessages.add("АБВГД");
        wallMessages.add("Нет");
        wallMessages.add("Да");
    }
    @Override
    public List<String> getFriends() {
        return /*list*/ postgreDB.getListOfFriends();
    }

    @Override
    public void pay(int value) {
money+=(value+postgreDB.getMoney());
    }

    @Override
    public List<String> wall() {
        return postgreDB.getWall();
    }
}
