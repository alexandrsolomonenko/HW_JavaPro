package hw_09_11_2023;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomOddNumber = RandomUtils.getRandomOddNumber(new Random());
        System.out.println(randomOddNumber);
    }
    public static class RandomUtils {
        public static int getRandomOddNumber(Random random) {
            int number = random.nextInt(101) * 2 - 100; // Генерируем четное число в диапазоне от -100 до 100
            return number + 1; // Добавляем 1, чтобы получить нечетное число
        }
}
}