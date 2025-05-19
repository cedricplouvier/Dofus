import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BotsRecolte extends Main{

    static General general = new General();
    public void recolteRiz() throws FindFailed, InterruptedException, IOException {

        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        boolean inCombat = false;
        boolean fullPods = false;
        boolean first = true;

        while (true) {
            TimeUnit.SECONDS.sleep(5);
            s.click(zaapAstrub);
            TimeUnit.SECONDS.sleep(2);
            s.click(utiliser);
            TimeUnit.SECONDS.sleep(1);
            for (int j = 0; j < 4; j++) {
                Location C = new Location(1035, 400);
                s.click(C);
                TimeUnit.MILLISECONDS.sleep(200);
            }
            TimeUnit.SECONDS.sleep(1);
            s.click(zaapPandalaEau);
            TimeUnit.SECONDS.sleep(1);
            s.click(oui);
            TimeUnit.SECONDS.sleep(2);
            Location D = new Location(500, 60);
            s.click(D);
            TimeUnit.SECONDS.sleep(8);
            Location E = new Location(370, 440);
            s.click(E);
            TimeUnit.SECONDS.sleep(5);
            Location F = new Location(700, 70);
            s.click(F);
            TimeUnit.SECONDS.sleep(8);
            first=true;
            for (int i = 0; i < 200; i++) {
                s.click(riz);
                TimeUnit.MILLISECONDS.sleep(1500);
                s.click(faucher);
                if (first){
                    TimeUnit.MILLISECONDS.sleep(5000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(1500);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    Location A = new Location(500, 370);
                    s.click(A);
                    TimeUnit.MILLISECONDS.sleep(800);
                    Location B = new Location(770, 370);
                    s.click(B);
                    s.type(Key.F1);
                    /*TimeUnit.MILLISECONDS.sleep(8000);
                    Location AA = new Location(800, 350);
                    s.click(AA);*/
                    while (s.exists(epouventailFight) != null) {
                        s.type(Key.F6);
                        s.click(epouventailFight);
                        TimeUnit.MILLISECONDS.sleep(800);
                        s.type(Key.F1);
                        TimeUnit.MILLISECONDS.sleep(5000);
                    }
                }
            }
            Location G = new Location(1030, 630);
            s.click(G);
            TimeUnit.MILLISECONDS.sleep(800);
            Location H = new Location(1140, 155);
            s.click(H);
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < 6; k++){
                Location HH = new Location(1100, 250);
                s.doubleClick(HH);
                TimeUnit.MILLISECONDS.sleep(1000);
            }
            /*while (s.exists(sacDeRiz) != null) {
                s.doubleClick(sacDeRiz);
                TimeUnit.MILLISECONDS.sleep(1500);
            }*/
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            Location I = new Location(1100, 200);
            s.click(I);
            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(370, 200);
            s.click(J);
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(rizInventaire);
            Location K = new Location(500, 470);
            s.dragDrop(region1, K);
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.click(check);
            TimeUnit.SECONDS.sleep(1);
            s.click(close);
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(popoBonta);
            TimeUnit.SECONDS.sleep(8);
            s.doubleClick(popoRappel);
        }
    }
}
