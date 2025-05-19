import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

public class BotsJugement extends Main{


    public void donjonMorose() throws FindFailed, InterruptedException {

        Screen s = new Screen();
        Keyboard kb = new DesktopKeyboard();

        //rentrer le donjon
        TimeUnit.SECONDS.sleep(5);
        Location A = new Location(1175, 410);
        s.click(A);
        TimeUnit.MILLISECONDS.sleep(400);
        Location B = new Location(1200, 425);
        s.click(B);
        TimeUnit.MILLISECONDS.sleep(400);
        Location C = new Location(600, 350);
        s.click(C);
        TimeUnit.MILLISECONDS.sleep(400);
        Location D = new Location(550, 375);
        s.click(D);

        //Salle 1

        //find chiendent
        boolean chiendentFound = false;
        while(!chiendentFound) {
            if (s.exists(chiendentUpRight) != null) {
                chiendentFound = true;
                s.rightClick(chiendentUpRight);
            } else if (s.exists(chiendentUpLeft) != null) {
                chiendentFound = true;
                s.rightClick(chiendentUpLeft);
            } else if (s.exists(chiendentDownLeft) != null) {
                chiendentFound = true;
                s.rightClick(chiendentDownLeft);
            } else if (s.exists(chiendentDownRight) != null) {
                chiendentFound = true;
                s.rightClick(chiendentDownRight);
            }
        }
        if(chiendentFound) {
            TimeUnit.MILLISECONDS.sleep(5000);
            Location E = new Location(840, 375);
            s.click(E);
            TimeUnit.MILLISECONDS.sleep(400);
            Location F = new Location(870, 400);
            s.click(F);
            TimeUnit.MILLISECONDS.sleep(400);
            s.type(Key.F1);

            TimeUnit.MILLISECONDS.sleep(2000);

            s.type(Key.F6);
            s.click(chiendentFight);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.F6);
            s.click(chiendentFight);
            TimeUnit.MILLISECONDS.sleep(300);
            while (s.exists(chiendentFight) != null) {
                s.type(Key.F6);
                s.click(chiendentFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F6);
                s.click(chiendentFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F1);
                TimeUnit.SECONDS.sleep(10);
            }
            s.type(Key.ESC);
        }

        //Salle 2
        //find nerbe
        boolean nerbeFound = false;

        while(!nerbeFound) {
            if (s.exists(nerbeUpRight) != null) {
                nerbeFound = true;
                s.rightClick(nerbeUpRight);
            } else if (s.exists(nerbeUpLeft) != null) {
                nerbeFound = true;
                s.rightClick(nerbeUpLeft);
            } else if (s.exists(nerbeDownLeft) != null) {
                nerbeFound = true;
                s.rightClick(nerbeDownLeft);
            } else if (s.exists(nerbeDownRight) != null) {
                nerbeFound = true;
                s.rightClick(nerbeDownRight);
            }
        }
        if(nerbeFound) {
            TimeUnit.MILLISECONDS.sleep(3000);
            Location G = new Location(940, 430);
            s.click(G);
            TimeUnit.MILLISECONDS.sleep(400);
            Location H = new Location(940, 290);
            s.click(H);
            TimeUnit.MILLISECONDS.sleep(400);
            s.type(Key.F1);

            TimeUnit.MILLISECONDS.sleep(2000);

            s.type(Key.F6);
            s.click(nerbeFight);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.F6);
            s.click(nerbeFight);
            TimeUnit.MILLISECONDS.sleep(300);
            while (s.exists(nerbeFight) != null) {
                s.type(Key.F6);
                s.click(nerbeFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F6);
                s.click(nerbeFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F1);
                TimeUnit.SECONDS.sleep(10);
            }
            s.type(Key.ESC);
        }

        //Salle 3
        //find floribonde
        boolean floriFound = false;

        while(!floriFound) {
            if (s.exists(floriUpRight) != null) {
                floriFound = true;
                s.rightClick(floriUpRight);
            } else if (s.exists(floriUpLeft) != null) {
                floriFound = true;
                s.rightClick(floriUpLeft);
            } else if (s.exists(floriDownLeft) != null) {
                floriFound = true;
                s.rightClick(floriDownLeft);
            } else if (s.exists(floriDownRight) != null) {
                floriFound = true;
                s.rightClick(floriDownRight);
            }
        }
        if(floriFound) {
            TimeUnit.MILLISECONDS.sleep(3000);
            Location I = new Location(970, 310);
            s.click(I);
            TimeUnit.MILLISECONDS.sleep(400);
            Location J = new Location(840, 130);
            s.click(J);
            TimeUnit.MILLISECONDS.sleep(400);
            s.type(Key.F1);

            TimeUnit.MILLISECONDS.sleep(2000);

            s.type(Key.F6);
            s.click(floriFight);
            TimeUnit.MILLISECONDS.sleep(300);
            s.type(Key.F6);
            s.click(floriFight);
            TimeUnit.MILLISECONDS.sleep(300);
            while (s.exists(floriFight) != null) {
                s.type(Key.F6);
                s.click(floriFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F6);
                s.click(floriFight);
                TimeUnit.MILLISECONDS.sleep(700);
                s.type(Key.F1);
                TimeUnit.SECONDS.sleep(10);
            }
            s.type(Key.ESC);
        }
    }
}
