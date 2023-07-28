import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BotsElevage extends Main {

    private volatile boolean keepRunning = true;

    public synchronized void stopRunning() {
        keepRunning = false;
    }

    public void nourirCorbac() throws InterruptedException, FindFailed, IOException {

        Keyboard kb = new DesktopKeyboard();
        Screen s = new Screen();

        Location epees = new Location(790, 160);
        Location ressources = new Location(840, 160);
        Location premierSlot = new Location(760, 260);
        Location premierPerso = new Location(150, 440);
        Location Boune = new Location(150, 400);
        Location slotFami = new Location(680, 260);
        int offsetX = 40;
        int offsetY = 40;
        int offsetXPerso = 160;

        TimeUnit.SECONDS.sleep(5);

        Location slot = new Location(premierSlot);
        Location slotPerso = new Location(premierPerso);
        for(int z = 0; z<3; z++) {
            s.doubleClick(Boune);
            TimeUnit.MILLISECONDS.sleep(5000);
            slotPerso = new Location(150 + (offsetXPerso * z), 440);
            s.doubleClick(slotPerso);
            TimeUnit.MILLISECONDS.sleep(5000);
            kb.type("i");
            TimeUnit.MILLISECONDS.sleep(2000);
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 4; k++) {
                    s.click(epees);
                    TimeUnit.MILLISECONDS.sleep(700);
                    slot = new Location(760 + (offsetX * k), 260 + (offsetY * j));
                    s.doubleClick(slot);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.click(ressources);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.dragDrop(premierSlot, slotFami);
                    TimeUnit.MILLISECONDS.sleep(700);
                    s.doubleClick(slotFami);

                    TimeUnit.MILLISECONDS.sleep(2000);
                }
            }
            TimeUnit.MILLISECONDS.sleep(2000);
            kb.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(2000);
            kb.type(Key.ESC);
            TimeUnit.MILLISECONDS.sleep(5000);
            Location changerPerso = new Location(470, 280);
            s.click(changerPerso);
            TimeUnit.MILLISECONDS.sleep(2000);
            kb.type(Key.ENTER);
            TimeUnit.MILLISECONDS.sleep(3000);
        }
    }
}
