package hw_17_10_2023.dublicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//Создание Дженерик
        List<Integer> numbers = new ArrayList<>();
//Добавление чисел
        numbers.add(2);
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
//Подключение метода
        removeDublicateNumbers(numbers);
//Вывод в консоль
        System.out.println(numbers);


    }
//Создание метода
    public static void removeDublicateNumbers(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

    }
}
