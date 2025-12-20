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

import static org.sikuli.script.Commands.doubleClick;

public class General extends Main {

    public void insertCode(String code) throws IOException, InterruptedException {
        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        InputStream input = new FileInputStream("SikuliEnuJava8/src/main/resources/config.properties");
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
            TimeUnit.MILLISECONDS.sleep(300);
        }

    }

    public void zaapAstrubToMaisonCoffre1() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        Location A = new Location(820, 60);
        s.click(A);
        TimeUnit.SECONDS.sleep(5);
        Location B = new Location(1245, 350);
        s.click(B);
        TimeUnit.SECONDS.sleep(5);
        Location C = new Location(490, 135);
        s.click(C);
        TimeUnit.SECONDS.sleep(2);
        s.click(entreMaison);
        TimeUnit.SECONDS.sleep(3);
        //using own account
        insertCode("codeAstrubMaison");
        TimeUnit.MILLISECONDS.sleep(300);
        s.click(delock);

        TimeUnit.SECONDS.sleep(1);
        Location D = new Location(940, 370);
        s.click(D);
        TimeUnit.SECONDS.sleep(5);
        Location E = new Location(740, 440);
        s.click(E);
        TimeUnit.SECONDS.sleep(1);
        s.click(ouvreCoffre);
        TimeUnit.SECONDS.sleep(2);

        insertCode("codeAstrubCoffre1");
        s.click(delock);

    }

    public void zaapAstrubToMaisonCoffre2() throws InterruptedException, FindFailed, IOException {
        Screen s = new Screen();

        doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        Location A = new Location(820, 60);
        s.click(A);
        TimeUnit.SECONDS.sleep(5);
        Location B = new Location(1245, 350);
        s.click(B);
        TimeUnit.SECONDS.sleep(5);
        Location C = new Location(490, 135);
        s.click(C);
        TimeUnit.SECONDS.sleep(2);
        s.click(entreMaison);
        TimeUnit.SECONDS.sleep(3);
        insertCode("codeAstrubMaison");
        TimeUnit.MILLISECONDS.sleep(300);
        s.click(delock);
        TimeUnit.SECONDS.sleep(1);
        Location D = new Location(940, 370);
        s.click(D);
        TimeUnit.SECONDS.sleep(3);
        Location E = new Location(840, 320);
        s.click(E);
        TimeUnit.SECONDS.sleep(3);
        Location EE = new Location(840, 450);
        s.click(EE);
        TimeUnit.MILLISECONDS.sleep(500);
        s.click(ouvreCoffre);
        TimeUnit.SECONDS.sleep(2);
        insertCode("codeAstrubCoffre2");
        s.click(delock);
    }

    public void maisonAstrubToAtelierMineur() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(4);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(4);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(4);
        Location M = new Location(1250, 400);
        s.click(M);
        TimeUnit.SECONDS.sleep(9);
        Location N = new Location(1265, 340);
        s.click(N);
        TimeUnit.SECONDS.sleep(9);
        Location O = new Location(755, 270);
        s.click(O);
        TimeUnit.SECONDS.sleep(4);
        Location OO = new Location(1040, 370);
        s.click(OO);
        TimeUnit.MILLISECONDS.sleep(300);
        s.click(polirPierre);
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


        doubleClick(popoRappel);
        TimeUnit.SECONDS.sleep(5);
        for( Location nexMap : mapsZaapAstrubToForetAstrub){
            s.click(nexMap);
            TimeUnit.SECONDS.sleep(6);
        }
    }

    public void depodsAbraglands() throws InterruptedException, FindFailed {

        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

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
        kb.type(Key.NUM2);
        TimeUnit.SECONDS.sleep(1);
        kb.type(Key.NUM0);
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
    }

    public void maisonAstrubToAtelierAlchi() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(3);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(3);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(3);
        Location M = new Location(830, 410);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(920, 280);
        s.click(N);
        TimeUnit.SECONDS.sleep(2);
        s.click(preparerPotion);
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurArc() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(3);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(3);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(3);
        Location M = new Location(370, 350);
        s.click(M);
        TimeUnit.SECONDS.sleep(6);
        Location N = new Location(370, 380);
        s.click(N);
        TimeUnit.SECONDS.sleep(6);
        Location O = new Location(370, 310);
        s.click(O);
        TimeUnit.SECONDS.sleep(6);
        Location P = new Location(860, 60);
        s.click(P);
        TimeUnit.SECONDS.sleep(6);
        Location Q = new Location(720, 410);
        s.click(Q);
        TimeUnit.SECONDS.sleep(6);
        Location R = new Location(800, 380);
        s.click(R);
        TimeUnit.SECONDS.sleep(2);
        s.click(sculpterArc);
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurBaton() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(3);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(3);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(3);
        Location M = new Location(370, 350);
        s.click(M);
        TimeUnit.SECONDS.sleep(7);
        Location N = new Location(370, 380);
        s.click(N);
        TimeUnit.SECONDS.sleep(7);
        Location O = new Location(370, 310);
        s.click(O);
        TimeUnit.SECONDS.sleep(7);
        Location P = new Location(860, 60);
        s.click(P);
        TimeUnit.SECONDS.sleep(7);
        Location Q = new Location(720, 410);
        s.click(Q);
        TimeUnit.SECONDS.sleep(7);
        Location R = new Location(800, 380);
        s.click(R);
        TimeUnit.SECONDS.sleep(2);
        s.click(sculpterBaton);
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierSculpteurBaguette() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(5);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(5);
        Location M = new Location(370, 350);
        s.click(M);
        TimeUnit.SECONDS.sleep(8);
        Location N = new Location(370, 380);
        s.click(N);
        TimeUnit.SECONDS.sleep(8);
        Location O = new Location(370, 310);
        s.click(O);
        TimeUnit.SECONDS.sleep(8);
        Location P = new Location(860, 60);
        s.click(P);
        TimeUnit.SECONDS.sleep(8);
        Location Q = new Location(720, 410);
        s.click(Q);
        TimeUnit.SECONDS.sleep(8);
        Location R = new Location(800, 380);
        s.click(R);
        TimeUnit.SECONDS.sleep(2);
        s.click(sculpterBaguette);
        TimeUnit.SECONDS.sleep(3);
    }

    public void maisonAstrubToAterlierBijoutierAmu() throws FindFailed, InterruptedException {
        Screen s = new Screen();

        Location J = new Location(785, 370);
        s.click(J);
        TimeUnit.SECONDS.sleep(5);
        Location K = new Location(950, 410);
        s.click(K);
        TimeUnit.SECONDS.sleep(5);
        Location L = new Location(900, 420);
        s.click(L);
        TimeUnit.SECONDS.sleep(5);
        Location M = new Location(775, 580);
        s.click(M);
        TimeUnit.SECONDS.sleep(8);
        Location N = new Location(840, 580);
        s.click(N);
        TimeUnit.SECONDS.sleep(8);
        Location O = new Location(835, 580);
        s.click(O);
        TimeUnit.SECONDS.sleep(8);
        Location P = new Location(840, 580);
        s.click(P);
        TimeUnit.SECONDS.sleep(8);
        Location Q = new Location(840, 580);
        s.click(Q);
        TimeUnit.SECONDS.sleep(8);
        Location R = new Location(940, 355);
        s.click(R);
        TimeUnit.SECONDS.sleep(5);
        s.click(new Location(800,200));
        TimeUnit.SECONDS.sleep(5);
        s.click(craftAmu);
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
