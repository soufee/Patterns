package state;

/**
 * Created by admin on 05.05.2017.
 */
public class NewState extends State{


    public NewState(Document document) {
        super(document);
        this.onNew();
        this.onFirstSigned();
    }


    @Override
    public String onNew() {
        document.setState(this);
        document.changeState(new FirstSignedState(document));
        return "New doc is created";
    }

    @Override
    public String onFirstSigned() {

      return document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSending() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSignMistake() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSent() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSendingMistake() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onDelivered() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onBroke() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSecondSigned() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onSecondSignedReport() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }

    @Override
    public String onBothSignedDocRegistered() {
        return "Сначала документ должен быть подписан. Его нынешний статус "+document.getState().getClass().getSimpleName();
    }
}
