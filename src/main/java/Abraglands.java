import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Abraglands extends Main {

    static General general = new General();

    public void abraglandsSculpteurIop(int amount) throws InterruptedException, FindFailed, IOException {

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
                s.click(new Location(735, 410));
                TimeUnit.MILLISECONDS.sleep(700);
                s.click(new Location(900, 350));

                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F1);

                TimeUnit.SECONDS.sleep(2);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                s.click(new Location(850, 360));
                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(500);
                while (s.exists(abraFight) != null) {
                    s.type(Key.F6);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
                    s.type(Key.F6);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(500);
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
        abraglandsSculpteurIop(amount);
    }

    public  void abraglandsIopBoucherAmakna(int amount) throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();

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
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(635, 435));

        for (int i = 0; i < amount; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(670, 420));
                TimeUnit.SECONDS.sleep(1);
                s.click(new Location(925, 340));
                TimeUnit.SECONDS.sleep(1);
                s.click(new Location(840, 380));
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F1);

                TimeUnit.SECONDS.sleep(2);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);

                TimeUnit.MILLISECONDS.sleep(1000);
                s.click(new Location(740, 410));

                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);

                TimeUnit.MILLISECONDS.sleep(1000);
                s.click(new Location(850, 370));

                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);

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
        abraglandsIopBoucherAmakna(amount);
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

    public  void abraglandsIopScaraNord(int amount) throws InterruptedException, FindFailed, IOException {

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
                TimeUnit.MILLISECONDS.sleep(700);
                s.click(new Location(580, 270));
                s.type(Key.F1);
                TimeUnit.SECONDS.sleep(2);
                s.click(new Location(670, 320));
                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.click(new Location(740, 360));
                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
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
        abraglandsIopScaraNord(amount);
    }

    public  void abraglandsIopScaraNordGauche(int amount) throws InterruptedException, FindFailed, IOException {
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
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(new Location(610, 205));
                TimeUnit.SECONDS.sleep(1);
                TimeUnit.MILLISECONDS.sleep(1000);
                s.click(new Location(1080, 530));
                TimeUnit.MILLISECONDS.sleep(1000);
                s.type(Key.F1);
                TimeUnit.MILLISECONDS.sleep(2000);
                s.click(new Location(950, 460));
                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.click(new Location(890, 440));
                TimeUnit.MILLISECONDS.sleep(1500);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F7);
                s.click(abraFight);
                TimeUnit.MILLISECONDS.sleep(700);
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
        abraglandsIopScaraNordGauche(amount);
    }
}
