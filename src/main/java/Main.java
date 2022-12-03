import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.basics.Debug;
import org.sikuli.script.*;

import java.awt.*;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {
    static Pattern abraBack = new Pattern("src/main/resources/img/abraBack.png").similar((float) 0.8);
    static Pattern abraLeft = new Pattern("src/main/resources/img/abraLeft.png").similar((float) 0.8);
    static Pattern abraRight = new Pattern("src/main/resources/img/abraRight.png").similar((float) 0.8);
    static Pattern abraFront = new Pattern("src/main/resources/img/abraFront.png").similar((float) 0.8);
    static Pattern abraFight = new Pattern("src/main/resources/img/abraFight.png").similar((float) 0.8);
    static Pattern fermerCombat = new Pattern("src/main/resources/img/fermerCombat.png").similar((float) 0.8);

    static Pattern options = new Pattern("src/main/resources/img/options.png").similar((float) 0.78);
    static Pattern tropCharge = new Pattern("src/main/resources/img/tropCharge.png").similar((float) 0.80);
    static Pattern popoRappel = new Pattern("src/main/resources/img/popoRappel.png").similar((float) 0.80);
    static Pattern popoBonta = new Pattern("src/main/resources/img/popoBonta.png").similar((float) 0.80);
    static Pattern entreMaison = new Pattern("src/main/resources/img/entreMaison.png").similar((float) 0.80);
    static Pattern One = new Pattern("src/main/resources/img/one.png").similar((float) 0.80);
    static Pattern Nine = new Pattern("src/main/resources/img/nine.png").similar((float) 0.80);
    static Pattern Zero = new Pattern("src/main/resources/img/zero.png").similar((float) 0.80);
    static Pattern Seven = new Pattern("src/main/resources/img/seven.png").similar((float) 0.80);
    static Pattern Six = new Pattern("src/main/resources/img/six.png").similar((float) 0.80);
    static Pattern delock = new Pattern("src/main/resources/img/delock.png").similar((float) 0.80);
    static Pattern ouvreCoffre = new Pattern("src/main/resources/img/ouvreCoffre.png").similar((float) 0.80);
    static Pattern ressourceInventaire = new Pattern("src/main/resources/img/ressourceInventaire.png").similar((float) 0.80);
    static Pattern bworky = new Pattern("src/main/resources/img/bworky.png").similar((float) 0.80);
    static Pattern arrowInventaire = new Pattern("src/main/resources/img/arrowInventaire.png").similar((float) 0.80);
    static Pattern familierInventaire = new Pattern("src/main/resources/img/familierInventaire.png").similar((float) 0.80);
    static Pattern swordInventaire = new Pattern("src/main/resources/img/swordInventaire.png").similar((float) 0.80);
    static Pattern max = new Pattern("src/main/resources/img/max.png").similar((float) 0.80);
    static Pattern check = new Pattern("src/main/resources/img/check.png").similar((float) 0.80);
    static Pattern close = new Pattern("src/main/resources/img/close.png").similar((float) 0.80);
    static Pattern zaapChateau = new Pattern("src/main/resources/img/zaapChateau.png").similar((float) 0.80);
    static Pattern zaapAstrub = new Pattern("src/main/resources/img/zaapAstrub.png").similar((float) 0.80);
    static Pattern utiliser = new Pattern("src/main/resources/img/utiliser.png").similar((float) 0.80);
    static Pattern selectZaapViVi = new Pattern("src/main/resources/img/selectZaapViVi.png").similar((float) 0.80);
    static Pattern selectZaapMili = new Pattern("src/main/resources/img/selectZaapMili.png").similar((float) 0.80);
    static Pattern oui = new Pattern("src/main/resources/img/oui.png").similar((float) 0.80);
    static Pattern pykur = new Pattern("src/main/resources/img/pykur.png").similar((float) 0.80);
    static Pattern nomoon = new Pattern("src/main/resources/img/nomoon.png").similar((float) 0.80);

    static Pattern ambre = new Pattern("src/main/resources/img/ambre.png").similar((float) 0.80);
    static Pattern ambreAbra = new Pattern("src/main/resources/img/ambreAbra.png").similar((float) 0.80);
    static Pattern boisEnvoute = new Pattern("src/main/resources/img/boisEnvoute.png").similar((float) 0.80);
    static Pattern bourgeonAbra = new Pattern("src/main/resources/img/bourgeonAbra.png").similar((float) 0.80);
    static Pattern clefAbra = new Pattern("src/main/resources/img/clefAbra.png").similar((float) 0.80);
    static Pattern racineAbra = new Pattern("src/main/resources/img/racineAbra.png").similar((float) 0.80);
    static Pattern seveAbra = new Pattern("src/main/resources/img/seveAbra.png").similar((float) 0.80);
    static Pattern abraGlands = new Pattern("src/main/resources/img/abraGlands.png").similar((float) 0.80);
    static Pattern ecorceAbra = new Pattern("src/main/resources/img/ecorceAbra.png").similar((float) 0.80);
    static Pattern epeeCombat = new Pattern("src/main/resources/img/epeeCombat.png").similar((float) 0.80);

    public static void main(String[] args) throws IOException, InterruptedException, AWTException, FindFailed {
        abraglandsIop();
        //abraglandsEnu();
        //betaKamas();
        //arakne();
        //cheminFer();
        //depodsGlands();
    }

    public static void abraglandsEnu() throws InterruptedException, FindFailed {

        TimeUnit.SECONDS.sleep(3);
        Screen s = new Screen();
        while(true) {
            try {
                if (s.exists(epeeCombat) != null) {
                    TimeUnit.SECONDS.sleep(3);
                    s.rightClick(epeeCombat);
                    TimeUnit.SECONDS.sleep(1);

                    Location A = new Location(600, 400);
                    s.click(A);
                    TimeUnit.SECONDS.sleep(1);
                    Location B = new Location(870, 260);
                    s.click(B);

                    s.type(Key.F1);

                    TimeUnit.SECONDS.sleep(2);
                    while (s.exists(abraFight) != null) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("abraFound");
                        s.type(Key.F1);
                    }
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            }
        }
    }
    public static void abraglandsIop() throws InterruptedException, FindFailed {

        TimeUnit.SECONDS.sleep(3);
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        TimeUnit.SECONDS.sleep(3);
        for (int i = 0; i < 350; i++) {
            try {
                boolean abraFound = false;
                TimeUnit.SECONDS.sleep(1);
                s.type(Key.F2);
                TimeUnit.SECONDS.sleep(1);
                if (s.exists(abraBack) != null) {
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
                }
                if (abraFound) {
                    TimeUnit.SECONDS.sleep(1);
                    Location A = new Location(735, 410);
                    s.click(A);
                    TimeUnit.SECONDS.sleep(1);
                    Location B = new Location(900, 350);
                    s.click(B);

                    TimeUnit.SECONDS.sleep(5); //temps que enus rejoignes
                    s.type(Key.F1);

                    TimeUnit.SECONDS.sleep(3);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.F7);
                    s.click(abraFight);

                    TimeUnit.SECONDS.sleep(2);
                    while (s.exists(abraFight) != null) {
                        s.type(Key.F6);
                        s.click(abraFight);
                        System.out.println("abraFight");
                        TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F6);
                        s.click(abraFight);
                        TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F1);
                        TimeUnit.SECONDS.sleep(13);
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
        Match region4 = s.find(clefAbra);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
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
        kb.type(Key.NUM3);
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
        TimeUnit.SECONDS.sleep(6);
        Location R = new Location(670, 440);
        s.click(R);
        abraglandsIop();
    }

    public static void cheminFer() throws InterruptedException, FindFailed {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        Pattern arakneBack = new Pattern("src/main/resources/img/arakneBackInv.png").similar((float) 0.78);
        Pattern arakneLeft = new Pattern("src/main/resources/img/arakneLeftInv.png").similar((float) 0.80);
        Pattern arakneRight = new Pattern("src/main/resources/img/arakneRightInv.png").similar((float) 0.78);
        Pattern arakneFront = new Pattern("src/main/resources/img/arakneFrontInv.png").similar((float) 0.78);
        Pattern arakneFight = new Pattern("src/main/resources/img/arakneFight.png").similar((float) 0.78);
        Pattern options = new Pattern("src/main/resources/img/options.png").similar((float) 0.78);
        Pattern tropCharge = new Pattern("src/main/resources/img/tropCharge.png").similar((float) 0.80);
        Pattern popoRappel = new Pattern("src/main/resources/img/popoRappel.png").similar((float) 0.80);
        Pattern entreMaison = new Pattern("src/main/resources/img/entreMaison.png").similar((float) 0.80);
        Pattern One = new Pattern("src/main/resources/img/one.png").similar((float) 0.80);
        Pattern Nine = new Pattern("src/main/resources/img/nine.png").similar((float) 0.80);
        Pattern Zero = new Pattern("src/main/resources/img/zero.png").similar((float) 0.80);
        Pattern Seven = new Pattern("src/main/resources/img/seven.png").similar((float) 0.80);
        Pattern Six = new Pattern("src/main/resources/img/six.png").similar((float) 0.80);
        Pattern delock = new Pattern("src/main/resources/img/delock.png").similar((float) 0.80);
        Pattern ouvreCoffre = new Pattern("src/main/resources/img/ouvreCoffre.png").similar((float) 0.80);
        Pattern ressourceInventaire = new Pattern("src/main/resources/img/ressourceInventaire.png").similar((float) 0.80);
        Pattern poudre = new Pattern("src/main/resources/img/poudre.png").similar((float) 0.80);
        Pattern patteArak = new Pattern("src/main/resources/img/patteArak.png").similar((float) 0.80);
        Pattern aileMoskito = new Pattern("src/main/resources/img/aileMoskito.png").similar((float) 0.80);
        Pattern sourcilMoskito = new Pattern("src/main/resources/img/sourcilMoskito.png").similar((float) 0.80);
        Pattern sporme = new Pattern("src/main/resources/img/sporme.png").similar((float) 0.80);
        Pattern epineChamp = new Pattern("src/main/resources/img/epineChamp.png").similar((float) 0.80);
        Pattern grainePavot = new Pattern("src/main/resources/img/grainePavot.png").similar((float) 0.80);
        Pattern champignon = new Pattern("src/main/resources/img/champignon.png").similar((float) 0.76);
        Pattern popoBonta = new Pattern("src/main/resources/img/popoBonta.png").similar((float) 0.80);
        Pattern bworky = new Pattern("src/main/resources/img/bworky.png").similar((float) 0.80);
        Pattern arrowInventaire = new Pattern("src/main/resources/img/arrowInventaire.png").similar((float) 0.80);
        Pattern familierInventaire = new Pattern("src/main/resources/img/familierInventaire.png").similar((float) 0.80);
        Pattern swordInventaire = new Pattern("src/main/resources/img/swordInventaire.png").similar((float) 0.80);
        Pattern max = new Pattern("src/main/resources/img/max.png").similar((float) 0.80);
        Pattern check = new Pattern("src/main/resources/img/check.png").similar((float) 0.80);
        Pattern close = new Pattern("src/main/resources/img/close.png").similar((float) 0.80);
        Pattern zaapChateau = new Pattern("src/main/resources/img/zaapChateau.png").similar((float) 0.80);
        Pattern zaapAstrub = new Pattern("src/main/resources/img/zaapAstrub.png").similar((float) 0.80);
        Pattern utiliser = new Pattern("src/main/resources/img/utiliser.png").similar((float) 0.80);
        Pattern selectZaapViVi = new Pattern("src/main/resources/img/selectZaapViVi.png").similar((float) 0.80);
        Pattern selectZaapMili = new Pattern("src/main/resources/img/selectZaapMili.png").similar((float) 0.80);
        Pattern oui = new Pattern("src/main/resources/img/oui.png").similar((float) 0.80);
        Pattern pykur = new Pattern("src/main/resources/img/pykur.png").similar((float) 0.80);
        Pattern nomoon = new Pattern("src/main/resources/img/nomoon.png").similar((float) 0.80);
        Pattern sadiFight = new Pattern("src/main/resources/img/sadiFight.png").similar((float) 0.80);;
        Pattern moskitoFront = new Pattern("src/main/resources/img/moskitoFront.png").similar((float) 0.78);
        Pattern moskitoLeft = new Pattern("src/main/resources/img/moskitoLeft.png").similar((float) 0.78);
        Pattern moskitoBack = new Pattern("src/main/resources/img/moskitoBack.png").similar((float) 0.78);
        Pattern moskitoRight = new Pattern("src/main/resources/img/moskitoRight.png").similar((float) 0.78);
        Pattern champChamp = new Pattern("src/main/resources/img/champChamp.png").similar((float) 0.78);
        Pattern champChamp2 = new Pattern("src/main/resources/img/champChamp2.png").similar((float) 0.78);
        Pattern champChamp3 = new Pattern("src/main/resources/img/champChamp3.png").similar((float) 0.78);
        Pattern mapSud = new Pattern("src/main/resources/img/mapSud.png").similar((float) 0.80);


        TimeUnit.SECONDS.sleep(5);
        //while(s.exists(tropCharge) == null){
        for(int i=0; i<200; i ++){
            try {
                boolean arakneFound = false;

                if(s.exists(options) != null){
                    s.type(Key.ESC);
                    TimeUnit.SECONDS.sleep(2);
                } else if(s.exists(mapSud) != null){
                        Location MS = new Location(850, 60);
                        s.click(MS);
                } else if (s.exists(moskitoFront) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoFront);
                    System.out.println("moskitoFront");
                } else if (s.exists(moskitoLeft) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoLeft);
                    System.out.println("moskitoLeft");
                } /*else if (s.exists(moskitoBack) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoBack);
                    System.out.println("moskitoBack");
                } else if (s.exists(moskitoRight) != null) {
                    arakneFound=true;
                    s.rightClick(moskitoRight);
                    System.out.println("moskitoRight");
                }*/ else if (s.exists(champChamp) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp);
                    System.out.println("champchamp");
                }
                else if (s.exists(champChamp2) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp2);
                    System.out.println("champchamp2");
                }
                else if (s.exists(champChamp3) != null) {
                    arakneFound=true;
                    s.rightClick(champChamp3);
                    System.out.println("champchamp3");
                }
                else if (s.exists(arakneBack) != null) {
                    arakneFound=true;
                    s.rightClick(arakneBack);
                    System.out.println("arakneback");
                } else if (s.exists(arakneLeft) != null) {
                    arakneFound=true;
                    s.rightClick(arakneLeft);
                    System.out.println("arakneLeft");
                } else if (s.exists(arakneRight) != null) {
                    arakneFound=true;
                    s.rightClick(arakneRight);
                    System.out.println("arakneRight");
                } else if (s.exists(arakneFront) != null) {
                    arakneFound = true;
                    s.rightClick(arakneFront);
                    System.out.println("arakneFront");
                } else {
                    System.out.println("GROUP NOT FOUND");
                }
                if(arakneFound) {
                    TimeUnit.SECONDS.sleep(5);
                    Location A = new Location(840, 300);
                    s.click(A);
                    TimeUnit.SECONDS.sleep(2);
                    Location B = new Location(770, 240);
                    s.click(B);

                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.F2);
                    s.click(sadiFight);
                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.F3);
                    s.click(sadiFight);
                    TimeUnit.SECONDS.sleep(1);
                    while (s.exists(sadiFight) != null) {
                        TimeUnit.SECONDS.sleep(1);
                        s.type(Key.F1);
                    }
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.ESC);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("trop chargé");
        s.type(Key.F8); //inventaire
        TimeUnit.SECONDS.sleep(1);
        s.click(swordInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(arrowInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(familierInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(bworky);
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
        /*TimeUnit.SECONDS.sleep(1);
        s.click(One);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);*/
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
        /*s.click(One);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);
        TimeUnit.SECONDS.sleep(1);*/
        s.click(delock);
        TimeUnit.SECONDS.sleep(3);
        Location G = new Location(1100, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(360, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(patteArak);
        Location I = new Location(500, 470);
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(poudre);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(aileMoskito);
        s.dragDrop(region3, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region4 = s.find(sourcilMoskito);
        s.dragDrop(region4, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region5 = s.find(epineChamp);
        s.dragDrop(region5, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(grainePavot);
        s.dragDrop(region6, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region8 = s.find(champignon);
        s.dragDrop(region8, I);
        s.click(max);
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
        Location L = new Location(360, 200);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(360, 540);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(360, 470);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        s.type(Key.F8); //inventaire
        TimeUnit.SECONDS.sleep(1);
        s.click(swordInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(arrowInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(familierInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(nomoon);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        cheminFer();
    }
    public static void betaKamas() throws InterruptedException, FindFailed {
        boolean farming = true;
        Screen s = new Screen();
        while(farming) {
            TimeUnit.SECONDS.sleep(1);
            Location A = new Location(560, 340); //sculpteur scara
            s.click(A);
            TimeUnit.SECONDS.sleep(1);
            Location B = new Location(500, 340);
            s.click(B);
        }
    }
    public static void arakne() throws InterruptedException, FindFailed {

        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();
        Pattern arakneBack = new Pattern("src/main/resources/img/arakneBack.png").similar((float) 0.78);
        Pattern arakneLeft = new Pattern("src/main/resources/img/arakneLeft.png").similar((float) 0.78);
        Pattern arakneRight = new Pattern("src/main/resources/img/arakneRight.png").similar((float) 0.78);
        Pattern arakneFront = new Pattern("src/main/resources/img/arakneFront.png").similar((float) 0.78);
        Pattern goudFight = new Pattern("src/main/resources/img/goudFight.png");
        Pattern arakneFight = new Pattern("src/main/resources/img/arakneFight.png").similar((float) 0.78);
        Pattern arakneRightInv = new Pattern("src/main/resources/img/arakneRightInv.png").similar((float) 0.78);
        Pattern options = new Pattern("src/main/resources/img/options.png").similar((float) 0.78);
        Pattern tropCharge = new Pattern("src/main/resources/img/tropCharge.png").similar((float) 0.80);
        Pattern popoRappel = new Pattern("src/main/resources/img/popoRappel.png").similar((float) 0.80);
        Pattern entreMaison = new Pattern("src/main/resources/img/entreMaison.png").similar((float) 0.80);
        Pattern One = new Pattern("src/main/resources/img/one.png").similar((float) 0.80);
        Pattern Nine = new Pattern("src/main/resources/img/nine.png").similar((float) 0.80);
        Pattern Zero = new Pattern("src/main/resources/img/zero.png").similar((float) 0.80);
        Pattern Seven = new Pattern("src/main/resources/img/seven.png").similar((float) 0.80);
        Pattern Six = new Pattern("src/main/resources/img/six.png").similar((float) 0.80);
        Pattern delock = new Pattern("src/main/resources/img/delock.png").similar((float) 0.80);
        Pattern ouvreCoffre = new Pattern("src/main/resources/img/ouvreCoffre.png").similar((float) 0.80);
        Pattern ressourceInventaire = new Pattern("src/main/resources/img/ressourceInventaire.png").similar((float) 0.80);
        Pattern poudre = new Pattern("src/main/resources/img/poudre.png").similar((float) 0.80);
        Pattern patteArak = new Pattern("src/main/resources/img/patteArak.png").similar((float) 0.80);
        Pattern popoBonta = new Pattern("src/main/resources/img/popoBonta.png").similar((float) 0.80);
        Pattern bworky = new Pattern("src/main/resources/img/bworky.png").similar((float) 0.80);
        Pattern arrowInventaire = new Pattern("src/main/resources/img/arrowInventaire.png").similar((float) 0.80);
        Pattern familierInventaire = new Pattern("src/main/resources/img/familierInventaire.png").similar((float) 0.80);
        Pattern swordInventaire = new Pattern("src/main/resources/img/swordInventaire.png").similar((float) 0.80);
        Pattern max = new Pattern("src/main/resources/img/max.png").similar((float) 0.80);
        Pattern check = new Pattern("src/main/resources/img/check.png").similar((float) 0.80);
        Pattern close = new Pattern("src/main/resources/img/close.png").similar((float) 0.80);
        Pattern zaapChateau = new Pattern("src/main/resources/img/zaapChateau.png").similar((float) 0.80);
        Pattern utiliser = new Pattern("src/main/resources/img/utiliser.png").similar((float) 0.80);
        Pattern selectZaapViVi = new Pattern("src/main/resources/img/selectZaapViVi.png").similar((float) 0.80);
        Pattern oui = new Pattern("src/main/resources/img/oui.png").similar((float) 0.80);
        Pattern pykur = new Pattern("src/main/resources/img/pykur.png").similar((float) 0.80);
        Pattern templeCra = new Pattern("src/main/resources/img/templeCra.png").similar((float) 0.80);

        TimeUnit.SECONDS.sleep(5);
        while(s.exists(tropCharge) == null){
            try {
                boolean arakneFound = false;
                if(s.exists(templeCra) != null){
                    Location O = new Location(670, 490);
                    s.click(O);
                }
                else if(s.exists(options) != null){
                    s.type(Key.ESC);
                    TimeUnit.SECONDS.sleep(2);
                }
                else if (s.exists(arakneBack) != null) {
                    arakneFound=true;
                    System.out.println("arakneback");
                    s.rightClick(arakneBack);
                } else if (s.exists(arakneLeft) != null) {
                    arakneFound=true;
                    System.out.println("arakneleft");
                    s.rightClick(arakneLeft);
                } else if (s.exists(arakneRight) != null) {
                    arakneFound=true;
                    System.out.println("arakneright");
                    s.rightClick(arakneRight);
                } else if (s.exists(arakneFront) != null) {
                    arakneFound=true;
                    System.out.println("abrafront");
                    s.rightClick(arakneFront);
                } else if (s.exists(arakneRightInv) != null) {
                    arakneFound=true;
                    System.out.println("arakneRightInv");
                    s.rightClick(arakneRightInv);
                } else {
                    System.out.println("ARAKNE NOT FOUND");
                }
                if(arakneFound) {
                    TimeUnit.SECONDS.sleep(3);
                    Location A = new Location(670, 500); //temple cra
                    s.click(A);
                    Location B = new Location(870, 350);
                    s.click(B);

                    TimeUnit.SECONDS.sleep(1);
                    s.type(Key.F1);
                    TimeUnit.SECONDS.sleep(2);
                    Location C = new Location(810, 430); //temple cra
                    s.click(C);
                    TimeUnit.SECONDS.sleep(1);
                    while (s.exists(arakneFight) != null) {
                        TimeUnit.SECONDS.sleep(2);
                        s.type(Key.F7);
                        s.click(arakneFight);
                    }
                    TimeUnit.SECONDS.sleep(2);
                    s.type(Key.ESC);
                }
            } catch (FindFailed e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("trop chargé");
        s.type(Key.F8); //inventaire
        TimeUnit.SECONDS.sleep(1);
        s.click(swordInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(arrowInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(familierInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(bworky);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        Location D = new Location(1200, 150);
        s.click(D);
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
        s.click(One);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Nine);
        TimeUnit.SECONDS.sleep(1);
        s.click(Six);
        TimeUnit.SECONDS.sleep(1);
        s.click(delock);
        TimeUnit.SECONDS.sleep(1);
        Location E = new Location(900, 270);
        s.click(E);
        TimeUnit.SECONDS.sleep(5);
        Location F = new Location(600, 320);
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
        TimeUnit.SECONDS.sleep(1);
        Location G = new Location(1210, 200);
        s.click(G);
        TimeUnit.SECONDS.sleep(1);
        Location H = new Location(480, 200);
        s.click(H);
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(patteArak);
        Location I = new Location(500, 470); //temple cra
        s.dragDrop(region1, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(poudre);
        s.dragDrop(region2, I);
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.click(check);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoBonta);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(1);
        s.click(zaapChateau);
        TimeUnit.SECONDS.sleep(1);
        s.click(utiliser);
        TimeUnit.SECONDS.sleep(1);
        s.click(selectZaapViVi);
        TimeUnit.SECONDS.sleep(1);
        s.click(oui);
        TimeUnit.SECONDS.sleep(2);
        Location J = new Location(1270, 305);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(830, 585);
        s.click(K);
        TimeUnit.SECONDS.sleep(6);
        Location L = new Location(695, 580);
        s.click(L);
        TimeUnit.SECONDS.sleep(6);
        Location M = new Location(830, 580);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(1250, 310);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        s.type(Key.F8); //inventaire
        TimeUnit.SECONDS.sleep(1);
        s.click(swordInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(arrowInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.click(familierInventaire);
        TimeUnit.SECONDS.sleep(1);
        s.doubleClick(pykur);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        arakne();
    }
    public static void depodsGlands() throws InterruptedException {

    }
}
