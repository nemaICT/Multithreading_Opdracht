package main;
import java.util.logging.Level;
import java.util.logging.Logger;

import runApp.ThreadExecutor;
import runApp.ThreadExecuterble;

public class Main {
    public static void main(String[] args) {

        // Create a Logger
       Logger logger
                = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO, "Executed log");

        ThreadExecuterble threadExecuterble = new ThreadExecutor();
        threadExecuterble.runApp();

    }
}
