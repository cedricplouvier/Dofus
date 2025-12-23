import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.sikuli.script.Commands.doubleClick;

public class BotsRecolte extends Main{

    static General general = new General();

    public void recolteRiz() throws FindFailed, InterruptedException, IOException {

        Screen s = new Screen();
        boolean first = true;

        while (true) {
            TimeUnit.SECONDS.sleep(5);
            doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            s.rightClick(zaapAstrub);
            TimeUnit.SECONDS.sleep(2);
            for (int j = 0; j < 20; j++) {
                Location C = new Location(1100, 440);
                s.click(C);
                TimeUnit.MILLISECONDS.sleep(500);
            }
            TimeUnit.SECONDS.sleep(1);
            s.doubleClick(zaapPandalaEau);
            TimeUnit.SECONDS.sleep(3);
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
                try {
                    s.click(riz);
                } catch (FindFailed e) {
                    System.out.println("riz not found");
                }
                TimeUnit.MILLISECONDS.sleep(400);
                try {
                    s.click(faucher);
                } catch (FindFailed e) {
                    System.out.println("Faucher not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(7000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(2000);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    Location A = new Location(500, 370);
                    s.click(A);
                    TimeUnit.MILLISECONDS.sleep(800);
                    Location B = new Location(770, 370);
                    s.click(B);
                    s.type(Key.F1);
                    while (s.exists(epouventailFight) != null) {
                        s.type(Key.F6);
                        s.click(epouventailFight);
                        TimeUnit.MILLISECONDS.sleep(800);
                        s.type(Key.F1);
                        TimeUnit.MILLISECONDS.sleep(6000);
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

    public void recolteChanvrePosX10Y5() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();
        boolean first = true;

        while (true) {
            TimeUnit.SECONDS.sleep(5);
            doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            s.rightClick(zaapAstrub);
            TimeUnit.SECONDS.sleep(2);
            s.doubleClick(milifutaie);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(1250,380));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(570,60));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,340));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(770,60));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,270));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,160));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,340));
            TimeUnit.SECONDS.sleep(8);

            first=true;
            for (int i = 0; i < 200; i++) {
                try {
                    s.click(chanvreRecolte);
                } catch (FindFailed e) {
                    System.out.println("riz not found");
                }
                TimeUnit.MILLISECONDS.sleep(400);
                try {
                    s.click(faucher);
                } catch (FindFailed e) {
                    System.out.println("Faucher not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(7000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(3000);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(1050, 355));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(1000, 180));
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(11);

                    //case bas
                    s.click(new Location(940, 280));
                    TimeUnit.SECONDS.sleep(3);
                    s.type(Key.F5);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(770, 190));
                    TimeUnit.SECONDS.sleep(3);
                    //case haut
                    s.click(new Location(1150, 250));
                    TimeUnit.SECONDS.sleep(3);
                    s.type(Key.F5);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(1180, 350));
                    TimeUnit.SECONDS.sleep(3);

                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(5);
                    if(s.exists(epouventailFight) != null){
                        while (s.exists(epouventailFight) != null) {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            try {
                                s.click(epouventailFight);
                            } catch (FindFailed e) {
                                System.out.println("Epouventail not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.mouseMove(-10,-55);
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(1000);
                            try {
                                s.click(epouventailFight);
                            } catch (FindFailed e) {
                                System.out.println("Epouventail not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10,-55);
                            TimeUnit.MILLISECONDS.sleep(3000);
                        }
                    }
                    else if (s.exists(ennemiCombat) != null){
                        while (s.exists(ennemiCombat) != null) {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(200);
                            try {
                                s.click(ennemiCombat);
                            } catch (FindFailed e) {
                                System.out.println("Ennemi not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(200);
                            try {
                                s.click(ennemiCombat);
                            } catch (FindFailed e) {
                                System.out.println("Ennemi not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10,-55);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
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

            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            Location I = new Location(1100, 200);
            s.click(I);
            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(370, 200);
            s.click(J);
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(chanvre);
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

    public void bucherForetAstrub() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        ArrayList<Point> foretAstrubMaps = new ArrayList<>();
        foretAstrubMaps.add(new Point(365, 370));
        foretAstrubMaps.add(new Point(365,305));
        foretAstrubMaps.add(new Point(365,340));
        foretAstrubMaps.add(new Point(770,65));
        foretAstrubMaps.add(new Point(705,65));
        foretAstrubMaps.add(new Point(770,65));
        foretAstrubMaps.add(new Point(775,65));
        foretAstrubMaps.add(new Point(1250,235));
        foretAstrubMaps.add(new Point(1250,440));
        foretAstrubMaps.add(new Point(910,580));
        foretAstrubMaps.add(new Point(1250,340));
        foretAstrubMaps.add(new Point(1050,580));
        foretAstrubMaps.add(new Point(840,580));
        foretAstrubMaps.add(new Point(635,580));

        general.zaapAstrubForetAstrub();
        while (true) {
            int routeCounter=0;
            for (int i = 0; i < 700; i++) {
                try {
                    if(s.exists(arbreNoyer) != null){
                        s.click(arbreNoyer);
                        TimeUnit.MILLISECONDS.sleep(400);
                        s.click(couper);
                        TimeUnit.MILLISECONDS.sleep(600);
                    }
                    else if (s.exists(arbreChataignier) != null){
                        s.click(arbreChataignier);
                        TimeUnit.MILLISECONDS.sleep(400);
                        s.click(couper);
                        TimeUnit.MILLISECONDS.sleep(400);
                    }
                    else if (s.exists(arbreFrene) != null){
                        s.click(arbreFrene);
                        TimeUnit.MILLISECONDS.sleep(400);
                        s.click(couper);
                        TimeUnit.MILLISECONDS.sleep(400);
                    }
                    else{
                        Point nextPos = foretAstrubMaps.get(routeCounter);
                        s.click(new Location(nextPos.x, nextPos.y));
                        routeCounter++;
                        if(routeCounter  >= foretAstrubMaps.size()){
                            routeCounter = 0;
                        }
                        TimeUnit.MILLISECONDS.sleep(6000);
                    }
                } catch (FindFailed e) {
                    System.out.println("Nothing found");
                }

                if (s.exists(pretCombat) != null) {
                    System.out.println("Fight started");
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(2000);
                    s.click(abondonner);
                    TimeUnit.MILLISECONDS.sleep(2000);
                    s.type(Key.ENTER);
                    TimeUnit.MILLISECONDS.sleep(2000);
                    s.type(Key.ENTER);
                    TimeUnit.MILLISECONDS.sleep(2000);
                    s.type(Key.ENTER);
                    routeCounter =0;
                    TimeUnit.MILLISECONDS.sleep(2000);
                    try {
                        s.click(phenix);
                        TimeUnit.MILLISECONDS.sleep(4000);
                    } catch (FindFailed e) {
                        System.out.println("not phantom");
                    }

                    TimeUnit.MILLISECONDS.sleep(4000);
                    s.type(Key.ESC);
                    TimeUnit.MILLISECONDS.sleep(5000);
                    general.zaapAstrubForetAstrub();
                }

            }

            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            Location I = new Location(1100, 200);
            s.click(I);
            TimeUnit.SECONDS.sleep(1);
            Location J = new Location(370, 200);
            s.click(J);
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(chanvre);
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
