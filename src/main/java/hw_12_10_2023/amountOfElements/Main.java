package hw_12_10_2023.amountOfElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = randomNumbList();

        System.out.println("Список чисел:");
        printNumbList(numbers);

        NegativeNumb(numbers);

        System.out.println("Список чисел после удаления отрицательных чисел:");
        printNumbList(numbers);
    }

    public static List<Integer> randomNumbList() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        int count = random.nextInt(10) + 1;  // Произвольное количество элементов (от 1 до 10)

        for (int i = 0; i < count; i++) {
            int number = random.nextInt(201) - 100;  // Случайное число от -100 до 100 (включительно)
            numbers.add(number);
        }

        return numbers;
    }

    public static void printNumbList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void NegativeNumb(List<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
    }
}
