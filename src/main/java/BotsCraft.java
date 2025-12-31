import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BotsCraft extends Main{

    static General general = new General();

    public static void ouvrirRunes() throws InterruptedException, FindFailed {
        Screen s = new Screen();

        for(int i=0; i<200; i++){
                TimeUnit.MILLISECONDS.sleep(500);
                s.doubleClick(new Location(1100, 250));
        }
    }

    public void craftBatonDaknPublic() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(2);
            general.zaapAstrubToMaisonCoffre1();

            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(1050, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(400, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionArcEco = s.find(batonDakn);
                    s.dragDrop(regionArcEco, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionGelees = s.find(geleesRouge);
            s.dragDrop(regionGelees, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionPoudre = s.find(poudrePerlenpain);
            s.dragDrop(regionPoudre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionNoyer = s.find(boisNoyer);
            s.dragDrop(regionNoyer, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionErable = s.find(boisErable);
            s.dragDrop(regionErable, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierSculpteurBaton();

            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(840, 300));
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(850, 400));
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(920, 540));
            TimeUnit.SECONDS.sleep(3);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionGelees2 = s.find(geleesRouge);
            s.dragDrop(regionGelees2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionPoudre2 = s.find(poudrePerlenpain);
            s.dragDrop(regionPoudre2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(15);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftBaton110Public() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        int amountCraft = 100;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBoisNoyer = s.find(boisNoyer);
            s.dragDrop(regionBoisNoyer, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionOsChafer = s.find(osChafer);
            s.dragDrop(regionOsChafer, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBoisChene = s.find(boisChene);
            s.dragDrop(regionBoisChene, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierSculpteurBaton();

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBoisNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionBoisNoyer2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionOsChafer2 = s.find(osChafer);
            s.dragDrop(regionOsChafer2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBoisChene2 = s.find(boisChene);
            s.dragDrop(regionBoisChene2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(160);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(2);
            s.click(new Location(1050, 145));
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1100, 185));
            TimeUnit.SECONDS.sleep(2);
            s.click(new Location(750, 145));
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(750, 200));
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(970, 420));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(565, 320));
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(620, 335));
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1060, 260));

            for(int j=0 ; j<amountCraft;j++){
                TimeUnit.MILLISECONDS.sleep(500);
                s.click(new Location(1060, 320));
                TimeUnit.MILLISECONDS.sleep(1000);
                s.click(new Location(1060, 320));
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.ENTER);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.ENTER);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.ENTER);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftBaton110Public();
        }
    }

    public void craftSylvienPublic() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        int amountCraft = 100;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);


            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBoisNoyer = s.find(boisNoyer);
            s.dragDrop(regionBoisNoyer, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBourgeonAbra = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionAmbre = s.find(ambre);
            s.dragDrop(regionAmbre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Match regionAluminite = s.find(aluminite);
            s.dragDrop(regionAluminite, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierSculpteurBaguette();


            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAmbre2 = s.find(ambre);
            s.dragDrop(regionAmbre2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBourgeonAbra2 = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAluminite2 = s.find(aluminite);
            s.dragDrop(regionAluminite2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(25);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1050, 145));
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1100, 185));
            TimeUnit.SECONDS.sleep(4);
            s.click(new Location(600, 390));
            TimeUnit.MILLISECONDS.sleep(3000);
            s.click(new Location(690, 510));
            TimeUnit.MILLISECONDS.sleep(20000);
            s.click(new Location(990, 300));
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                    s.doubleClick(new Location(1050, 270));
                    TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(950, 560));
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(1000);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftSylvienPublic();
        }
    }

    public void craftTristeLame() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();
            if (!firstCraft) {
                for (int i = 0; i < 3; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1050, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.dragDrop(new Location(1050, 260), new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(530, 230));
            TimeUnit.SECONDS.sleep(1);
            s.click(minerai);
            TimeUnit.SECONDS.sleep(1);

            Match regionArgent = s.find(argent);
            s.dragDrop(regionArgent, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBronze = s.find(bronze);
            s.dragDrop(regionBronze, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionCuivre = s.find(cuivre);
            s.dragDrop(regionCuivre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionEtain = s.find(etain);
            s.dragDrop(regionEtain, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(950, 400));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(910, 420));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 60));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(1250, 510));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 340));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(750, 270));
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerEpee);
            TimeUnit.SECONDS.sleep(3);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionArgent2 = s.find(argent);
            s.dragDrop(regionArgent2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBronze2 = s.find(bronze);
            s.dragDrop(regionBronze2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionCuivre2 = s.find(cuivre);
            s.dragDrop(regionCuivre2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEtain2 = s.find(etain);
            s.dragDrop(regionEtain2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(20);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftLameDuChafer() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        int amountCraft = 100;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(560, 230));
            TimeUnit.SECONDS.sleep(1);
            s.click(minerai);
            TimeUnit.SECONDS.sleep(1);

            Match regionArgent = s.find(bauxite);
            s.dragDrop(regionArgent, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBronze = s.find(argent);
            s.dragDrop(regionBronze, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionCuivre = s.find(cuivre);
            s.dragDrop(regionCuivre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionEtain = s.find(bronze);
            s.dragDrop(regionEtain, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(950, 400));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(910, 420));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 60));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(1250, 510));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 340));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(750, 270));
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerEpee);
            TimeUnit.SECONDS.sleep(3);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionArgent2 = s.find(bauxite);
            s.dragDrop(regionArgent2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBronze2 = s.find(argent);
            s.dragDrop(regionBronze2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionCuivre2 = s.find(cuivre);
            s.dragDrop(regionCuivre2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEtain2 = s.find(bronze);
            s.dragDrop(regionEtain2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(180);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1050, 145));
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1100, 185));
            TimeUnit.SECONDS.sleep(4);
            s.click(new Location(600, 390));
            TimeUnit.MILLISECONDS.sleep(3000);
            s.click(new Location(690, 510));
            TimeUnit.MILLISECONDS.sleep(20000);
            s.click(new Location(990, 300));
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                s.doubleClick(new Location(1050, 270));
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(950, 560));
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftLameDuChafer();
        }
    }

    public void craftHacheTerophyle() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        int amountCraft = 50;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionBauxite = s.find(bauxite);
            s.dragDrop(regionBauxite, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionNoyer = s.find(boisNoyer);
            s.dragDrop(regionNoyer, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionChene = s.find(boisChene);
            s.dragDrop(regionChene, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionKobalte = s.find(kobalte);
            s.dragDrop(regionKobalte, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(950, 400));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(910, 420));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 60));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(1250, 510));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(790, 340));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(750, 270));
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerHache);
            TimeUnit.SECONDS.sleep(3);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionBauxite2 = s.find(bauxite);
            s.dragDrop(regionBauxite2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionKobalte2 = s.find(kobalte);
            s.dragDrop(regionKobalte2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(90);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1050, 145));
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1100, 185));
            TimeUnit.SECONDS.sleep(4);
            s.click(new Location(600, 390));
            TimeUnit.MILLISECONDS.sleep(3000);
            s.click(new Location(690, 510));
            TimeUnit.MILLISECONDS.sleep(20000);
            s.click(new Location(990, 300));
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                s.doubleClick(new Location(1050, 270));
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(950, 560));
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(1000);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftHacheTerophyle();
        }
    }

    public void polirPDAPetiteHazar() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre2();
            if (!firstCraft) {

                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1130, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.dragDrop(new Location(1050, 260), new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionGranit = s.find(pierreGranit);
            s.dragDrop(regionGranit, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionPierrePolie = s.find(pierrePolie);
            s.dragDrop(regionPierrePolie, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionSilex = s.find(silex);
            s.dragDrop(regionSilex, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(400, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionPotionVieilesse = s.find(potionVieilesse);
            s.dragDrop(regionPotionVieilesse, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierMineur();
            TimeUnit.SECONDS.sleep(3);


            s.click(new Location(930, 250));

            TimeUnit.SECONDS.sleep(1);
            Match regionPierreGranit2 = s.find(pierreGranit);
            s.dragDrop(regionPierreGranit2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionPierrePolie2 = s.find(pierrePolie);
            s.dragDrop(regionPierrePolie2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionSilex2 = s.find(silex);
            s.dragDrop(regionSilex2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(900, 250));
            TimeUnit.SECONDS.sleep(2);
            Match regionPotionVieilesse2 = s.find(potionVieilesse);
            s.dragDrop(regionPotionVieilesse2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void polirPierres(String pierre) throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        Pattern pattern = null;
        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre2();
            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1100, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.dragDrop(new Location(1050, 260), new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            if(pierre.matches("saphir")){
                pattern = pierreSaphir;
            } else if (pierre.matches("emeraude")) {
                pattern = pierreEmeraude;
            } else if (pierre.matches("cristal")) {
                pattern = pierreChristal;
            } else if (pierre.matches("rubis")) {
                pattern = pierreRubis;
            }

            Match regionPattern = s.find(pattern);
            s.dragDrop(regionPattern, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionEau = s.find(eau);
            s.dragDrop(regionEau, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierMineur();
            TimeUnit.SECONDS.sleep(3);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionPattern2 = s.find(pattern);
            s.dragDrop(regionPattern2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEau2 = s.find(eau);
            s.dragDrop(regionEau2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(10);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void potionBonta() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.SECONDS.sleep(1);
            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1250, 680));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1070, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoBonta = s.find(popoBontaInventaire);
                    s.dragDrop(regionPopoBonta, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(2);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.ENTER);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1250, 720));
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(400, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionPatternFiole = s.find(fiolePandaburg);
            s.dragDrop(regionPatternFiole, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location FF = new Location(430, 200);
            s.click(FF);

            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz2 = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(900, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionFiole2 = s.find(fiolePandaburg);
            s.dragDrop(regionFiole2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(250);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void potionBrak() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1070, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoBrak = s.find(popoBrak);
                    s.dragDrop(regionPopoBrak, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(400, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionPatternFiole = s.find(fiolePandaPils);
            s.dragDrop(regionPatternFiole, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(430, 200));

            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz2 = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(900, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionFiole2 = s.find(fiolePandaPils);
            s.dragDrop(regionFiole2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(200);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void potionVieillesse() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1070, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoVieillesse = s.find(potionVieilesse);
                    s.dragDrop(regionPopoVieillesse, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionBaveBouftou = s.find(baveBouftou);
            s.dragDrop(regionBaveBouftou, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            TimeUnit.SECONDS.sleep(2);
            Match regionChanvre = s.find(chanvre);
            s.dragDrop(regionChanvre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);


            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(2);
            Match regionChanvre2 = s.find(chanvre);
            s.dragDrop(regionChanvre2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBaveBouftou2 = s.find(baveBouftou);
            s.dragDrop(regionBaveBouftou2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(110);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void potionRappel() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1250, 680));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1070, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(370, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoRappel = s.find(popoRappel);
                    s.dragDrop(regionPopoRappel, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(1250, 720));
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionEau = s.find(eau);
            s.dragDrop(regionEau, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            TimeUnit.SECONDS.sleep(2);
            Match regionTrefle = s.find(trefle);
            s.dragDrop(regionTrefle, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(2);
            Match regionEau2 = s.find(eau);
            s.dragDrop(regionEau2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionTrefle2 = s.find(trefle);
            s.dragDrop(regionTrefle2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(200);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftArcEco() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            if (!firstCraft) {
                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(1050, 200));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(400, 200));
                    TimeUnit.SECONDS.sleep(1);
                    Match regionArcEco = s.find(arcEco);
                    s.dragDrop(regionArcEco, new Location(500, 470));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionBourgeon = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeon, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionFicelleLin = s.find(ficelleLin);
            s.dragDrop(regionFicelleLin, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ESC);
            general.maisonAstrubToAterlierSculpteurArc();

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionBourgeonAbra2 = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionFicelleLin2 = s.find(ficelleLin);
            s.dragDrop(regionFicelleLin2, new Location(1220, 500));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(540);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftMedailleHoly() throws FindFailed, InterruptedException, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        int amountCraft = 150;
        while(true) {
            TimeUnit.SECONDS.sleep(5);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(420, 200));
            TimeUnit.SECONDS.sleep(1);

            Match regionErable = s.find(boisErable);
            s.dragDrop(regionErable, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionBoisChene = s.find(boisChene);
            s.dragDrop(regionBoisChene, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionFleurDeChanvre = s.find(fleurDeChanvre);
            s.dragDrop(regionFleurDeChanvre, new Location(1100, 470));
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierBijoutierAmu();

            s.click(new Location(930, 250));
            TimeUnit.SECONDS.sleep(1);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionFleurDeChanvre2 = s.find(fleurDeChanvre);
            s.dragDrop(regionFleurDeChanvre2, new Location(1220, 500));
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            s.click(new Location(1000, 550));
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(1200, 550));
            TimeUnit.SECONDS.sleep(10);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(10);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);

            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1050, 145));
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1100, 185));
            TimeUnit.SECONDS.sleep(4);
            s.click(new Location(600, 390));
            TimeUnit.MILLISECONDS.sleep(3000);
            s.click(new Location(690, 510));
            TimeUnit.MILLISECONDS.sleep(20000);
            s.click(new Location(990, 300));
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                s.doubleClick(new Location(1050, 270));
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(new Location(950, 560));
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(1000);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftMedailleHoly();
        }
    }
}
