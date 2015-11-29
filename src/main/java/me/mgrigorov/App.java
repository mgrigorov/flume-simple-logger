package me.mgrigorov;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    private static final int MIN_VALUE = -100000;
    private static final int MAX_VALUE = 100000;
    private static final int DELAY = 300;
    private static final int PERIOD = 500;
    private static final Logger LOGGER = LogManager.getRootLogger();

    public static void main(String[] args) throws IOException {
        final Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LOGGER.info(new Random().nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE); // Random int from -100000 to 100000
            }
        }, DELAY, PERIOD);

        System.out.println("press enter to exit...");
        System.in.read();
        System.exit(0);
    }
}
