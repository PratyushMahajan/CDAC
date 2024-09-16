package com.assignment5;

class Logger {

    private static Logger instance = null;
    private String logMessages;

    private Logger() {
        logMessages = "";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages += message + "\n";
    }

    public String getLog() {
        return logMessages;
    }

    public void clearLog() {
        logMessages = "";
        System.out.println("No logs");
    }
}

public class Program {

    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();
        
        logger.log("Starting the Application...");
        logger.log("Application running.");
        logger.log("Application finished.");
        
        System.out.println("Current Logs:\n");
        System.out.println(logger.getLog());
        
        System.out.println("Logs after clearing:");
        logger.clearLog();
        System.out.println(logger.getLog());
    }
}
