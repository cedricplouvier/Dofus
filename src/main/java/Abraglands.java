import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Abraglands extends Main {

    public void abraglandsSculpteurIop() throws InterruptedException, FindFailed {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        for (int i = 0; i < 150; i++) {
            try {
                //Location pain = new Location(1000, 680);
                //s.doubleClick(pain);
                //s.doubleClick(pain);
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
                TimeUnit.MILLISECONDS.sleep(500);
                Location launch = new Location(670, 420);
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

                    /*Location four = new Location(805, 365);
                    s.click(four);
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
                    Location three = new Location(790, 340);
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
                        /*s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F7);
                        TimeUnit.MILLISECONDS.sleep(700);*/
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.type(Key.F6);
                        s.click(abraFight);
                        /*TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F5);
                        s.click(abraFight);
                        TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F5);
                        s.click(abraFight);*/
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
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        Location D = new Location(860, 60);
        s.click(D);
        TimeUnit.SECONDS.sleep(5);
        Location AA = new Location(1245, 350);
        s.click(AA);
        TimeUnit.SECONDS.sleep(5);
        Location BB = new Location(490, 135);
        s.click(BB);
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
        Location E = new Location(940, 370);
        s.click(E);
        TimeUnit.SECONDS.sleep(5);
        Location F = new Location(740, 440);
        s.click(F);
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
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);
        TimeUnit.SECONDS.sleep(1);
        s.click(delock);
        TimeUnit.SECONDS.sleep(3);
        Location G = new Location(1100, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(370, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(ambre);
        Location I = new Location(500, 470);
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(ambreAbra);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(bourgeonAbra);
        s.dragDrop(region3, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        /*TimeUnit.SECONDS.sleep(1);
        Match region4 = s.find(clefAbra);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);*/
        TimeUnit.SECONDS.sleep(1);
        Match region5 = s.find(racineAbra);
        s.dragDrop(region5, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(seveAbra);
        s.dragDrop(region6, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region7 = s.find(ecorceAbra);
        s.dragDrop(region7, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);

        TimeUnit.SECONDS.sleep(1);
        Location Z = new Location(1100, 400);
        TimeUnit.SECONDS.sleep(1);
        Location ZZ = new Location(400, 200);
        s.click(ZZ);
        Match region8 = s.find(abraGlands);
        s.dragDrop(region8, Z);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM1);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM5);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoBonta);
        TimeUnit.SECONDS.sleep(10);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);


        TimeUnit.SECONDS.sleep(2);
        Location J = new Location(360, 270);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(360, 300);
        s.click(K);
        TimeUnit.SECONDS.sleep(6);

        Location L = new Location(580, 580);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(720, 580);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(990, 580);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        Location O = new Location(650, 580);
        s.click(O);
        TimeUnit.SECONDS.sleep(6);
        Location P = new Location(850, 580);
        s.click(P);
        TimeUnit.SECONDS.sleep(6);
        Location Q = new Location(1000, 250);
        s.click(Q);
        /*TimeUnit.SECONDS.sleep(6);
        Location R = new Location(670, 440);
        s.click(R);*/

        /*TimeUnit.SECONDS.sleep(6);
        Location V = new Location(600, 410);
        s.click(V);*/
        TimeUnit.SECONDS.sleep(6);
        Location U = new Location(635, 435);
        s.click(U);

        abraglandsSculpteurIop();
    }


    public  void abraglandsIopBoucherAmakna() throws InterruptedException, FindFailed {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        for (int i = 0; i < 150; i++) {
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
                TimeUnit.MILLISECONDS.sleep(500);
                Location launch = new Location(670, 420);
                s.rightClick(launch);
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
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        Location D = new Location(860, 60);
        s.click(D);
        TimeUnit.SECONDS.sleep(5);
        Location AA = new Location(1245, 350);
        s.click(AA);
        TimeUnit.SECONDS.sleep(5);
        Location BB = new Location(490, 135);
        s.click(BB);
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
        Location E = new Location(940, 370);
        s.click(E);
        TimeUnit.SECONDS.sleep(5);
        Location F = new Location(740, 440);
        s.click(F);
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
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);
        TimeUnit.SECONDS.sleep(1);
        s.click(delock);
        TimeUnit.SECONDS.sleep(3);
        Location G = new Location(1100, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(370, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(ambre);
        Location I = new Location(500, 470);
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(ambreAbra);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(bourgeonAbra);
        s.dragDrop(region3, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        /*Match region4 = s.find(clefAbra);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);*/
        Match region5 = s.find(racineAbra);
        s.dragDrop(region5, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(seveAbra);
        s.dragDrop(region6, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region7 = s.find(ecorceAbra);
        s.dragDrop(region7, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);

        TimeUnit.SECONDS.sleep(1);
        Location Z = new Location(1100, 400);
        TimeUnit.SECONDS.sleep(1);
        Location ZZ = new Location(400, 200);
        s.click(ZZ);
        Match region8 = s.find(abraGlands);
        s.dragDrop(region8, Z);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM1);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM5);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoBonta);
        TimeUnit.SECONDS.sleep(10);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);


        TimeUnit.SECONDS.sleep(2);
        Location J = new Location(360, 270);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(360, 300);
        s.click(K);
        TimeUnit.SECONDS.sleep(6);

        Location L = new Location(580, 580);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(720, 580);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(990, 580);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        Location O = new Location(650, 580);
        s.click(O);
        TimeUnit.SECONDS.sleep(6);
        Location P = new Location(850, 580);
        s.click(P);
        TimeUnit.SECONDS.sleep(6);
        Location Q = new Location(500, 580);
        s.click(Q);
        TimeUnit.SECONDS.sleep(6);
        Location R = new Location(360, 340);
        s.click(R);
        TimeUnit.SECONDS.sleep(6);
        Location S = new Location(360, 200);
        s.click(S);
        TimeUnit.SECONDS.sleep(6);
        Location T = new Location(950, 220);
        s.click(T);
        TimeUnit.SECONDS.sleep(6);
        Location V = new Location(600, 410);
        s.click(V);
        TimeUnit.SECONDS.sleep(6);
        Location U = new Location(635, 435);
        s.click(U);
        abraglandsIopBoucherAmakna();

    }

    public  void abraglandsIopAlchiAmakna() throws InterruptedException, FindFailed {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        for (int i = 0; i < 150; i++) {
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
                TimeUnit.MILLISECONDS.sleep(500);
                Location launch = new Location(700, 430);
                s.rightClick(launch);
                s.rightClick(launch);
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(700, 452);
                    Location B = new Location(950, 373);
                    Color red = new Color(245,0,6);
                    Color colorA = A.getColor();
                    TimeUnit.MILLISECONDS.sleep(700);
                    if(colorA.equals(red)) {
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
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        Location D = new Location(860, 60);
        s.click(D);
        TimeUnit.SECONDS.sleep(5);
        Location AA = new Location(1245, 350);
        s.click(AA);
        TimeUnit.SECONDS.sleep(5);
        Location BB = new Location(490, 135);
        s.click(BB);
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
        Location E = new Location(940, 370);
        s.click(E);
        TimeUnit.SECONDS.sleep(5);
        Location F = new Location(740, 440);
        s.click(F);
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
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);
        TimeUnit.SECONDS.sleep(1);
        s.click(delock);
        TimeUnit.SECONDS.sleep(3);
        Location G = new Location(1100, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(370, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(ambre);
        Location I = new Location(500, 470);
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(ambreAbra);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(bourgeonAbra);
        s.dragDrop(region3, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        /*Match region4 = s.find(clefAbra);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);*/
        Match region5 = s.find(racineAbra);
        s.dragDrop(region5, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(seveAbra);
        s.dragDrop(region6, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region7 = s.find(ecorceAbra);
        s.dragDrop(region7, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);

        TimeUnit.SECONDS.sleep(1);
        Location Z = new Location(1100, 400);
        TimeUnit.SECONDS.sleep(1);
        Location ZZ = new Location(400, 200);
        s.click(ZZ);
        Match region8 = s.find(abraGlands);
        s.dragDrop(region8, Z);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM1);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM5);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoBonta);
        TimeUnit.SECONDS.sleep(10);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        s.click(zaapAstrub);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapMili);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);


        TimeUnit.SECONDS.sleep(2);
        Location J = new Location(360, 270);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(360, 300);
        s.click(K);
        TimeUnit.SECONDS.sleep(6);

        Location L = new Location(580, 580);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(720, 580);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(990, 580);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        Location O = new Location(650, 580);
        s.click(O);
        TimeUnit.SECONDS.sleep(6);
        Location P = new Location(850, 580);
        s.click(P);
        TimeUnit.SECONDS.sleep(6);
        Location Q = new Location(500, 580);
        s.click(Q);
        TimeUnit.SECONDS.sleep(6);
        Location R = new Location(360, 340);
        s.click(R);
        TimeUnit.SECONDS.sleep(6);
        Location S = new Location(360, 200);
        s.click(S);
        TimeUnit.SECONDS.sleep(6);

        Location PP = new Location(1110, 590);
        s.click(PP);
        TimeUnit.SECONDS.sleep(6);
        Location QQ = new Location(1040, 590);
        s.click(QQ);
        TimeUnit.SECONDS.sleep(6);
        Location RR = new Location(1180, 590);
        s.click(RR);
        TimeUnit.SECONDS.sleep(6);

        Location T = new Location(730, 430);
        s.click(T);
        TimeUnit.SECONDS.sleep(6);
        Location V = new Location(620, 410);
        s.click(V);
        TimeUnit.SECONDS.sleep(6);
        Location U = new Location(660, 430);
        s.click(U);
        abraglandsIopAlchiAmakna();

    }
}
