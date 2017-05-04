package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shoma on 04.05.2017.
 */
public class HR implements Observable{
    private List<Observer> list = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
list.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o:list) {
            o.message("We have a new job");
        }
    }
}
