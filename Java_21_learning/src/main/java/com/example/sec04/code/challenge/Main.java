package com.example.sec04.code.challenge;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        System.out.println(getLoggerType(logger));

        System.out.println("-----------");
        Logger logger1 = new FileLogger();
        System.out.println(getLoggerType(logger1));
    }

    public static String getLoggerType(Logger logger){
        switch (logger){
            case FileLogger fileLogger -> {
                return fileLogger.getLoggerType();
            }
            case ConsoleLogger consoleLogger -> {
                return consoleLogger.getLoggerType();
            }
            default -> {
                return "";
            }
        }
    }
}
