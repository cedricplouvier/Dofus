import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BotsRecolte extends Main{

    static General general = new General();

    public void recolteRiz(String classe, int pods, int coffre) throws FindFailed, InterruptedException, IOException {
        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            s.doubleClick(popoRappel);
            TimeUnit.SECONDS.sleep(5);
            try {
                s.rightClick(zaapAstrub);
            } catch (FindFailed e){
                System.out.println("Zaap Astrub not found");
                recolteRiz(classe, pods, coffre);
            }
            TimeUnit.SECONDS.sleep(2);
            kb.type("pqn");
            TimeUnit.SECONDS.sleep(2);
            try {
                s.doubleClick(zaapPandalaEau);
            } catch (FindFailed e){
                System.out.println("PandalaEau not found");
            }
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(500, 60));
            TimeUnit.SECONDS.sleep(8);
            s.click(new Location(370, 440));
            TimeUnit.SECONDS.sleep(5);
            s.click(new Location(700, 70));
            TimeUnit.SECONDS.sleep(8);
            if (s.exists(startRizPosX22Y24) == null){
                recolteRiz(classe, pods, coffre);
            }
            for (int i = 0; i < Math.round(pods/30); i++) {
                try {
                    s.click(riz);
                    try {
                        s.click(faucher);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        if (first){
                            TimeUnit.MILLISECONDS.sleep(5000);
                            first = false;
                        }
                    } catch (FindFailed e) {
                        System.out.println("Faucher not found");
                    }
                } catch (FindFailed e) {
                    System.out.println("Riz not found");
                }
                if (first){
                    TimeUnit.MILLISECONDS.sleep(5000);
                    first = false;
                }
                TimeUnit.MILLISECONDS.sleep(1000);
                if (s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(500, 370));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.click(new Location(770, 370));
                    TimeUnit.MILLISECONDS.sleep(800);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(7000);
                    if(classe == "enu") {
                        s.type(Key.F7);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.click(new Location(700, 375));
                        TimeUnit.MILLISECONDS.sleep(1000);
                    }
                    while (s.exists(abondonner) != null) {
                        TimeUnit.MILLISECONDS.sleep(8000);
                        s.type(Key.F6);
                        TimeUnit.MILLISECONDS.sleep(500);
                        try {
                            s.click(epouventailFight);
                        } catch (FindFailed e) {
                            System.out.println("epouventail not found");
                        }
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.mouseMove(-10,-100);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.type(Key.F6);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        try {
                            s.click(epouventailFight);
                        } catch (FindFailed e) {
                            System.out.println("epouventail not found");
                        }
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.type(Key.F1);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(-10,-100);
                        TimeUnit.MILLISECONDS.sleep(3000);
                    }
                }
            }
            general.checkConnection();
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < Math.round(pods/500); k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(1000);
            }
            if(coffre==1) {
                general.zaapAstrubToMaisonCoffre1();
            }
            else if(coffre==3){
                general.zaapAstrubToMaisonCoffre3();
            }
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            Match region1 = s.find(rizInventaire);
            s.dragDrop(region1, new Location(500, 470));
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void bucherForetAstrub(String classe, int pods, ArrayList<String> sortesBois) throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        ArrayList<Point> foretAstrubMaps = new ArrayList<>();
        foretAstrubMaps.add(new Point(xLeft, 370));
        foretAstrubMaps.add(new Point(xLeft,305));
        foretAstrubMaps.add(new Point(xLeft,340));
        foretAstrubMaps.add(new Point(770,yUp));
        foretAstrubMaps.add(new Point(705,yUp));
        foretAstrubMaps.add(new Point(770,yUp));
        foretAstrubMaps.add(new Point(775,yUp));
        foretAstrubMaps.add(new Point(xRight,235));
        foretAstrubMaps.add(new Point(xRight,440));
        foretAstrubMaps.add(new Point(910,yDown));
        foretAstrubMaps.add(new Point(xRight,340));
        foretAstrubMaps.add(new Point(1050,yDown));
        foretAstrubMaps.add(new Point(840,yDown));
        foretAstrubMaps.add(new Point(635,yDown));

        while (true) {
            general.zaapAstrubForetAstrub();
            int routeCounter=0;
            for (int i = 0; i < (Math.round(pods/30)); i++) {
                boolean treeFound = false;
                try {
                    if (sortesBois.contains("noyer")) {
                        if (s.exists(arbreNoyer) != null) {
                            try {
                                s.click(arbreNoyer);
                                try {
                                    s.click(couper);
                                    TimeUnit.MILLISECONDS.sleep(13000);
                                    treeFound = true;
                                } catch (FindFailed e) {
                                    System.out.println("Couper not found");
                                }
                            } catch (FindFailed e) {
                                System.out.println("Noyer not found");
                            }
                        }
                    }
                    if(sortesBois.contains("chene")) {
                        if (s.exists(arbreChene) != null) {
                            try {
                                s.click(arbreChene);
                                try {
                                    s.click(couper);
                                    TimeUnit.MILLISECONDS.sleep(7000);
                                    treeFound = true;
                                } catch (FindFailed e) {
                                    System.out.println("Couper not found");
                                }
                            } catch (FindFailed e) {
                                System.out.println("Chataignier not found");
                            }
                        }
                    }
                    if(sortesBois.contains("chataignier")) {
                        if (s.exists(arbreChataignier) != null) {
                            try {
                                s.click(arbreChataignier);
                                try {
                                    s.click(couper);
                                    TimeUnit.MILLISECONDS.sleep(7000);
                                    treeFound = true;
                                } catch (FindFailed e) {
                                    System.out.println("Couper not found");
                                }
                            } catch (FindFailed e) {
                                System.out.println("Chataignier not found");
                            }
                        }
                    }
                    if(sortesBois.contains("frene")) {
                        if (s.exists(arbreFrene) != null) {
                            try {
                                s.click(arbreFrene);
                                try {
                                    s.click(couper);
                                    TimeUnit.MILLISECONDS.sleep(7000);
                                    treeFound = true;
                                } catch (FindFailed e) {
                                    System.out.println("Couper not found");
                                }
                            } catch (FindFailed e) {
                                System.out.println("Frene not found");
                            }
                        }
                    }
                    if (s.exists(pretCombat) != null) {
                        TimeUnit.MILLISECONDS.sleep(800);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(11);
                        while (s.exists(abondonner) != null) {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1180,570));
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1180,570));
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10, -100);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                    }
                    if (treeFound == false){
                        System.out.println("Nothing found, next map");
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
            }
            general.checkConnection();
            TimeUnit.MILLISECONDS.sleep(10000);
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < Math.round(pods/1000); k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(500);
            }
            general.zaapAstrubToMaisonCoffre1();
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            try {
                Match regionNoyer = s.find(boisNoyer);
                s.dragDrop(regionNoyer, new Location(500, 470));
            } catch(FindFailed e){
                System.out.println("boisNoyer not found");
            }
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            try {
                Match regionChene = s.find(boisChene);
                s.dragDrop(regionChene, new Location(500, 470));
            } catch (FindFailed e){
                System.out.println("boisChene not found");
            }
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            Match regionChataignier = s.find(boisChataignier);
            s.dragDrop(regionChataignier, new Location(500, 470));
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            if(sortesBois.contains("frene")) {
                Match regionFrene = s.find(boisFrene);
                try {
                    s.dragDrop(regionFrene, new Location(500, 470));
                } catch (FindFailed e) {
                    System.out.println("No frene in inventaire");
                }
                try {
                    s.click(max);
                } catch (FindFailed e) {
                    System.out.println("max not found");
                }
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void recolteChanvrePosX10Y5(String metier, String classe, int pods, int coffre) throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            general.zaapAstrubToChanvrePosX10Y5();
            for (int i = 0; i < Math.round((pods/15)); i++) {
                try {
                    s.click(chanvreRecolte);
                    try {
                        if(metier == "paysan"){
                            s.click(faucher);
                        } else if (metier == "alchi"){
                            s.click(cueillir);
                        }
                        TimeUnit.MILLISECONDS.sleep(2100);
                        if (first){
                            TimeUnit.MILLISECONDS.sleep(5000);
                            first = false;
                        }
                    } catch (FindFailed e) {
                        System.out.println("Faucher not found");
                    }
                } catch (FindFailed e) {
                    System.out.println("Chanvre not found");
                }
                if (s.exists(pretCombat) != null) {
                    if(classe == "iop") {
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(1050, 355));
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(1000, 180));
                        TimeUnit.MILLISECONDS.sleep(1000);
                    }
                    else if(classe == "cra") {
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(600, 290));
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(920, 460));
                        TimeUnit.MILLISECONDS.sleep(1000);
                    }
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(10000);
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
                    } else if (classe == "cra") {
                        s.click(new Location(700, 340));
                        TimeUnit.SECONDS.sleep(2);
                        s.click(new Location(840, 400));
                        TimeUnit.SECONDS.sleep(1);
                    }
                    while (s.exists(abondonner) != null) {
                        if (s.exists(epouventailFight) != null) {
                            try {
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                            } catch (FindFailed e) {
                                System.out.println("Epouventail not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        } else if (s.exists(bulbiChanvre) != null){
                            try{
                            s.type(Key.F6);
                            s.click(bulbiChanvre);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10, -100);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F6);
                            s.click(bulbiChanvre);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10, -100);
                            } catch (FindFailed e) {
                                System.out.println("bulbiChanvre not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                        else {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1220,560));
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1220,560));
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10, -100);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                    }
                }
            }
            general.checkConnection();
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < Math.round(pods/500); k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(500);
            }
            if(coffre==1) {
                general.zaapAstrubToMaisonCoffre1();
            }
            else if(coffre==3){
                general.zaapAstrubToMaisonCoffre3();
            }
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            if (metier == "paysan") {
                Match region1 = s.find(chanvre);
                s.dragDrop(region1, new Location(500, 470));
            } else if (metier == "alchi"){
                Match region1 = s.find(fleurDeChanvre);
                s.dragDrop(region1, new Location(500, 470));
            }
            TimeUnit.SECONDS.sleep(2);
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

    public void recolteChanvrePosX32Y42(String metier, String classe, int pods, int coffre) throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        ArrayList<Point> mapsChanvreBonta = new ArrayList<>();
        mapsChanvreBonta.add(new Point(770, yDown));
        mapsChanvreBonta.add(new Point(773,yUp));

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            int routeCounter = 0;
            general.zaapAstrubToChanvrePosX32Y42();
            for (int i = 0; i < Math.round((pods/16)); i++) {
                try {
                    s.click(chanvreRecolte);
                    try {
                        if(metier == "paysan"){
                            s.click(faucher);
                        } else if (metier == "alchi"){
                            s.click(cueillir);
                        }
                        TimeUnit.MILLISECONDS.sleep(2100);
                        if (first){
                            TimeUnit.MILLISECONDS.sleep(5000);
                            first = false;
                        }
                    } catch (FindFailed e) {
                        System.out.println("Faucher not found");
                    }
                } catch (FindFailed e) {
                    System.out.println("Chanvre not found");
                    Point nextPos = mapsChanvreBonta.get(routeCounter);
                    s.click(new Location(nextPos.x, nextPos.y));
                    routeCounter++;
                    if(routeCounter  >= mapsChanvreBonta.size()){
                        routeCounter = 0;
                    }
                    TimeUnit.MILLISECONDS.sleep(6000);
                }
                if (s.exists(pretCombat) != null) {
                    if(classe == "cra") {
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.click(new Location(770, 370));
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.click(new Location(470, 290));
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.click(new Location(700, 270));
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.click(new Location(1035, 370));
                        TimeUnit.MILLISECONDS.sleep(500);
                    }
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(10000);
                    while (s.exists(abondonner) != null) {
                        if (s.exists(epouventailFight) != null) {
                            System.out.println("epouventail found");
                            try {
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                            } catch (FindFailed e) {
                                System.out.println("Epouventail not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        } else if (s.exists(bulbiChanvre) != null){
                            System.out.println("Bulbichanvre found");
                            try{
                                s.type(Key.F6);
                                s.click(bulbiChanvre);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F6);
                                s.click(bulbiChanvre);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                            } catch (FindFailed e) {
                                System.out.println("bulbiChanvre not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                        else if (s.exists(maitreBolet) != null){
                                System.out.println("maitre bolet found");
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(500);
                                try {
                                    s.click(maitreBolet);
                                } catch (FindFailed e) {
                                    System.out.println("Maitre bolet not found");
                                }
                                TimeUnit.MILLISECONDS.sleep(1000);
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(500);
                                try {
                                    s.click(maitreBolet);
                                } catch (FindFailed e) {
                                    System.out.println("Maitre bolet not found");
                                }
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F1);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(6000);
                        }
                        else {
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.click(new Location(1220, 560));
                                TimeUnit.MILLISECONDS.sleep(1000);
                                s.type(Key.F6);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.click(new Location(1220, 560));
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F1);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(6000);
                        }
                    }
                }
                if(s.exists(zaapAstrub) != null){
                    general.zaapAstrubToChanvrePosX32Y42();
                }
            }
            general.checkConnection();
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < Math.round(pods/500); k++){
                s.doubleClick(new Location(1100, 250));
                TimeUnit.MILLISECONDS.sleep(500);
            }
            if(coffre==1) {
                general.zaapAstrubToMaisonCoffre1();
            }
            else if(coffre==3){
                general.zaapAstrubToMaisonCoffre3();
            }
            TimeUnit.MILLISECONDS.sleep(2000);
            s.click(new Location(1100, 200));
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(370, 200));
            TimeUnit.SECONDS.sleep(1);
            if (metier == "paysan") {
                Match region1 = s.find(chanvre);
                s.dragDrop(region1, new Location(500, 470));
            } else if (metier == "alchi"){
                Match region1 = s.find(fleurDeChanvre);
                s.dragDrop(region1, new Location(500, 470));
            }
            TimeUnit.SECONDS.sleep(2);
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
        }
    }

    public void recolteBlePosX11Y6(String classe, int pods) throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        boolean first = true;
        while (true) {
            TimeUnit.SECONDS.sleep(5);
            general.zaapAstrubToBlePosX11Y6();
            for (int i = 0; i < Math.round(pods/30); i++) {
                try {
                    s.click(bleRecolte);
                    try {
                        s.click(faucher);
                        TimeUnit.MILLISECONDS.sleep(2100);
                        if (first){
                            TimeUnit.MILLISECONDS.sleep(5000);
                            first = false;
                        }
                    } catch (FindFailed e) {
                        System.out.println("Faucher not found");
                    }
                } catch (FindFailed e) {
                    System.out.println("Blé not found");
                }
                if (s.exists(pretCombat) != null) {
                    if(classe == "cra") {
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(500, 160));
                        TimeUnit.MILLISECONDS.sleep(1000);
                        s.click(new Location(980, 440));
                        TimeUnit.MILLISECONDS.sleep(1000);
                    }
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(10000);
                    if(classe == "cra") {
                        //case haut
                        s.click(new Location(600, 220));
                        TimeUnit.SECONDS.sleep(2);
                        //case bas
                        s.click(new Location(870, 390));
                        TimeUnit.SECONDS.sleep(2);
                    }
                    while (s.exists(abondonner) != null) {
                        if (s.exists(epouventailFight) != null) {
                            try {
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.type(Key.F6);
                                s.click(epouventailFight);
                                TimeUnit.MILLISECONDS.sleep(500);
                                s.mouseMove(-10, -100);
                            } catch (FindFailed e) {
                                System.out.println("Epouventail not found");
                            }
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        } else {
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1220,560));
                            TimeUnit.MILLISECONDS.sleep(1000);
                            s.type(Key.F6);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.click(new Location(1220,560));
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.type(Key.F1);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(-10, -100);
                            TimeUnit.MILLISECONDS.sleep(6000);
                        }
                    }
                }
            }
            general.checkConnection();
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1140, 155));
            TimeUnit.MILLISECONDS.sleep(1000);
            for(int k=0; k < Math.round(pods/1000); k++){
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
            try {
                s.click(max);
            } catch (FindFailed e) {
                System.out.println("max not found");
            }
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ESC);
            TimeUnit.SECONDS.sleep(4);
            s.doubleClick(popoRappel);
        }
    }

}
