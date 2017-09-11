package game;

import javafx.application.Application;
import javafx.application.Platform;

public class Start {
    public static void main(String[] args) {

        /*
         * On some systems (Dual Intel/Nvidia graphics + Linux) it happens to JavaFX
         * not to keep FPS at 60 value, which results in extremely high refresh rate,
         * and high resources consumption. This workaround seems to help.
         * See: https://stackoverflow.com/a/45827990/4040598
         */
        System.setProperty("quantum.multithreaded", "false");
        System.out.println("Setting quantum.multithreaded false, starting class Main");
        Application.launch(Main.class, args);
        Platform.exit();
    }
}