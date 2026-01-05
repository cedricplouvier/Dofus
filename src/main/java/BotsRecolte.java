import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BotsRecolte extends Main{

    static General general = new General();

    public void recolteRiz() throws FindFailed, InterruptedException, IOException {
        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            s.doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            s.rightClick(zaapAstrub);
            TimeUnit.SECONDS.sleep(2);
            kb.type("pqn");
            TimeUnit.SECONDS.sleep(2);
            s.doubleClick(zaapPandalaEau);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(500, 60));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(370, 440));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(700, 70));
            TimeUnit.SECONDS.sleep(8);
            first=true;
            for (int i = 0; i < 200; i++) {
                try {
                    s.click(riz);
                } catch (FindFailed e) {
                    System.out.println("riz not found");
                }
                try {
                    s.click(faucher);
                } catch (FindFailed e) {
                    System.out.println("Faucher not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(7000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(1000);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(500, 370));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(770, 370));
                    s.type(Key.F1);
                    while (s.exists(abondonner) != null) {
                        s.type(Key.F6);
                        TimeUnit.MILLISECONDS.sleep(500);
                        try {
                            s.click(ennemiCombat);
                        } catch (FindFailed e) {
                            System.out.println("ennemi not found");
                        }
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.mouseMove(-10,-55);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.type(Key.F6);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        try {
                            s.click(ennemiCombat);
                        } catch (FindFailed e) {
                            System.out.println("ennemi not found");
                        }
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.type(Key.F1);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(-10,-55);
                        TimeUnit.MILLISECONDS.sleep(3000);
                    }
                }
            }
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < 10; k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(1000);
            }
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(rizInventaire);
            s.dragDrop(region1, new Location(500, 470));
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void bucherForetAstrub(String classe) throws InterruptedException, FindFailed, IOException {
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

        while (true) {
            general.zaapAstrubForetAstrub();
            int routeCounter=0;
            for (int i = 0; i < 50; i++) {
                try {
                    if(s.exists(arbreNoyer) != null){
                        try {
                            s.click(arbreNoyer);
                        } catch (FindFailed e){
                            System.out.println("Noyer not found");
                        }
                        try {
                            s.click(couper);
                            TimeUnit.MILLISECONDS.sleep(12000);
                        } catch (FindFailed e) {
                            System.out.println("Couper not found");
                        }
                    }
                    else if (s.exists(arbreChataignier) != null){
                        try {
                            s.click(arbreChataignier);
                        } catch (FindFailed e){
                            System.out.println("Noyer not found");
                        }
                        try {
                            s.click(couper);
                            TimeUnit.MILLISECONDS.sleep(7000);
                        } catch (FindFailed e) {
                            System.out.println("Couper not found");
                        }
                    }
                    else if (s.exists(arbreFrene) != null){
                        try {
                            s.click(arbreFrene);
                        } catch (FindFailed e){
                            System.out.println("Noyer not found");
                        }
                        try {
                            s.click(couper);
                            TimeUnit.MILLISECONDS.sleep(7000);
                        } catch (FindFailed e) {
                            System.out.println("Couper not found");
                        }
                    }
                    else if (s.exists(pretCombat) != null) {
                        TimeUnit.MILLISECONDS.sleep(800);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(11);
                        if(s.exists(ennemiCombat) != null){
                            while (s.exists(ennemiCombat) != null) {
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(500);
                                try {
                                    s.click(ennemiCombat);
                                } catch (FindFailed e) {
                                    System.out.println("Ennemie");
                                }
                                TimeUnit.MILLISECONDS.sleep(1000);
                                s.mouseMove(-10,-55);
                                TimeUnit.MILLISECONDS.sleep(1000);
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(1000);
                                try {
                                    s.click(ennemiCombat);
                                } catch (FindFailed e) {
                                    System.out.println("Ennemie");
                                }
                                TimeUnit.MILLISECONDS.sleep(1000);
                                s.type(Key.F1);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10,-55);
                                TimeUnit.MILLISECONDS.sleep(5000);
                            }
                        }
                    }
                    else{
                        Point nextPos = foretAstrubMaps.get(routeCounter);
                        s.click(new Location(nextPos.x, nextPos.y));
                        routeCounter++;
                        if(routeCounter  >= foretAstrubMaps.size()){
                            routeCounter = 0;
                        }
                        TimeUnit.MILLISECONDS.sleep(3000);
                    }
                } catch (FindFailed e) {
                    System.out.println("Nothing found");
                }
            }
            TimeUnit.MILLISECONDS.sleep(10000);
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            Match regionNoyer = s.find(boisNoyer);
            s.dragDrop(regionNoyer, new Location(500, 470));
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, new Location(500, 470));
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionFrene = s.find(boisFrene);
            s.dragDrop(regionFrene, new Location(500, 470));
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void recolteChanvrePosX10Y5(String classe) throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            s.doubleClick(popoRappel);
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
            for (int i = 0; i < 100; i++) {
                try {
                    s.click(chanvreRecolte);
                } catch (FindFailed e) {
                    System.out.println("Chanvre not found");
                }
                try {
                    s.click(faucher);
                    TimeUnit.MILLISECONDS.sleep(3000);
                } catch (FindFailed e) {
                    System.out.println("Faucher not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(5000);
                    first = false;
                }
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(1050, 355));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(1000, 180));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(11);

                    if(classe == "iop") {
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
                    }
                    if (s.exists(abondonner) != null){
                        while (s.exists(abondonner) != null) {
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
                            s.mouseMove(-10,-100);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                    }
                }
            }

            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < 5; k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(1000);
            }
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(chanvre);
            s.dragDrop(region1, new Location(500, 470));
            TimeUnit.SECONDS.sleep(1);
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void recolteBlePosX11Y6() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            s.doubleClick(popoRappel);
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
            s.click(new Location(1250,300));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,305));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,270));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(1250,265));
            TimeUnit.SECONDS.sleep(8);

            first=true;
            for (int i = 0; i < 70; i++) {
                try {
                    s.click(bleRecolte);
                } catch (FindFailed e) {
                    System.out.println("ble not found");
                }
                try {
                    s.click(faucher);
                } catch (FindFailed e) {
                    System.out.println("Faucher not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(7000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(2500);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(11);

                    if(s.exists(abondonner) != null){
                        while (s.exists(abondonner) != null) {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            try {
                                s.click(ennemiCombat);
                            } catch (FindFailed e) {
                                System.out.println("ennemi not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.mouseMove(-10,-100);
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(1000);
                            try {
                                s.click(ennemiCombat);
                            } catch (FindFailed e) {
                                System.out.println("ennemi not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10,-100);
                            TimeUnit.MILLISECONDS.sleep(5000);
                        }
                    }
                }
            }

            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < 5; k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(1000);
            }
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(bleInventaire);
            s.dragDrop(region1, new Location(500, 470));
            TimeUnit.SECONDS.sleep(1);
            s.click(max);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

}
