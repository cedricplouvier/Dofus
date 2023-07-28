import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Abraglands extends Main {

    static General general = new General();

    public void abraglandsSculpteurIop() throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);

        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);

        TimeUnit.SECONDS.sleep(2);
        Location JJ = new Location(360, 270);
        s.click(JJ);
        TimeUnit.SECONDS.sleep(5);
        Location KK = new Location(360, 300);
        s.click(KK);
        TimeUnit.SECONDS.sleep(6);

        Location LL = new Location(580, 580);
        s.click(LL);
        TimeUnit.SECONDS.sleep(6);
        Location MM = new Location(720, 580);
        s.click(MM);
        TimeUnit.SECONDS.sleep(6);
        Location NN = new Location(990, 580);
        s.click(NN);
        TimeUnit.SECONDS.sleep(6);
        Location OO = new Location(650, 580);
        s.click(OO);
        TimeUnit.SECONDS.sleep(6);
        Location PP = new Location(850, 580);
        s.click(PP);
        TimeUnit.SECONDS.sleep(6);
        Location QQ = new Location(1000, 250);
        s.click(QQ);
        TimeUnit.SECONDS.sleep(6);
        Location UU = new Location(635, 435);
        s.click(UU);

        for (int i = 0; i < 200; i++) {
            try {
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.SECONDS.sleep(1);
                //Code if recognition abra is needed instead of static position
                /*if (s.exists(abraBack) != null) {
                    System.out.println("abraback");
                    abraFound = true;
                    s.rightClick(abraBack);
                } else if (s.exists(abraLeft) != null) {
                    System.out.println("abraleft");
                    abraFound = true;
                    s.rightClick(abraLeft);
                } else if (s.exists(abraRight) != null) {
                    System.out.println("abraright");
                    abraFound = true;
                    s.rightClick(abraRight);
                } else if (s.exists(abraFront) != null) {
                    System.out.println("abrafront");
                    abraFound = true;
                    s.rightClick(abraFront);
                } else {
                    System.out.println("ABRA NOT FOUND");
                }*/
                abraFound=true;
                Location launch = new Location(670, 410);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(735, 410);
                    s.click(A);
                    TimeUnit.MILLISECONDS.sleep(700);
                    Location B = new Location(900, 350);
                    s.click(B);

                    //TimeUnit.SECONDS.sleep(6); //temps que enus rejoignes
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

                    TimeUnit.SECONDS.sleep(1);
                    Location two = new Location(850, 360);
                    s.click(two);

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
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(10);
                    }
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
        general.depodsAbraglands();
        TimeUnit.SECONDS.sleep(1);
        abraglandsSculpteurIop();
    }

    public  void abraglandsIopBoucherAmakna() throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);

        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);


        TimeUnit.SECONDS.sleep(2);
        Location JJ = new Location(360, 270);
        s.click(JJ);
        TimeUnit.SECONDS.sleep(5);
        Location KK = new Location(360, 300);
        s.click(KK);
        TimeUnit.SECONDS.sleep(6);

        Location LL = new Location(580, 580);
        s.click(LL);
        TimeUnit.SECONDS.sleep(6);
        Location MM = new Location(720, 580);
        s.click(MM);
        TimeUnit.SECONDS.sleep(6);
        Location NN = new Location(990, 580);
        s.click(NN);
        TimeUnit.SECONDS.sleep(6);
        Location OO = new Location(650, 580);
        s.click(OO);
        TimeUnit.SECONDS.sleep(6);
        Location PP = new Location(850, 580);
        s.click(PP);
        TimeUnit.SECONDS.sleep(6);
        Location QQ = new Location(500, 580);
        s.click(QQ);
        TimeUnit.SECONDS.sleep(6);
        Location RR = new Location(360, 340);
        s.click(RR);
        TimeUnit.SECONDS.sleep(6);
        Location SS = new Location(360, 200);
        s.click(SS);
        TimeUnit.SECONDS.sleep(6);
        Location TT = new Location(950, 220);
        s.click(TT);
        TimeUnit.SECONDS.sleep(6);
        Location VV = new Location(600, 410);
        s.click(VV);
        TimeUnit.SECONDS.sleep(6);
        Location UU = new Location(635, 435);
        s.click(UU);

        for (int i = 0; i < 200; i++) {
            try {
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                //TimeUnit.SECONDS.sleep(1);
                /*if (s.exists(abraBack) != null) {
                    System.out.println("abraback");
                    abraFound = true;
                    s.rightClick(abraBack);
                } else if (s.exists(abraLeft) != null) {
                    System.out.println("abraleft");
                    abraFound = true;
                    s.rightClick(abraLeft);
                } else if (s.exists(abraRight) != null) {
                    System.out.println("abraright");
                    abraFound = true;
                    s.rightClick(abraRight);
                } else if (s.exists(abraFront) != null) {
                    System.out.println("abrafront");
                    abraFound = true;
                    s.rightClick(abraFront);
                } else {
                    System.out.println("ABRA NOT FOUND");
                }*/
                abraFound=true;
                TimeUnit.MILLISECONDS.sleep(500);
                Location launch = new Location(670, 420);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(925, 340);
                    s.click(A);
                    TimeUnit.SECONDS.sleep(1);
                    Location B = new Location(840, 380);
                    s.click(B);
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
                    Location twoBis = new Location(740, 410);
                    s.click(twoBis);

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);

                    /*TimeUnit.MILLISECONDS.sleep(1500);
                    Location twoBisBis = new Location(770, 390);
                    s.click(twoBisBis);

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);*/

                    TimeUnit.MILLISECONDS.sleep(1000);
                    Location two = new Location(850, 370);
                    s.click(two);

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);

                    /*TimeUnit.MILLISECONDS.sleep(1500);
                    Location three = new Location(840, 380);
                    s.click(three);

                    TimeUnit.MILLISECONDS.sleep(1500);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.type(Key.F7);
                    s.click(abraFight);*/

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
        general.depodsAbraglands();
        TimeUnit.SECONDS.sleep(1);
        abraglandsIopBoucherAmakna();
    }

    public  void abraglandsIopAlchiAmakna() throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);

        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);


        TimeUnit.SECONDS.sleep(2);
        Location JJ = new Location(360, 270);
        s.click(JJ);
        TimeUnit.SECONDS.sleep(5);
        Location KK = new Location(360, 300);
        s.click(KK);
        TimeUnit.SECONDS.sleep(6);

        Location LL = new Location(580, 580);
        s.click(LL);
        TimeUnit.SECONDS.sleep(6);
        Location MM = new Location(720, 580);
        s.click(MM);
        TimeUnit.SECONDS.sleep(6);
        Location NN = new Location(990, 580);
        s.click(NN);
        TimeUnit.SECONDS.sleep(6);
        Location OO = new Location(650, 580);
        s.click(OO);
        TimeUnit.SECONDS.sleep(6);
        Location PPP = new Location(850, 580);
        s.click(PPP);
        TimeUnit.SECONDS.sleep(6);
        Location QQQ = new Location(500, 580);
        s.click(QQQ);
        TimeUnit.SECONDS.sleep(6);
        Location RRR = new Location(360, 340);
        s.click(RRR);
        TimeUnit.SECONDS.sleep(6);
        Location SS = new Location(360, 200);
        s.click(SS);
        TimeUnit.SECONDS.sleep(6);

        Location PPPP = new Location(1110, 590);
        s.click(PPPP);
        TimeUnit.SECONDS.sleep(6);
        Location QQQQ = new Location(1040, 590);
        s.click(QQQQ);
        TimeUnit.SECONDS.sleep(6);
        Location RRRR = new Location(1180, 590);
        s.click(RRRR);
        TimeUnit.SECONDS.sleep(6);

        Location TT = new Location(730, 430);
        s.click(TT);
        TimeUnit.SECONDS.sleep(6);
        Location VV = new Location(620, 410);
        s.click(VV);
        TimeUnit.SECONDS.sleep(6);
        Location UU = new Location(660, 430);
        s.click(UU);

        for (int i = 0; i < 200; i++) {
            try {
                /*Location pain = new Location(1000, 680);
                s.doubleClick(pain);
                s.doubleClick(pain);*/
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                //TimeUnit.SECONDS.sleep(1);
                /*if (s.exists(abraBack) != null) {
                    System.out.println("abraback");
                    abraFound = true;
                    s.rightClick(abraBack);
                } else if (s.exists(abraLeft) != null) {
                    System.out.println("abraleft");
                    abraFound = true;
                    s.rightClick(abraLeft);
                } else if (s.exists(abraRight) != null) {
                    System.out.println("abraright");
                    abraFound = true;
                    s.rightClick(abraRight);
                } else if (s.exists(abraFront) != null) {
                    System.out.println("abrafront");
                    abraFound = true;
                    s.rightClick(abraFront);
                } else {
                    System.out.println("ABRA NOT FOUND");
                }*/
                abraFound=true;
                Location launch = new Location(700, 425);
                TimeUnit.MILLISECONDS.sleep(1000);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(700, 452);
                    Location B = new Location(950, 373);
                    Color redMac = new Color(245,0,6);
                    Color redWindows = new Color(255, 0, 0);
                    Color colorA = A.getColor();
                    TimeUnit.MILLISECONDS.sleep(700);
                    if((colorA.equals(redMac)) || (colorA.equals(redWindows))) {
                        s.click(A);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(2);
                        Location AA = new Location(860, 350);
                        s.click(AA);
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
                        s.click(B);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(2);
                        Location BB = new Location(900, 400);
                        s.click(BB);
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
                        Location BBB = new Location(820, 390);
                        s.click(BBB);
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
        general.depodsAbraglands();
        TimeUnit.SECONDS.sleep(1);
        abraglandsIopAlchiAmakna();

    }

    public  void abraglandsIopScaraNord() throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapScara);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);

        TimeUnit.SECONDS.sleep(2);
        Location JJ = new Location(825, 100);
        s.click(JJ);
        TimeUnit.SECONDS.sleep(5);
        Location KK = new Location(960, 60);
        s.click(KK);
        TimeUnit.SECONDS.sleep(6);

        Location LL = new Location(530, 180);
        s.click(LL);
        TimeUnit.SECONDS.sleep(7);
        Location MM = new Location(560, 200);
        s.click(MM);
        TimeUnit.SECONDS.sleep(2);
        for (int i = 0; i < 200; i++) {
            try {
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                abraFound=true;
                Location launch = new Location(610, 205);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(590, 270);
                    Location B = new Location(770, 370);
                    Color redMac = new Color(245,0,6);
                    Color redWindows = new Color(255, 0, 0);
                    Color colorA = A.getColor();
                    TimeUnit.MILLISECONDS.sleep(700);
                    if((colorA.equals(redMac)) || (colorA.equals(redWindows))) {
                        s.click(A);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(2);
                        Location AA = new Location(670, 320);
                        s.click(AA);
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
                        Location AAA = new Location(740, 360);
                        s.click(AAA);
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
                        s.click(B);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(2);
                        Location BB = new Location(670, 320);
                        s.click(BB);
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
                        Location BBB = new Location(600, 290);
                        s.click(BBB);
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
        general.depodsAbraglands();
        TimeUnit.SECONDS.sleep(1);
        abraglandsIopScaraNord();

    }

    public  void abraglandsIopScaraNordGauche() throws InterruptedException, FindFailed, IOException {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapScara);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);

        TimeUnit.SECONDS.sleep(2);
        Location JJ = new Location(825, 100);
        s.click(JJ);
        TimeUnit.SECONDS.sleep(5);
        Location KKK = new Location(960, 60);
        s.click(KKK);
        TimeUnit.SECONDS.sleep(6);
        Location KKKK = new Location(370, 310);
        s.click(KKKK);
        TimeUnit.SECONDS.sleep(6);

        Location LL = new Location(530, 180);
        s.click(LL);
        TimeUnit.SECONDS.sleep(7);
        Location MM = new Location(560, 200);
        s.click(MM);
        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < 200; i++) {
            try {
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                abraFound=true;
                Location launch = new Location(610, 205);
                TimeUnit.MILLISECONDS.sleep(500);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(1080, 530);
                    //Location B = new Location(840, 410);
                    //Color redMac = new Color(245,0,6);
                    //Color redWindows = new Color(255, 0, 0);
                    //Color colorA = A.getColor();
                    TimeUnit.MILLISECONDS.sleep(1000);
                    //if((colorA.equals(redMac)) || (colorA.equals(redWindows))) {
                        s.click(A);
                        s.type(Key.F1);
                        TimeUnit.MILLISECONDS.sleep(2000);
                        Location AA = new Location(950, 460);
                        s.click(AA);
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
                        Location AAA = new Location(890, 440);
                        s.click(AAA);
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        s.click(abraFight);
                    //}
                    /*else{
                        s.click(B);
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
                        Location BBB = new Location(950, 460);
                        s.click(BBB);
                        TimeUnit.MILLISECONDS.sleep(1500);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        s.click(abraFight);
                    }*/

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
        general.depodsAbraglands();
        TimeUnit.SECONDS.sleep(1);
        abraglandsIopScaraNordGauche();
    }
}
