package me.mgrigorov;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {
        logger.info("HELLO FLUME!");

        System.out.println("DONE!");
    }
}
