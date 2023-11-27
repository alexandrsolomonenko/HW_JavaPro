package hw_09_11_2023;

import java.util.Random;

class MainTest {
    public static void main(String[] args) {
        Random random = new Random() {
            @Override
            public int nextInt(int bound) {
                // Возвращаем предсказуемую последовательность чисел
                return bound == 101 ? -99 : bound - 100;
            }
        };

        int expected1 = -99;
        int expected2 = -95;
        int expected3 = 97;

        int result1 = Main.RandomUtils.getRandomOddNumber(random);
        int result2 = Main.RandomUtils.getRandomOddNumber(random);
        int result3 = Main.RandomUtils.getRandomOddNumber(random);

        System.out.println("Expected: " + expected1 + ", Result: " + result1);
        System.out.println("Expected: " + expected2 + ", Result: " + result2);
        System.out.println("Expected: " + expected3 + ", Result: " + result3);
    }

}