package state;

/**
 * Created by admin on 05.05.2017.
 */
public class Document {
    State state;

    public void changeState(State state) {
        this.state = state;
    }

    public Document() {
        this.state = new NewState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
