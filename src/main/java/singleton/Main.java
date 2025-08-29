package singleton;

import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("new_log.txt");
        logger.write("Testing Testing");
        logger.close();

        Logger logger2 = Logger.getInstance();
        logger2.write("Hello");
        logger2.close();

        Logger logger3 = Logger.getInstance();
        logger.setFileName("logger3.txt");
        logger3.write("Logger 3 here");

        Logger logger4 = Logger.getInstance();
        logger4.write("Logger 4 here");
        logger3.close();
        logger4.close();

        Logger logger5 = Logger.getInstance();
        logger.setFileName("default.txt");
        logger5.write("Back to default");
        logger5.close();
    }
}
