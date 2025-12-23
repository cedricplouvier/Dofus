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
                Location BB = new Location(1100, 250);
                s.doubleClick(BB);
        }
    }

    public void craftBatonDakn() throws InterruptedException, FindFailed {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);

        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(potionFoyer);

        while(true) {

            TimeUnit.SECONDS.sleep(2);
            Location A = new Location(820, 290);
            s.click(A);
            TimeUnit.SECONDS.sleep(3);
            Location B = new Location(670, 380);
            s.click(B);
            TimeUnit.SECONDS.sleep(2);
            s.click(ouvreCoffre);
            TimeUnit.SECONDS.sleep(2);
            /*s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Zero);
            TimeUnit.SECONDS.sleep(1);
            s.click(Seven);
            TimeUnit.SECONDS.sleep(1);
            s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.mouseMove(50,50);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Six);
            TimeUnit.SECONDS.sleep(1);
            s.click(delock);*/

            if (!firstCraft) {

                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Location AA = new Location(1050, 200);
                    s.click(AA);
                    TimeUnit.MILLISECONDS.sleep(500);
                    Location BB = new Location(1050, 260);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(BB, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionGelees = s.find(geleesRouge);
            s.dragDrop(regionGelees, I);
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
            s.dragDrop(regionPoudre, I);
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
            s.dragDrop(regionNoyer, I);
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
            s.dragDrop(regionErable, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            //s.click(close);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(840, 300);
            s.click(J);
            TimeUnit.SECONDS.sleep(3);
            Location K = new Location(850, 400);
            s.click(K);
            TimeUnit.MILLISECONDS.sleep(500);
            Location L = new Location(920, 540);
            s.click(L);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionGelees2 = s.find(geleesRouge);
            s.dragDrop(regionGelees2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionPoudre2 = s.find(poudrePerlenpain);
            s.dragDrop(regionPoudre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(75);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftBatonDaknPublic() throws InterruptedException, FindFailed, IOException {
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
                    Location AA = new Location(1050, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location AAA = new Location(400, 200);
                    s.click(AAA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionArcEco = s.find(batonDakn);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionArcEco, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }
            }

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionGelees = s.find(geleesRouge);
            s.dragDrop(regionGelees, I);
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
            s.dragDrop(regionPoudre, I);
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
            s.dragDrop(regionNoyer, I);
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
            s.dragDrop(regionErable, I);
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
            Location J = new Location(840, 300);
            s.click(J);
            TimeUnit.SECONDS.sleep(3);
            Location K = new Location(850, 400);
            s.click(K);
            TimeUnit.MILLISECONDS.sleep(500);
            Location L = new Location(920, 540);
            s.click(L);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionGelees2 = s.find(geleesRouge);
            s.dragDrop(regionGelees2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionPoudre2 = s.find(poudrePerlenpain);
            s.dragDrop(regionPoudre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(15);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void craftBaton110() throws InterruptedException, FindFailed {

        int amountCraft = 60;
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(potionFoyer);

            TimeUnit.SECONDS.sleep(2);
            Location A = new Location(820, 290);
            s.click(A);
            TimeUnit.SECONDS.sleep(3);
            Location B = new Location(670, 380);
            s.click(B);
            TimeUnit.SECONDS.sleep(2);
            s.click(ouvreCoffre);
            TimeUnit.SECONDS.sleep(2);
            /*s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Zero);
            TimeUnit.SECONDS.sleep(1);
            s.click(Seven);
            TimeUnit.SECONDS.sleep(1);
            s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.mouseMove(50,50);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Six);
            TimeUnit.SECONDS.sleep(1);
            s.click(delock);*/

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionsOsChafer = s.find(osChafer);
            s.dragDrop(regionsOsChafer, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionNoyer = s.find(boisNoyer);
            s.dragDrop(regionNoyer, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Match regionChene = s.find(boisChene);
            s.dragDrop(regionChene, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            //s.click(close);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(840, 300);
            s.click(J);
            TimeUnit.SECONDS.sleep(3);
            Location K = new Location(850, 400);
            s.click(K);
            TimeUnit.MILLISECONDS.sleep(500);
            Location L = new Location(920, 540);
            s.click(L);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionsOsChafer2 = s.find(osChafer);
            s.dragDrop(regionsOsChafer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(85);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(1);
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(300);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(2);
            Location V = new Location(750, 145);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(700);
            Location W = new Location(750, 200);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(700);
            Location X = new Location(970, 420);
            s.click(X);
            TimeUnit.SECONDS.sleep(4);
            Location Y = new Location(565, 320);
            s.click(Y);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location Z = new Location(620, 335);
            s.click(Z);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location AA = new Location(1060, 260);
            s.click(AA);

            for(int j=0 ; j<amountCraft;j++){

                TimeUnit.MILLISECONDS.sleep(500);
                Location BB = new Location(1060, 320);
                s.click(BB);
                TimeUnit.MILLISECONDS.sleep(1000);
                Location CC = new Location(1060, 320);
                s.click(CC);
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
            craftBaton110();
        }
    }

    public void craftBaton110Public() throws InterruptedException, FindFailed, IOException {

        int amountCraft = 100;
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, I);
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
            s.dragDrop(regionBoisNoyer, I);
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
            s.dragDrop(regionOsChafer, I);
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
            s.dragDrop(regionBoisChene, I);
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

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM5);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBoisNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionBoisNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionOsChafer2 = s.find(osChafer);
            s.dragDrop(regionOsChafer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBoisChene2 = s.find(boisChene);
            s.dragDrop(regionBoisChene2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(2);
            Location V = new Location(750, 145);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location W = new Location(750, 200);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location X = new Location(970, 420);
            s.click(X);
            TimeUnit.SECONDS.sleep(8);
            Location Y = new Location(565, 320);
            s.click(Y);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location Z = new Location(620, 335);
            s.click(Z);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location AA = new Location(1060, 260);
            s.click(AA);

            for(int j=0 ; j<amountCraft;j++){

                TimeUnit.MILLISECONDS.sleep(500);
                Location BB = new Location(1060, 320);
                s.click(BB);
                TimeUnit.MILLISECONDS.sleep(1000);
                Location CC = new Location(1060, 320);
                s.click(CC);
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

    public void craftSylvien() throws InterruptedException, FindFailed {

        int amountCraft = 100;
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(potionFoyer);

            TimeUnit.SECONDS.sleep(2);
            Location A = new Location(820, 290);
            s.click(A);
            TimeUnit.SECONDS.sleep(3);
            Location B = new Location(670, 380);
            s.click(B);
            TimeUnit.SECONDS.sleep(2);
            s.click(ouvreCoffre);
            TimeUnit.SECONDS.sleep(2);
            /*s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Zero);
            TimeUnit.SECONDS.sleep(1);
            s.click(Seven);
            TimeUnit.SECONDS.sleep(1);
            s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.mouseMove(50,50);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Six);
            TimeUnit.SECONDS.sleep(1);
            s.click(delock);*/

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, I);
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
            s.dragDrop(regionBoisNoyer, I);
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
            s.dragDrop(regionBourgeonAbra, I);
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
            s.dragDrop(regionAmbre, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            //kb.type(Key.NUM0);
            //TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Match regionAluminite = s.find(aluminite);
            s.dragDrop(regionAluminite, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            //kb.type(Key.NUM0);
            //TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            //s.click(close);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(840, 300);
            s.click(J);
            TimeUnit.SECONDS.sleep(3);
            Location K = new Location(850, 400);
            s.click(K);
            TimeUnit.MILLISECONDS.sleep(500);
            Location L = new Location(920, 565
            );
            s.click(L);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAmbre2 = s.find(ambre);
            s.dragDrop(regionAmbre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBourgeonAbra2 = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAluminite2 = s.find(aluminite);
            s.dragDrop(regionAluminite2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
            TimeUnit.SECONDS.sleep(1);
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(2);
            Location V = new Location(600, 390);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location W = new Location(690, 510);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(15000);
            Location X = new Location(990, 300);
            s.click(X);
            TimeUnit.MILLISECONDS.sleep(700);
            Location Y = new Location(1000, 340);
            s.click(Y);
            TimeUnit.SECONDS.sleep(5);
            Location Z = new Location(880, 250);
            s.click(Z);
            TimeUnit.MILLISECONDS.sleep(500);

            for(int j=0 ; j<amountCraft;j=j+8){
                for(int k=0; k<8; k++) {
                    TimeUnit.MILLISECONDS.sleep(500);
                    Location BB = new Location(880, 320);
                    s.doubleClick(BB);
                    TimeUnit.MILLISECONDS.sleep(200);
                }
                TimeUnit.MILLISECONDS.sleep(500);
                Location CC = new Location(1150, 560);
                s.click(CC);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.ENTER);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.ENTER);
                TimeUnit.MILLISECONDS.sleep(500);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftSylvien();
        }
    }

    public void craftSylvienPublic() throws InterruptedException, FindFailed, IOException {

        int amountCraft = 100;
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, I);
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
            s.dragDrop(regionBoisNoyer, I);
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
            s.dragDrop(regionBourgeonAbra, I);
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
            s.dragDrop(regionAmbre, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            //kb.type(Key.NUM0);
            //TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Match regionAluminite = s.find(aluminite);
            s.dragDrop(regionAluminite, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            //kb.type(Key.NUM0);
            //TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            //s.click(close);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierSculpteurBaguette();

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAmbre2 = s.find(ambre);
            s.dragDrop(regionAmbre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionBourgeonAbra2 = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionAluminite2 = s.find(aluminite);
            s.dragDrop(regionAluminite2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(4);
            Location V = new Location(600, 390);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(3000);
            Location W = new Location(690, 510);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(20000);
            Location X = new Location(990, 300);
            s.click(X);
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                    Location BB = new Location(1050, 270);
                    s.doubleClick(BB);
                    TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            Location CC = new Location(950, 560);
            s.click(CC);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            TimeUnit.MILLISECONDS.sleep(500);
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
                    Location AA = new Location(1050, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location BB = new Location(1050, 260);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(BB, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);
            Location H = new Location(530, 230);
            s.click(H);
            TimeUnit.SECONDS.sleep(1);
            s.click(minerai);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionArgent = s.find(argent);
            s.dragDrop(regionArgent, I);
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
            s.dragDrop(regionBronze, I);
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
            s.dragDrop(regionCuivre, I);
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
            s.dragDrop(regionEtain, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(950, 400);
            s.click(J);
            TimeUnit.SECONDS.sleep(5);
            Location K = new Location(910, 420);
            s.click(K);
            TimeUnit.SECONDS.sleep(5);
            Location L = new Location(790, 60);
            s.click(L);
            TimeUnit.SECONDS.sleep(5);
            Location M = new Location(1250, 510);
            s.click(M);
            TimeUnit.SECONDS.sleep(5);
            Location N = new Location(790, 340);
            s.click(N);
            TimeUnit.SECONDS.sleep(5);
            Location O = new Location(750, 270);
            s.click(O);
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerEpee);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionArgent2 = s.find(argent);
            s.dragDrop(regionArgent2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBronze2 = s.find(bronze);
            s.dragDrop(regionBronze2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionCuivre2 = s.find(cuivre);
            s.dragDrop(regionCuivre2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEtain2 = s.find(etain);
            s.dragDrop(regionEtain2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
        TimeUnit.SECONDS.sleep(5);
        int amountCraft = 100;

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);
            Location H = new Location(560, 230);
            s.click(H);
            TimeUnit.SECONDS.sleep(1);
            s.click(minerai);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionArgent = s.find(bauxite);
            s.dragDrop(regionArgent, I);
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
            s.dragDrop(regionBronze, I);
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
            s.dragDrop(regionCuivre, I);
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
            s.dragDrop(regionEtain, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(950, 400);
            s.click(J);
            TimeUnit.SECONDS.sleep(5);
            Location K = new Location(910, 420);
            s.click(K);
            TimeUnit.SECONDS.sleep(5);
            Location L = new Location(790, 60);
            s.click(L);
            TimeUnit.SECONDS.sleep(5);
            Location M = new Location(1250, 510);
            s.click(M);
            TimeUnit.SECONDS.sleep(5);
            Location N = new Location(790, 340);
            s.click(N);
            TimeUnit.SECONDS.sleep(5);
            Location O = new Location(750, 270);
            s.click(O);
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerEpee);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionArgent2 = s.find(bauxite);
            s.dragDrop(regionArgent2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM5);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBronze2 = s.find(argent);
            s.dragDrop(regionBronze2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionCuivre2 = s.find(cuivre);
            s.dragDrop(regionCuivre2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEtain2 = s.find(bronze);
            s.dragDrop(regionEtain2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(180);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(4);
            Location V = new Location(600, 390);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(3000);
            Location W = new Location(690, 510);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(20000);
            Location X = new Location(990, 300);
            s.click(X);
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                Location BB = new Location(1050, 270);
                s.doubleClick(BB);
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            Location CC = new Location(950, 560);
            s.click(CC);
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
        TimeUnit.SECONDS.sleep(5);
        int amountCraft = 50;

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionBauxite = s.find(bauxite);
            s.dragDrop(regionBauxite, I);
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
            s.dragDrop(regionNoyer, I);
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
            s.dragDrop(regionChene, I);
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
            s.dragDrop(regionKobalte, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(950, 400);
            s.click(J);
            TimeUnit.SECONDS.sleep(5);
            Location K = new Location(910, 420);
            s.click(K);
            TimeUnit.SECONDS.sleep(5);
            Location L = new Location(790, 60);
            s.click(L);
            TimeUnit.SECONDS.sleep(5);
            Location M = new Location(1250, 510);
            s.click(M);
            TimeUnit.SECONDS.sleep(5);
            Location N = new Location(790, 340);
            s.click(N);
            TimeUnit.SECONDS.sleep(5);
            Location O = new Location(750, 270);
            s.click(O);
            TimeUnit.SECONDS.sleep(1);
            s.click(forgerHache);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionBauxite2 = s.find(bauxite);
            s.dragDrop(regionBauxite2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionKobalte2 = s.find(kobalte);
            s.dragDrop(regionKobalte2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(90);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);

            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBrakmar);
            TimeUnit.SECONDS.sleep(3);
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(4);
            Location V = new Location(600, 390);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(3000);
            Location W = new Location(690, 510);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(20000);
            Location X = new Location(990, 300);
            s.click(X);
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                Location BB = new Location(1050, 270);
                s.doubleClick(BB);
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            Location CC = new Location(950, 560);
            s.click(CC);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(500);
            craftHacheTerophyle();
        }
    }

    public void polirPDAPetiteHazar() throws InterruptedException, FindFailed, IOException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        boolean firstCraft = true;

        Pattern pattern = null;
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre2();

            if (!firstCraft) {

                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Location AA = new Location(1130, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location BB = new Location(1050, 260);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(BB, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }
            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionGranit = s.find(pierreGranit);
            s.dragDrop(regionGranit, I);
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
            s.dragDrop(regionPierrePolie, I);
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
            s.dragDrop(regionSilex, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location H = new Location(400, 200);
            s.click(H);
            TimeUnit.SECONDS.sleep(1);

            Match regionPotionVieilesse = s.find(potionVieilesse);
            s.dragDrop(regionPotionVieilesse, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierMineur();
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            Location QQ = new Location(900, 250);

            TimeUnit.SECONDS.sleep(1);
            Match regionPierreGranit2 = s.find(pierreGranit);
            s.dragDrop(regionPierreGranit2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionPierrePolie2 = s.find(pierrePolie);
            s.dragDrop(regionPierrePolie2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionSilex2 = s.find(silex);
            s.dragDrop(regionSilex2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(QQ);
            TimeUnit.SECONDS.sleep(2);
            Match regionPotionVieilesse2 = s.find(potionVieilesse2);
            s.dragDrop(regionPotionVieilesse2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
        boolean firstCraft = true;

        Pattern pattern = null;
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            general.zaapAstrubToMaisonCoffre2();

            if (!firstCraft) {

                for (int i = 0; i < 1; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Location AA = new Location(1100, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location BB = new Location(1050, 260);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(BB, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

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
            s.dragDrop(regionPattern, I);
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
            s.dragDrop(regionEau, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierMineur();
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);
            Location Q = new Location(930, 250);

            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionPattern2 = s.find(pattern);
            s.dragDrop(regionPattern2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionEau2 = s.find(eau);
            s.dragDrop(regionEau2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
                    Location AAA = new Location(1250, 680);
                    s.click(AAA);
                    TimeUnit.SECONDS.sleep(1);
                    Location AA = new Location(1070, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoBonta = s.find(popoBontaInventaire);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionPopoBonta, region2);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.ENTER);
                    TimeUnit.SECONDS.sleep(1);
                    Location AAAA = new Location(1250, 720);
                    s.click(AAAA);
                }

            }

            Location I = new Location(1100, 470);

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(400, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);

            Match regionPatternFiole = s.find(fiolePandaburg);
            s.dragDrop(regionPatternFiole, I);
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
            s.dragDrop(regionPatternRiz, I);
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

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            Location P = new Location(1220, 500);
            Location Q = new Location(930, 250);
            Location QQ = new Location(900, 250);

            s.click(Q);
            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz2 = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(QQ);
            TimeUnit.SECONDS.sleep(1);
            Match regionFiole2 = s.find(fiolePandaburg);
            s.dragDrop(regionFiole2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
                    Location AA = new Location(1070, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoBrak = s.find(popoBrak);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionPopoBrak, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }

            Location I = new Location(1100, 470);

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(400, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);

            Match regionPatternFiole = s.find(fiolePandaPils);
            s.dragDrop(regionPatternFiole, I);
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
            s.dragDrop(regionPatternRiz, I);
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

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            Location P = new Location(1220, 500);
            Location Q = new Location(930, 250);
            Location QQ = new Location(900, 250);

            s.click(Q);
            TimeUnit.SECONDS.sleep(2);
            Match regionPatternRiz2 = s.find(rizInventaire2);
            s.dragDrop(regionPatternRiz2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(QQ);
            TimeUnit.SECONDS.sleep(1);
            Match regionFiole2 = s.find(fiolePandaPils);
            s.dragDrop(regionFiole2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
                    Location AA = new Location(1070, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoVieillesse = s.find(potionVieilesse);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionPopoVieillesse, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }

            Location I = new Location(1100, 470);

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(420, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);

            Match regionBaveBouftou = s.find(baveBouftou);
            s.dragDrop(regionBaveBouftou, I);
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
            s.dragDrop(regionChanvre, I);
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

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            Location P = new Location(1220, 500);
            Location Q = new Location(930, 250);

            s.click(Q);
            TimeUnit.SECONDS.sleep(2);
            Match regionChanvre2 = s.find(chanvre);
            s.dragDrop(regionChanvre2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionBaveBouftou2 = s.find(baveBouftou);
            s.dragDrop(regionBaveBouftou2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
                    Location AAAAA = new Location(1250, 680);
                    s.click(AAAAA);
                    TimeUnit.SECONDS.sleep(1);
                    Location AA = new Location(1070, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location AAA = new Location(370, 200);
                    s.click(AAA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionPopoRappel = s.find(popoRappel);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionPopoRappel, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                    TimeUnit.SECONDS.sleep(1);
                    Location AAAA = new Location(1250, 720);
                    s.click(AAAA);
                }

            }

            Location I = new Location(1100, 470);

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(420, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);

            Match regionEau = s.find(eau);
            s.dragDrop(regionEau, I);
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
            s.dragDrop(regionTrefle, I);
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

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAtelierAlchi();
            TimeUnit.SECONDS.sleep(1);

            Location P = new Location(1220, 500);
            Location Q = new Location(930, 250);

            s.click(Q);
            TimeUnit.SECONDS.sleep(2);
            Match regionEau2 = s.find(eau);
            s.dragDrop(regionEau2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionTrefle2 = s.find(trefle);
            s.dragDrop(regionTrefle2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            for(int k = 0; k<1 ; k++){
                TimeUnit.SECONDS.sleep(210);
                Location RR = new Location(100, 100);
                s.click(RR);
            }
            TimeUnit.MILLISECONDS.sleep(500);
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
                    Location AA = new Location(1050, 200);
                    s.click(AA);
                    TimeUnit.SECONDS.sleep(1);
                    Location AAA = new Location(400, 200);
                    s.click(AAA);
                    TimeUnit.SECONDS.sleep(1);
                    Match regionArcEco = s.find(arcEco);
                    Location region2 = new Location(500, 470);
                    s.dragDrop(regionArcEco, region2);
                    TimeUnit.SECONDS.sleep(1);
                    s.click(max);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.ENTER);
                }

            }

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionBourgeon = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeon, I);
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
            s.dragDrop(regionChataignier, I);
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
            s.dragDrop(regionFicelleLin, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);
            general.maisonAstrubToAterlierSculpteurArc();

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionBourgeonAbra2 = s.find(bourgeonAbra);
            s.dragDrop(regionBourgeonAbra2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier2 = s.find(boisChataignier);
            s.dragDrop(regionChataignier2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionFicelleLin2 = s.find(ficelleLin);
            s.dragDrop(regionFicelleLin2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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

        int amountCraft = 150;
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        while(true) {
            TimeUnit.SECONDS.sleep(5);
            general.zaapAstrubToMaisonCoffre1();

            TimeUnit.SECONDS.sleep(3);
            Location F = new Location(1100, 200);
            s.click(F);
            TimeUnit.SECONDS.sleep(1);
            Location G = new Location(420, 200);
            s.click(G);
            TimeUnit.SECONDS.sleep(1);

            Location I = new Location(1100, 470);

            Match regionErable = s.find(boisErable);
            s.dragDrop(regionErable, I);
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
            s.dragDrop(regionBoisChene, I);
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
            s.dragDrop(regionFleurDeChanvre, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);

            TimeUnit.MILLISECONDS.sleep(500);

            //s.click(close);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(1);
            general.maisonAstrubToAterlierBijoutierAmu();

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionFleurDeChanvre2 = s.find(fleurDeChanvre);
            s.dragDrop(regionFleurDeChanvre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(500);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
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
            Location T = new Location(1050, 145);
            s.click(T);
            TimeUnit.MILLISECONDS.sleep(1000);
            Location U = new Location(1100, 185);
            s.click(U);
            TimeUnit.SECONDS.sleep(4);
            Location V = new Location(600, 390);
            s.click(V);
            TimeUnit.MILLISECONDS.sleep(3000);
            Location W = new Location(690, 510);
            s.click(W);
            TimeUnit.MILLISECONDS.sleep(20000);
            Location X = new Location(990, 300);
            s.click(X);
            TimeUnit.MILLISECONDS.sleep(700);
            Match briserObjet = s.find(general.briserObjet);
            s.click(briserObjet);
            TimeUnit.SECONDS.sleep(5);

            for(int j=0 ; j<amountCraft;j++){
                Location BB = new Location(1050, 270);
                s.doubleClick(BB);
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            Location CC = new Location(950, 560);
            s.click(CC);
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
