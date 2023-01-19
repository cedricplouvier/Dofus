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
    /* All Images have been taken in 1280x800. Make sure to use the same resolution for images to be recognized
    Some images are related to a game character and screenshots need to be renewed to function for your account
     */

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
    static Pattern minerai = new Pattern("src/main/resources/img/minerai.png").similar((float) 0.80);
    static Pattern argent = new Pattern("src/main/resources/img/argent.png").similar((float) 0.80);
    static Pattern bronze = new Pattern("src/main/resources/img/bronze.png").similar((float) 0.80);
    static Pattern cuivre = new Pattern("src/main/resources/img/cuivre.png").similar((float) 0.80);
    static Pattern etain = new Pattern("src/main/resources/img/etain.png").similar((float) 0.80);
    static Pattern forgerEpee = new Pattern("src/main/resources/img/forgerEpee.png").similar((float) 0.80);
    static Pattern maxCraft = new Pattern("src/main/resources/img/maxCraft.png").similar((float) 0.80);

    static Pattern arakneBack = new Pattern("src/main/resources/img/arakneBackInv.png").similar((float) 0.78);
    static Pattern arakneLeft = new Pattern("src/main/resources/img/arakneLeftInv.png").similar((float) 0.80);
    static Pattern arakneRight = new Pattern("src/main/resources/img/arakneRightInv.png").similar((float) 0.78);
    static Pattern arakneFront = new Pattern("src/main/resources/img/arakneFrontInv.png").similar((float) 0.78);
    static Pattern poudre = new Pattern("src/main/resources/img/poudre.png").similar((float) 0.80);
    static Pattern patteArak = new Pattern("src/main/resources/img/patteArak.png").similar((float) 0.80);
    static Pattern aileMoskito = new Pattern("src/main/resources/img/aileMoskito.png").similar((float) 0.80);
    static Pattern sourcilMoskito = new Pattern("src/main/resources/img/sourcilMoskito.png").similar((float) 0.80);
    static Pattern epineChamp = new Pattern("src/main/resources/img/epineChamp.png").similar((float) 0.80);
    static Pattern grainePavot = new Pattern("src/main/resources/img/grainePavot.png").similar((float) 0.80);
    static Pattern champignon = new Pattern("src/main/resources/img/champignon.png").similar((float) 0.76);
    static Pattern sadiFight = new Pattern("src/main/resources/img/sadiFight.png").similar((float) 0.80);;
    static Pattern moskitoFront = new Pattern("src/main/resources/img/moskitoFront.png").similar((float) 0.78);
    static Pattern moskitoLeft = new Pattern("src/main/resources/img/moskitoLeft.png").similar((float) 0.78);
    static Pattern moskitoBack = new Pattern("src/main/resources/img/moskitoBack.png").similar((float) 0.78);
    static Pattern moskitoRight = new Pattern("src/main/resources/img/moskitoRight.png").similar((float) 0.78);
    static Pattern champChamp = new Pattern("src/main/resources/img/champChamp.png").similar((float) 0.78);
    static Pattern champChamp2 = new Pattern("src/main/resources/img/champChamp2.png").similar((float) 0.78);
    static Pattern champChamp3 = new Pattern("src/main/resources/img/champChamp3.png").similar((float) 0.78);
    static Pattern mapSudCheminFer = new Pattern("src/main/resources/img/mapSudCheminFer.png").similar((float) 0.80);

    static Pattern potionFoyer = new Pattern("src/main/resources/img/potionFoyer.png").similar((float) 0.80);
    static Pattern poudrePerlenpain = new Pattern("src/main/resources/img/poudrePerlenpain.png").similar((float) 0.80);
    static Pattern boisErable = new Pattern("src/main/resources/img/boisErable.png").similar((float) 0.80);
    static Pattern boisNoyer = new Pattern("src/main/resources/img/boisNoyer.png").similar((float) 0.80);
    static Pattern geleesRouge = new Pattern("src/main/resources/img/geleesRouge.png").similar((float) 0.80);

    static Pattern osChafer = new Pattern("src/main/resources/img/osChafer.png").similar((float) 0.80);
    static Pattern boisChataignier = new Pattern("src/main/resources/img/boisChataignier.png").similar((float) 0.80);
    static Pattern boisChene = new Pattern("src/main/resources/img/boisChene.png").similar((float) 0.80);

    static Pattern popoBrakmar = new Pattern("src/main/resources/img/popoBrakmar.png").similar((float) 0.80);



    public static void main(String[] args) throws IOException, InterruptedException, AWTException, FindFailed {

        BotsCraft botsCraft = new BotsCraft();
        //botsCraft.craftTristeLame();
        //botsCraft.craftBatonDakn();
        //botsCraft.craftBaton110();

        BotsFourbe botsFourbe = new BotsFourbe();
        //botsFourbe.cheminFer();

        Abraglands abraglands = new Abraglands();
        //abraglands.abraglandsSculpteurIop();
        abraglands.abraglandsIopBoucherAmakna();

        //abraglandsEnu();
        //betaKamas();
        //arakne();
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
}
