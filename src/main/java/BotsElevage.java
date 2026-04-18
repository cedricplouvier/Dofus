import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BotsElevage extends Main {

    static General general = new General();

    private volatile boolean keepRunning = true;

    public synchronized void stopRunning() {
        keepRunning = false;
    }

    public void nourirCorbac(ArrayList<Pattern> characters, int amount) throws InterruptedException, FindFailed, IOException {

        Screen s = new Screen();

        Location epees = new Location(1100, 150);
        Location ressources = new Location(1160, 150);
        Location slotFami = new Location(1000, 250);

        TimeUnit.SECONDS.sleep(5);

        for(Pattern character: characters) {
            TimeUnit.MILLISECONDS.sleep(2000);
            s.doubleClick(serveurBoune);
            TimeUnit.MILLISECONDS.sleep(5000);
            s.doubleClick(character);
            TimeUnit.MILLISECONDS.sleep(5000);
            general.zaapAstrubToMaisonCoffre1();
            s.click(new Location(420,200));
            TimeUnit.MILLISECONDS.sleep(700);
            Match regionOsChafer = s.find(osChafer);
            s.dragDrop(regionOsChafer, new Location(1100, 400));
            TimeUnit.SECONDS.sleep(1);
            general.numberToKey(amount);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(close);
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(1000);

            for (int j = 0; j < amount; j++) {
                s.click(epees);
                TimeUnit.MILLISECONDS.sleep(500);
                s.dragDrop(new Location(1240,270), new Location(1240, 660));
                TimeUnit.MILLISECONDS.sleep(500);
                s.doubleClick(new Location(1200, 570));
                TimeUnit.MILLISECONDS.sleep(500);
                s.click(ressources);
                TimeUnit.MILLISECONDS.sleep(700);
                s.dragDrop(osChafer, slotFami);
                TimeUnit.MILLISECONDS.sleep(700);
                s.doubleClick(slotFami);
                TimeUnit.MILLISECONDS.sleep(700);
            }
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(2000);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location changerPerso = new Location(800, 270);
            s.click(changerPerso);
            TimeUnit.MILLISECONDS.sleep(2000);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(3000);
        }
    }

    public void nourirChacha(ArrayList<Pattern> characters, int amount) throws InterruptedException, FindFailed, IOException {

        Screen s = new Screen();

        Location epees = new Location(1100, 150);
        Location ressources = new Location(1160, 150);
        Location slotFami = new Location(1000, 250);

        TimeUnit.SECONDS.sleep(5);

        for(Pattern character: characters) {
            TimeUnit.MILLISECONDS.sleep(2000);
            s.doubleClick(serveurBoune);
            TimeUnit.MILLISECONDS.sleep(5000);
            s.doubleClick(character);
            TimeUnit.MILLISECONDS.sleep(10000);
            general.zaapAstrubToMaisonCoffre1();
            s.click(new Location(420,200));
            TimeUnit.MILLISECONDS.sleep(700);
            Match regionGeleesBleu = s.find(geleesBleu);
            s.dragDrop(regionGeleesBleu, new Location(1100, 400));
            TimeUnit.SECONDS.sleep(1);
            general.numberToKey(amount);
            TimeUnit.SECONDS.sleep(1);
            s.type(Key.ENTER);
            TimeUnit.SECONDS.sleep(1);
            s.click(close);
            TimeUnit.MILLISECONDS.sleep(1000);
            s.click(new Location(1030, 630));
            TimeUnit.MILLISECONDS.sleep(1000);

            for (int j = 0; j < amount; j++) {
                s.click(epees);
                TimeUnit.MILLISECONDS.sleep(500);
                s.dragDrop(new Location(1240,270), new Location(1240, 660));
                TimeUnit.MILLISECONDS.sleep(500);
                s.doubleClick(new Location(1200, 570));
                TimeUnit.MILLISECONDS.sleep(500);
                s.click(ressources);
                TimeUnit.MILLISECONDS.sleep(700);
                s.dragDrop(geleesBleu, slotFami);
                TimeUnit.MILLISECONDS.sleep(700);
                s.doubleClick(slotFami);
                TimeUnit.MILLISECONDS.sleep(700);
            }
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(2000);
            s.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(2000);
            Location changerPerso = new Location(800, 270);
            s.click(changerPerso);
            TimeUnit.MILLISECONDS.sleep(2000);
            s.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(3000);
        }
    }
}
