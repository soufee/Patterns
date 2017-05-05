package state;

/**
 * Created by admin on 05.05.2017.
 */
public class FirstSignedState extends State {
    public FirstSignedState(Document document) {
        super(document);
        this.onFirstSigned();
    }

    @Override
    public String onNew() {
        return null;
    }

    @Override
    public String onFirstSigned() {
        try {document.changeState(new FirstSignedState(document));
        return "Первый подписал";
        } catch (Exception e)
        {
            document.changeState(new SigneMistakeState(document));
        }
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
