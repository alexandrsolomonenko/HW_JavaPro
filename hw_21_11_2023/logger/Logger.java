package hw_21_11_2023.logger;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Logger {
    private PrintWriter writer;
    private String logLevel;
    private String logOutput;

    public Logger(String logFile) {
        loadConfig();

        if (logOutput.equals("file")) {
            try {
                writer = new PrintWriter(new FileWriter(logFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void debug(String message) {
        log("DEBUG", message);
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warning(String message) {
        log("WARNING", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }

    private void loadConfig() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("config.properties"));
            logLevel = prop.getProperty("log.level");
            logOutput = prop.getProperty("log.output");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void log(String level, String message) {
        // Check log level
        if (!logLevel.equalsIgnoreCase("debug") && level.equalsIgnoreCase("debug")) {
            return;
        }
        if (!logLevel.equalsIgnoreCase("info") && level.equalsIgnoreCase("info")) {
            return;
        }
        if (!logLevel.equalsIgnoreCase("warning") && level.equalsIgnoreCase("warning")) {
            return;
        }

        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logEntry = "[" + timestamp + "] " + level + ": " + message;

        System.out.println(logEntry);

        if (writer != null) {
            writer.println(logEntry);
            writer.flush(); // Ensure log is written immediately
        }
    }

}
