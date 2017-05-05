package state;

/**
 * Created by admin on 05.05.2017.
 */
public class SentState extends State {
    public SentState(Document document) {
        super(document);
    }

    @Override
    public String onNew() {
        return null;
    }

    @Override
    public String onFirstSigned() {
        return null;
    }

    @Override
    public String onSending() {
        return null;
    }

    @Override
    public String onSignMistake() {
        return null;
    }

    @Override
    public String onSent() {
        return null;
    }

    @Override
    public String onSendingMistake() {
        return null;
    }

    @Override
    public String onDelivered() {
        return null;
    }

    @Override
    public String onBroke() {
        return null;
    }

    @Override
    public String onSecondSigned() {
        return null;
    }

    @Override
    public String onSecondSignedReport() {
        return null;
    }

    @Override
    public String onBothSignedDocRegistered() {
        return null;
    }
}
