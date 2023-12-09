package hw_21_11_2023.logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("D:\\log.txt");

        logger.info("Start logging parameters and environment variables");

        // Logging parameters
        for (String arg : args) {
            logger.debug("Param: " + arg);
        }

        // Logging environment variables
        for (String env : System.getenv().keySet()) {
            logger.debug("Env: " + env + "=" + System.getenv(env));
        }

        logger.info("Finished logging parameters and environment variables");

        logger.close();
    }

}
    


