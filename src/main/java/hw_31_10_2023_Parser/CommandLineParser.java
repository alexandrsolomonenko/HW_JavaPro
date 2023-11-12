package hw_31_10_2023_Parser;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class CommandLineParser{
    private final String sortingMethode = "ascending";
    private String dataType;
    private String outputFile;
    private final List<String> inputFiles = new ArrayList<>();

    public void parse(String[] args) throws InvalidParameterException {
        if (args.length < 3) {
            throw new InvalidParameterException("Неправильный формат команды");
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.equals("-a")) {
            } else if (arg.equals("-d")) {
            }

            if (arg.equals("-s")) {
                if (i + 1 < args.length) {
                    dataType = args[i + 1];
                } else {
                    throw new InvalidParameterException("Неправильный формат команды");
                }
            } else if (arg.equals("-i")) {
                if (i + 1 < args.length) {
                    dataType = args[i + 1];
                } else {
                    throw new InvalidParameterException("Неправильный формат команды");
                }
            }

            if (!arg.startsWith("-")) {
                outputFile = arg;
            }

            if (i > 0 && !arg.startsWith("-")) {
                inputFiles.add(arg);
            }
        }

        if (dataType == null || outputFile == null || inputFiles.isEmpty()) {
            throw new InvalidParameterException("Неправильный формат команды");
        }
    }

    public String getSortingMode() {
        return sortingMethode;
    }

    public String getDataType() {
        return dataType;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public List<String> getInputFiles() {
        return inputFiles;
    }
}
