package observer;

/**
 * Created by Shoma on 04.05.2017.
 */
public class Worker implements Observer {
  private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void message(String mess) {
        System.out.println(id+" :: "+mess);
    }
}
