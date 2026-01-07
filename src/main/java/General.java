import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class General extends Main {

    public void insertCode(String code) throws IOException, InterruptedException {
        Keyboard kb = new DesktopKeyboard();

        InputStream input = new FileInputStream("/Users/cedricplouvier/Documents/Dofus/DofusBots/DofusBots/src/main/resources/config.properties");
        Properties properties = new Properties();
        properties.load(input);

        String pw = properties.get(code).toString();
        String [] pwSplit = pw.split("-");

        for(int i=0; i<pwSplit.length; i++){
            if(pwSplit[i].matches("0")){
                kb.type(Key.NUM0);
            }
            if(pwSplit[i].matches("1")){
                kb.type(Key.NUM1);
            }
            if(pwSplit[i].matches("2")){
                kb.type(Key.NUM2);
            }
            if(pwSplit[i].matches("3")){
                kb.type(Key.NUM3);
            }
            if(pwSplit[i].matches("4")){
                kb.type(Key.NUM4);
            }
            if(pwSplit[i].matches("5")){
                kb.type(Key.NUM5);
            }
            if(pwSplit[i].matches("6")){
                kb.type(Key.NUM6);
            }
            if(pwSplit[i].matches("7")){
                kb.type(Key.NUM7);
            }
            if(pwSplit[i].matches("8")){
                kb.type(Key.NUM8);
            }
            if(pwSplit[i].matches("9")){
                kb.type(Key.NUM9);
            }
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    public void zaapAstrubToMaisonCoffre1() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(820, 60));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(1245, 350));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(490, 135));
        TimeUnit.SECONDS.sleep(3);
        try {
            s.click(entreMaison);
        } catch (FindFailed e){
            System.out.println("FindFailed entreMaison");
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre1();
        }
        TimeUnit.SECONDS.sleep(3);
        insertCode("codeAstrubMaison");
        TimeUnit.MILLISECONDS.sleep(500);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(2);
        s.click(new Location(940, 370));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(740, 440));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(ouvreCoffre);
        } catch(FindFailed e){
            System.out.println("Findfailed ouvreCoffre");
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre1();
        }
        TimeUnit.SECONDS.sleep(2);
        insertCode("codeAstrubCoffre1");
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        if(s.exists(coffreOuvertKamas) == null){
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre1();
        }
    }

    public void zaapAstrubToMaisonCoffre2() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(820, 60));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(1245, 350));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(490, 135));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(entreMaison);
        } catch (FindFailed e){
            System.out.println("FindFailed entreMaison");
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre2();
        }
        TimeUnit.SECONDS.sleep(3);
        insertCode("codeAstrubMaison");
        TimeUnit.MILLISECONDS.sleep(300);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        s.click(new Location(940, 370));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(840, 320));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(840, 450));
        TimeUnit.MILLISECONDS.sleep(500);
        try {
            s.click(ouvreCoffre);
        } catch (FindFailed e){
            System.out.println("FindFailed ouvreCoffre");
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre2();
        }
        TimeUnit.SECONDS.sleep(2);
        insertCode("codeAstrubCoffre2");
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        if(s.exists(coffreOuvertKamas) == null){
            s.type(Key.ENTER);
            zaapAstrubToMaisonCoffre2();
        }
    }

    public void maisonAstrubToAtelierMineur() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(4);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(4);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(4);
        s.click(new Location(1250, 400));
        TimeUnit.SECONDS.sleep(9);
        s.click(new Location(1265, 340));
        TimeUnit.SECONDS.sleep(9);
        s.click(new Location(755, 270));
        TimeUnit.SECONDS.sleep(4);
        s.click(new Location(1040, 370));
        TimeUnit.MILLISECONDS.sleep(300);
        try {
            s.click(polirPierre);
        } catch (FindFailed e) {
            maisonAstrubToAtelierMineur();
        }
    }

    public void zaapAstrubForetAstrub() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        ArrayList<Location> mapsZaapAstrubToForetAstrub = new ArrayList<>();
        mapsZaapAstrubToForetAstrub.add(new Location(840, 65));
        mapsZaapAstrubToForetAstrub.add(new Location(765, 65));
        mapsZaapAstrubToForetAstrub.add(new Location(1050, 65));
        mapsZaapAstrubToForetAstrub.add(new Location(1250, 440));
        mapsZaapAstrubToForetAstrub.add(new Location(905, 65));
        mapsZaapAstrubToForetAstrub.add(new Location(365, 340));
        mapsZaapAstrubToForetAstrub.add(new Location(365, 305));
        mapsZaapAstrubToForetAstrub.add(new Location(770, 65));

        s.doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        for( Location nexMap : mapsZaapAstrubToForetAstrub){
            s.click(nexMap);
            TimeUnit.SECONDS.sleep(7);
        }
        if (s.exists(startForetAstrub) == null){
            zaapAstrubForetAstrub();
        }
    }

    public void depodsAbraglands() throws InterruptedException, FindFailed {
        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        s.click(new Location(1100, 200));
        TimeUnit.SECONDS.sleep(1);
        s.click(new Location(370, 200));
        TimeUnit.SECONDS.sleep(1);
        Match region1 = s.find(ambre);
        s.dragDrop(region1, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Match region2 = s.find(ambreAbra);
        s.dragDrop(region2, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Match region3 = s.find(bourgeonAbra);
        s.dragDrop(region3, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Match region5 = s.find(racineAbra);
        s.dragDrop(region5, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Match region6 = s.find(seveAbra);
        s.dragDrop(region6, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Match region7 = s.find(ecorceAbra);
        s.dragDrop(region7, new Location(500, 470));
        s.click(max);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        s.click(new Location(400, 200));
        Match region8 = s.find(abraGlands);
        s.dragDrop(region8, new Location(1100, 400));
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM2);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
        TimeUnit.SECONDS.sleep(1);
        s.type(Key.ENTER);
        TimeUnit.SECONDS.sleep(1);
        s.click(close);
        TimeUnit.SECONDS.sleep(5);
        s.doubleClick(popoRappel);
    }

    public void maisonAstrubToAtelierAlchi() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(830, 410));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(920, 280));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(preparerPotion);
        } catch (FindFailed e) {
            maisonAstrubToAtelierAlchi();
        }
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurArc() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(370, 350));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(370, 380));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(370, 310));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(860, 60));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(720, 410));
        TimeUnit.SECONDS.sleep(6);
        s.click(new Location(800, 380));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(sculpterArc);
        } catch (FindFailed e) {
            maisonAstrubToAterlierSculpteurArc();
        }
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurBaton() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(3);
        s.click(new Location(370, 350));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(370, 380));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(370, 310));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(860, 60));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(720, 410));
        TimeUnit.SECONDS.sleep(7);
        s.click(new Location(800, 380));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(sculpterBaton);
        } catch (FindFailed e) {
            maisonAstrubToAterlierSculpteurBaton();
        }
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurBaguette() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(370, 350));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(370, 380));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(370, 310));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(860, 60));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(720, 410));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(800, 380));
        TimeUnit.SECONDS.sleep(2);
        try {
            s.click(sculpterBaguette);
        } catch (FindFailed e) {
            maisonAstrubToAterlierSculpteurBaguette();
        }
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierBijoutierAmu() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        s.click(new Location(785, 370));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(950, 410));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(900, 420));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(775, 580));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(840, 580));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(835, 580));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(840, 580));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(840, 580));
        TimeUnit.SECONDS.sleep(8);
        s.click(new Location(940, 355));
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(800,200));
        TimeUnit.SECONDS.sleep(5);
        try {
            s.click(craftAmu);
        } catch (FindFailed e) {
            maisonAstrubToAterlierBijoutierAmu();
        }
        TimeUnit.SECONDS.sleep(5);
    }

    public void testCombatDefi() throws InterruptedException, FindFailed {
        Screen s = new Screen();
        if (s.exists(pretCombat) != null) {
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1050, 355));
            TimeUnit.MILLISECONDS.sleep(800);
            s.click(new Location(1000, 180));
            s.type(Key.F1);
            TimeUnit.SECONDS.sleep(3);
            s.click(new Location(870, 250));
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.F5);
            TimeUnit.SECONDS.sleep(1);
            s.click(new Location(870, 320));
            TimeUnit.MILLISECONDS.sleep(800);
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
}
