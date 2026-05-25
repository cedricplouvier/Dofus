import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Abraglands extends Main {

    static General general = new General();

    public void abraglandsSculpteurIop(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(2);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapMili);
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(360, 270));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(360, 300));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(580, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(720, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(990, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(650, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(850, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1000, 250));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(635, 435));

        for (int i = 0; i < amount; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.SECONDS.sleep(1);
                s.rightClick(new Location(670, 410));
                TimeUnit.SECONDS.sleep(1);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(735, 410));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.click(new Location(900, 350));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F1);

                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.click(new Location(850, 360));
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    while (s.exists(abraFight) != null) {
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(10);
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(600, 410));
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(635, 435));
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }

        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if (repeat) {
            abraglandsSculpteurIop(amount, repeat);
        }
    }

    public  void abraglandsIopBoucherAmakna(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(2);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(2);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapMili);
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(360, 270));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(360, 300));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(580, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(720, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(990, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(650, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(850, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(500, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(360, 340));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(360, 200));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(950, 220));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(600, 410));
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(635, 435));

        for (int i = 0; i < amount; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(670, 420));
                TimeUnit.SECONDS.sleep(1);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(925, 340));
                    TimeUnit.SECONDS.sleep(1);
                    s.click(new Location(840, 380));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F1);

                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.click(new Location(740, 410));

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.click(new Location(850, 370));

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.SECONDS.sleep(1);
                    while (s.exists(abraFight) != null) {

                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(10);
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(600, 410));
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(635, 435));
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }

        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopBoucherAmakna(amount, repeat);
        }
    }

    public  void abraglandsIopAlchiAmakna(int amount) throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapMili);
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(360, 270));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(360, 300));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(580, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(720, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(990, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(650, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(850, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(500, 580));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(360, 340));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(360, 200));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(1110, 590));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1040, 590));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1180, 590));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(730, 430));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(620, 410));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(660, 430));

        for (int i = 0; i < amount; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(1000);
                s.rightClick(new Location(700, 425));
                TimeUnit.SECONDS.sleep(1);
                Color redMac = new Color(255,0,0);
                Color redWindows = new Color(255, 0, 0);
                Color colorA = new Location(700, 452).getColor();
                TimeUnit.MILLISECONDS.sleep(700);
                if((colorA.equals(redMac)) || (colorA.equals(redWindows))) {
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.click(new Location(700, 452));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(860, 350));
                    TimeUnit.MILLISECONDS.sleep(1500);

                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                }
                else{
                    s.click(new Location(950, 373));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(900, 400));
                    TimeUnit.MILLISECONDS.sleep(1500);

                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.click(new Location(820, 390));
                    TimeUnit.MILLISECONDS.sleep(1000);

                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                }

                TimeUnit.SECONDS.sleep(1);
                while (s.exists(abraFight) != null) {
                    s.type(Key.F6);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F6);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(10);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(1);
        abraglandsIopAlchiAmakna(amount);
    }

    public  void abraglandsIopScaraNord(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(2);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(825, 100));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(960, 60));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(530, 180));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(560, 200));
        TimeUnit.SECONDS.sleep(2);
        for (int i = 0; i < amount; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(610, 205));
                TimeUnit.SECONDS.sleep(1);
                if(s.exists(pretCombat) != null) {
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.click(new Location(580, 270));
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(670, 320));
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.click(new Location(740, 360));
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.SECONDS.sleep(1);
                    while (s.exists(abraFight) != null) {
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(10);
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(530, 180));
                    TimeUnit.SECONDS.sleep(7);
                    s.click(new Location(560, 200));
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraNord(amount, repeat);
        }
    }

    public  void abraglandsIopScaraNordGauche(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(825, 100));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(960, 60));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(370, 310));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(530, 180));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(560, 200));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(610, 205));
                TimeUnit.SECONDS.sleep(1);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(1000, 360));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(2000);
                    //s.click(new Location(970, 370));
                    //TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    if(s.exists(abraFight) != null) {
                        s.click(new Location(850, 425));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(530, 180));
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(560, 200));
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraNordGauche(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierPaysan1Etage(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1000, 530));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1001, 290));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(860, 350));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(900, 330));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(810, 420));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(870, 350));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(830, 300));
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(700, 475));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(820, 340));
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(860, 350));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierPaysan1Etage(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierPaysan1(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(1000, 530));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(730, 450));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(770, 450));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(870, 390));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(770, 370));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(830, 300));
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(700, 475));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(700, 450));
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(730, 450));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierPaysan1(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierBijoutier(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(900, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(960, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(780, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(760, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(970, 400));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(730, 450));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(770, 450));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(800, 390));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(640, 410));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(740, 420));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(700, 450));
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(730, 450));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierBijoutier(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierBijoutierSecrete(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(900, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(960, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(780, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(760, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(970, 400));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(700, 310));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(860, 280));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(900, 300));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(940, 300));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(870, 320));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(770, 370));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(700, 400));
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(840, 270));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(860, 280));
                    TimeUnit.SECONDS.sleep(3);
                    s.click(new Location(900, 300));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierBijoutierSecrete(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierSculpteur(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(900, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(960, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(780, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(760, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(700, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, 200));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(600, 410));
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(635, 435));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(670, 420));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(740, 400));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(900, 350));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(810, 370));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(600, 410));
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(635, 435));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierBijoutier(amount, repeat);
        }
    }

    public  void abraglandsIopScaraAtelierForgeron(int amount, boolean repeat) throws InterruptedException, FindFailed, IOException {
        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        general.zaapAstrubToMaisonCoffre1();
        TimeUnit.SECONDS.sleep(3);
        general.depodsAbraglands(amount);
        TimeUnit.SECONDS.sleep(3);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(3);
        s.rightClick(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(selectZaapScara);

        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(xRight, 310));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(xRight, 510));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 440));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(770, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(900, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(960, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(780, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(760, yDown));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(xRight, 240));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(670, 220));
        TimeUnit.SECONDS.sleep(6);

        s.click(new Location(940, 350));
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(975, 370));
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < amount; i++) {
            try {
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(1000, 360));
                TimeUnit.MILLISECONDS.sleep(500);
                if(s.exists(pretCombat) != null) {
                    s.click(new Location(770, 420));
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.click(new Location(900, 350));
                    TimeUnit.MILLISECONDS.sleep(1000);
                    s.type(Key.F1);
                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.mouseMove(100,100);
                    TimeUnit.MILLISECONDS.sleep(200);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    if(s.exists(abraFight) != null) {
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.click(new Location(840, 390));
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(500);
                        s.mouseMove(100,100);
                        TimeUnit.MILLISECONDS.sleep(200);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(1000);
                        while (s.exists(abraFight) != null) {
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F6);
                            s.click(abraFight);
                            TimeUnit.MILLISECONDS.sleep(500);
                            s.mouseMove(100,100);
                            TimeUnit.MILLISECONDS.sleep(200);
                            s.type(Key.F1);
                            TimeUnit.SECONDS.sleep(10);
                        }
                    }
                }
                else{
                    if(s.exists(interfacePerco) != null){
                        s.type(Key.ESC);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    s.click(new Location(940, 350));
                    TimeUnit.SECONDS.sleep(2);
                    s.click(new Location(975, 370));
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(2);
        s.type(Key.ESC);
        TimeUnit.SECONDS.sleep(1);
        if(repeat) {
            abraglandsIopScaraAtelierForgeron(amount, repeat);
        }
    }
}
