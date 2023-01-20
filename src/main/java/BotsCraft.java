import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.util.concurrent.TimeUnit;

public class BotsCraft extends Main{

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

                for (int i = 0; i < i; i++) {
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
                    s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionPoudre2 = s.find(poudrePerlenpain);
            s.dragDrop(regionPoudre2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionErable2 = s.find(boisErable);
            s.dragDrop(regionErable2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM9);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
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
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionsOsChafer2 = s.find(osChafer);
            s.dragDrop(regionsOsChafer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionNoyer2 = s.find(boisNoyer);
            s.dragDrop(regionNoyer2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM4);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Match regionChene2 = s.find(boisChene);
            s.dragDrop(regionChene2, P);
            TimeUnit.MILLISECONDS.sleep(500);
            kb.type(Key.NUM2);
            s.click(check);
            TimeUnit.MILLISECONDS.sleep(500);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
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
            TimeUnit.MILLISECONDS.sleep(500);
            Location Z = new Location(620, 335);
            s.click(Z);
            TimeUnit.MILLISECONDS.sleep(500);
            Location AA = new Location(1060, 260);
            s.click(AA);

            for(int j=0 ; j<amountCraft;j++){

                TimeUnit.MILLISECONDS.sleep(500);
                Location BB = new Location(1060, 320);
                s.click(BB);
                TimeUnit.MILLISECONDS.sleep(100);
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

    public void craftTristeLame() throws InterruptedException, FindFailed {

        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            Location A = new Location(820, 60);
            s.click(A);
            TimeUnit.SECONDS.sleep(5);
            Location B = new Location(1245, 350);
            s.click(B);
            TimeUnit.SECONDS.sleep(5);
            Location C = new Location(490, 135);
            s.click(C);
            TimeUnit.SECONDS.sleep(2);
            s.click(entreMaison);
            TimeUnit.SECONDS.sleep(3);
            s.click(One);
            TimeUnit.SECONDS.sleep(1);
            s.click(Nine);
            TimeUnit.SECONDS.sleep(1);
            s.click(Zero);
            TimeUnit.SECONDS.sleep(1);
            s.click(Seven);
            TimeUnit.SECONDS.sleep(1);
            s.click(delock);
            TimeUnit.SECONDS.sleep(1);
            Location D = new Location(940, 370);
            s.click(D);
            TimeUnit.SECONDS.sleep(5);
            Location E = new Location(740, 440);
            s.click(E);
            TimeUnit.SECONDS.sleep(1);
            s.click(ouvreCoffre);
            TimeUnit.SECONDS.sleep(3);
            s.click(One);
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
            s.click(delock);

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
                    s.click(check);
                }

            }

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

            Match regionArgent = s.find(argent);
            s.dragDrop(regionArgent, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);

            Match regionBronze = s.find(bronze);
            s.dragDrop(regionBronze, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);

            Match regionCuivre = s.find(cuivre);
            s.dragDrop(regionCuivre, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);

            Match regionEtain = s.find(etain);
            s.dragDrop(regionEtain, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM6);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
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
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Match regionBronze2 = s.find(bronze);
            s.dragDrop(regionBronze2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM4);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Match regionCuivre2 = s.find(cuivre);
            s.dragDrop(regionCuivre2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM2);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Match regionEtain2 = s.find(etain);
            s.dragDrop(regionEtain2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(100);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }

    public void polirSaphir() throws InterruptedException, FindFailed {

        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        boolean firstCraft = true;
        TimeUnit.SECONDS.sleep(5);

        while(true) {
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            Location A = new Location(820, 60);
            s.click(A);
            TimeUnit.SECONDS.sleep(5);
            Location B = new Location(1245, 350);
            s.click(B);
            TimeUnit.SECONDS.sleep(4);
            Location C = new Location(490, 135);
            s.click(C);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(entreMaison);
            TimeUnit.SECONDS.sleep(3);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM7);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(delock);
            TimeUnit.SECONDS.sleep(1);
            Location D = new Location(940, 370);
            s.click(D);
            TimeUnit.SECONDS.sleep(3);
            Location E = new Location(840, 320);
            s.click(E);
            TimeUnit.SECONDS.sleep(3);
            Location EE = new Location(840, 450);
            s.click(EE);
            TimeUnit.MILLISECONDS.sleep(500);
            s.click(ouvreCoffre);
            TimeUnit.SECONDS.sleep(2);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM7);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM9);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM6);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(delock);

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
                    s.click(check);
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

            Match regionSaphir = s.find(pierreSaphir);
            s.dragDrop(regionSaphir, I);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM3);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
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
            s.click(check);
            TimeUnit.SECONDS.sleep(1);

            s.click(close);

            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(785, 370);
            s.click(J);
            TimeUnit.SECONDS.sleep(3);
            Location K = new Location(950, 410);
            s.click(K);
            TimeUnit.SECONDS.sleep(3);
            Location L = new Location(900, 420);
            s.click(L);
            TimeUnit.SECONDS.sleep(3);
            Location M = new Location(1250, 400);
            s.click(M);
            TimeUnit.SECONDS.sleep(5);
            Location N = new Location(1265, 340);
            s.click(N);
            TimeUnit.SECONDS.sleep(5);
            Location O = new Location(755, 270);
            s.click(O);
            TimeUnit.SECONDS.sleep(3);
            Location OO = new Location(1040, 370);
            s.click(OO);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(polirPierre);
            TimeUnit.SECONDS.sleep(3);

            Location P = new Location(1220, 500);

            Location Q = new Location(930, 250);
            s.click(Q);
            TimeUnit.SECONDS.sleep(1);
            Match regionSaphir2 = s.find(pierreSaphir);
            s.dragDrop(regionSaphir2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Match regionEau2 = s.find(eau);
            s.dragDrop(regionEau2, P);
            TimeUnit.SECONDS.sleep(1);
            kb.type(Key.NUM1);
            TimeUnit.MILLISECONDS.sleep(300);
            kb.type(Key.NUM0);
            TimeUnit.MILLISECONDS.sleep(300);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);

            Location R = new Location(1000, 550);
            s.click(R);
            TimeUnit.SECONDS.sleep(1);
            s.click(maxCraft);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            Location S = new Location(1200, 550);
            s.click(S);
            TimeUnit.SECONDS.sleep(40);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            firstCraft = false;
        }
    }
}
