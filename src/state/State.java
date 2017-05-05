package state;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {
    Document document = new Document();

    public State(Document document) {
        this.document = document;
    }

    public abstract String onNew();                         //Создано новый документ
    public abstract String onFirstSigned();                 //Подписан первым
    public abstract String onSending();                     //Посылается
    public abstract String onSignMistake();                 //Ошибка подписи
    public abstract String onSent();                        //Документ отослан
    public abstract String onSendingMistake();              //Ошибка отправки
    public abstract String onDelivered();                   //Документ доставлен
    public abstract String onBroke();                       //Документ отозван
    public abstract String onSecondSigned();                //Второй подписал
    public abstract String onSecondSignedReport();          //Первый информируется что второй подписал
    public abstract String onBothSignedDocRegistered ();    //Оба подписали и документ зарегистрирован



}
