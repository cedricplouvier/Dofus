import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.util.concurrent.TimeUnit;

public class BotsCraft extends Main{

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
}
