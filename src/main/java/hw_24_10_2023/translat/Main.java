package hw_24_10_2023.translat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите слово на английском (для остановки введите 'stopTranslate'): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("stopTranslate")) {
                break;
            }

            if (dictionary.containsKey(word)) {
                System.out.println("Перевод: " + dictionary.get(word));
            } else {
                System.out.print("Перевод не найден. Введите перевод слова '" + word + "': ");
                String translation = scanner.nextLine();
                dictionary.put(word, translation);
                System.out.println("Слово и его перевод успешно добавлены в словарь.");
            }
        }

        System.out.println("Работа переводчика завершена.");
    }
}
