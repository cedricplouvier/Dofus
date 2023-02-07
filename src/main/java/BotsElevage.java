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

        /*Thread t = new Thread(new Runnable() {
            public void run() {
                try (Scanner scanner = new Scanner(System.in)) {
                    keepRunning = true;
                    while(keepRunning) {
                        String userInput = scanner.next();
                        System.out.println(userInput);
                        if(userInput.equals(Key.ESC)) {
                            System.out.println("TEST");
                            stopRunning();
                            keepRunning = false;
                        }
                    }
                }
            }
        });*/

            Location epees = new Location(780, 190);
            Location ressources = new Location(840, 190);
            Location premierSlot = new Location(760, 290);
            Location slotFami = new Location(680, 290);
            int offsetX = 40;
            int offsetY = 40;

            TimeUnit.SECONDS.sleep(5);

            kb.type("i");
            TimeUnit.MILLISECONDS.sleep(2000);

            Location slot = new Location(premierSlot);
            //for (int i = 0; i < 64; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 4; k++) {
                        s.click(epees);
                        TimeUnit.MILLISECONDS.sleep(700);
                        slot = new Location(760 + (offsetX * k), 290 + (offsetY * j));
                        s.doubleClick(slot);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.click(ressources);
                        TimeUnit.MILLISECONDS.sleep(700);
                        s.dragDrop(premierSlot, slotFami);
                        TimeUnit.MILLISECONDS.sleep(700);

                        TimeUnit.MILLISECONDS.sleep(2000);
                    }
                }
            //}
    }
}
