package hw_12_12_2023.task2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

//Разработайте программу, использующую ConcurrentMap, для обеспечения безопасного обновления значения по условию.
// Например, уменьшайте значение ключа "stock" на 1 только если текущее значение больше 0.
public class Main {
    public static void main(String[] args) {

        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("stock", 5);


        while (true) {

            int currentValue = map.get("stock");


            if (currentValue > 0) {

                int newValue = currentValue - 1;
                if (map.replace("stock", currentValue, newValue))
                    System.out.println("Значение успешно обновлено. Новое значение: " + newValue);
                else
                    System.out.println("Не удалось обновить значение. Попробуйте еще раз.");
            } else {
                System.out.println("Значение ключа \"stock\" уже равно 0. Обновление не требуется.");
                break;
            }
        }
    }
}
