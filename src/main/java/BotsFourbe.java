import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BotsFourbe extends Main {

    /**
     * Sadi Farming bot for {0,7}.
     * Make sure to use transparant mode and make all group mobs visible to optimize
     * @throws InterruptedException
     * @throws FindFailed
     */

    static General general = new General();
    public void cheminFer() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        TimeUnit.SECONDS.sleep(5);
        //while(s.exists(tropCharge) == null){
        for(int i=0; i<200; i ++){
            try {
                boolean arakneFound = false;

                if(s.exists(options) != null){
                    s.type(Key.ESC);
                    TimeUnit.SECONDS.sleep(2);
                } else if(s.exists(mapSudCheminFer) != null){
                    Location MS = new Location(850, 60);
                    s.click(MS);
                } else if (s.exists(moskitoFront) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoFront);
                    System.out.println("moskitoFront");
                } else if (s.exists(moskitoLeft) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoLeft);
                    System.out.println("moskitoLeft");
                } /*else if (s.exists(moskitoBack) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoBack);
                    System.out.println("moskitoBack");
                } else if (s.exists(moskitoRight) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoRight);
                    System.out.println("moskitoRight");
                }*/ else if (s.exists(champChamp) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp);
                    System.out.println("champchamp");
                }
                else if (s.exists(champChamp2) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp2);
                    System.out.println("champchamp2");
                }
                else if (s.exists(champChamp3) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp3);
                    System.out.println("champchamp3");
                }
                else if (s.exists(arakneBack) != null) {
                    arakneFound=true;
                    s.rightClick(arakneBack);
                    System.out.println("arakneback");
                } else if (s.exists(arakneLeft) != null) {
                    arakneFound=true;
                    s.rightClick(arakneLeft);
                    System.out.println("arakneLeft");
                } else if (s.exists(arakneRight) != null) {
                    arakneFound=true;
                    s.rightClick(arakneRight);
                    System.out.println("arakneRight");
                } else if (s.exists(arakneFront) != null) {
                    arakneFound = true;
                    s.rightClick(arakneFront);
                    System.out.println("arakneFront");
                } else {
                    System.out.println("GROUP NOT FOUND");
                }
                if(arakneFound) {
                    TimeUnit.SECONDS.sleep(5);
                    Location A = new Location(840, 300);
                    s.click(A);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    Location B = new Location(770, 240);
                    s.click(B);

                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.F2);
                    s.click(sadiFight);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F3);
                    s.click(sadiFight);
                    TimeUnit.SECONDS.sleep(2);
                    while (s.exists(sadiFight) != null) {
                        TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F1);
                    }
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.ESC);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        TimeUnit.SECONDS.sleep(2);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        Location G = new Location(1100, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(360, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(patteArak);
        Location I = new Location(500, 470);
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(poudre);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(aileMoskito);
        s.dragDrop(region3, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region4 = s.find(sourcilMoskito);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region5 = s.find(epineChamp);
        s.dragDrop(region5, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(grainePavot);
        s.dragDrop(region6, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region8 = s.find(champignon);
        s.dragDrop(region8, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoBonta);
        TimeUnit.SECONDS.sleep(10);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);
        TimeUnit.SECONDS.sleep(2);
        Location J = new Location(360, 270);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(360, 300);
        s.click(K);
        TimeUnit.SECONDS.sleep(6);
        Location L = new Location(360, 200);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(360, 540);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(360, 470);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        cheminFer();
    }
}
