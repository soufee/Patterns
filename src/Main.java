import bridges.*;
import builder.galustyan.DzhamshutBuilder;
import builder.galustyan.RovshanBuilder;
import builder.svetlakov.Boss;
import chain.BabkiRumor;
import chain.InternetRumors;
import chain.NewspaperRumors;
import decorator.InternetTariff;
import decorator.MainTariff;
import decorator.RoumingTariff;
import decorator.SMSTariff;
import factory.mauser.MauserFactory;
import observer.HR;
import observer.Worker;
import strategy.Context;

/**
 * Created by Shoma on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {

//        BabkiRumor babkiRumor = new BabkiRumor();
//        babkiRumor.setMessage("Наркоман!");
//        babkiRumor.setAlive(false);
//        NewspaperRumors newspaperRumors = new NewspaperRumors();
//       // newspaperRumors.setMessage("Babki says that he is Наркоман!");
//        newspaperRumors.setBalance(11000L);
//        InternetRumors internetRumors = new InternetRumors();
//        internetRumors.setConnect(false);
//        babkiRumor.setRumor(newspaperRumors);
//        newspaperRumors.setRumor(internetRumors);
//        babkiRumor.obs();

//        Context context = new Context();
//        context.setHasFamily(false);
//        context.setHasFriends(false);
//        context.setCash(10000);
//        context.celebrate();

//        MauserFactory factory = new MauserFactory();
//        factory.createBFG();
//        factory.createGun();
//        factory.createRevolver();
//        factory.createRifle();
//        Boss nasyalnika = new Boss(new RovshanBuilder());
//        Boss nasyalnika2 = new Boss(new DzhamshutBuilder());
//        nasyalnika.build();
//        nasyalnika2.build();
//
//        MainTariff mainTariff = new MainTariff();
//        SMSTariff smsTariff = new SMSTariff(mainTariff);
//        RoumingTariff roumingTariff = new RoumingTariff(smsTariff);
//        InternetTariff internetTariff = new InternetTariff(roumingTariff);
//        internetTariff.processTariff();
//        HR hr = new HR();
//        Worker worker1 = new Worker(1);
//        Worker worker2 = new Worker(2);
//        Worker worker3 = new Worker(3);
//        Worker worker4 = new Worker(4);
//
//        hr.registerObserver(worker1);
//        hr.registerObserver(worker2);
//        hr.registerObserver(worker3);
//        hr.registerObserver(worker4);
//
//        hr.notifyAllObservers();
//        BasicSocialWeb faceBook = new FBSocialWeb();
//        BasicSocialWeb VK = new VKSocialWeb();
//        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(faceBook);
//        ExtendedSocialWeb extendedSocialWeb1 = new ExtendedSocialWebAdapter(VK);
//
//        System.out.println(extendedSocialWeb.getHistory(1,"Сегодня"));
//
//        System.out.println(extendedSocialWeb.getLikes(1, true, 1));
//        System.out.println(extendedSocialWeb1.getHistory(2, "Вчера"));
//        System.out.println(extendedSocialWeb1.getLikes(2, false, 5));
//   faceBook.pay(500);
//   faceBook.pay(25);
//   VK.pay(300);
//   VK.pay(150);
//
//   Inspector inspector = new Inspector(faceBook);
//   Inspector inspector2 = new Inspector(VK);
//   inspector2.printPayments();
//   inspector.printPayments();
//
//   Detective detective = new Detective(faceBook);
//   detective.getAllData(extendedSocialWeb);
//
//        Detective detective1 = new Detective(VK);
//        detective1.getAllData(extendedSocialWeb1);


    }
}
