package hw_31_10_2023_Parser;

import java.security.InvalidParameterException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CommandLineParser parser = new CommandLineParser();

        try {
            parser.parse(args);

            String sortingMode = parser.getSortingMode();
            String dataType = parser.getDataType();
            String outputFile = parser.getOutputFile();
            List<String> inputFiles = parser.getInputFiles();

            System.out.println("Режим сортировки: " + sortingMode);
            System.out.println("Тип данных: " + dataType);
            System.out.println("Выходной файл: " + outputFile);
            System.out.println("Входные файлы: " + inputFiles);
        } catch (InvalidParameterException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
