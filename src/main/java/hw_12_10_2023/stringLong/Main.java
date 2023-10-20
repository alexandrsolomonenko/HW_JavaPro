package hw_12_10_2023.stringLong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strings = readStrings();

        System.out.println("Введенные строки:");
        printStrings(strings);

        String longestString = findLongString(strings);
        String shortestString = findShortString(strings);

        System.out.println("Самая длинная строка: " + longestString);
        System.out.println("Самая короткая строка: " + shortestString);
    }

    public static List<String> readStrings() {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки (введите 'quit' для завершения ввода):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            strings.add(input);
        }

        return strings;
    }

    public static void printStrings(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String findLongString(List<String> strings) {
        String longString = "";

        for (String string : strings) {
            if (string.length() > longString.length()) {
                longString = string;
            }
        }

        return longString;
    }

    public static String findShortString(List<String> strings) {
        String shortString = strings.get(0);

        for (String string : strings) {
            if (string.length() < shortString.length()) {
                shortString = string;
            }
        }

        return shortString;
    }
}
