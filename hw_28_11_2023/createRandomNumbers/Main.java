package hw_28_11_2023.createRandomNumbers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator generator = (min, max) -> new Random().nextInt((max - min) + 1) + min;

        int randomNumber = generator.generate(10, 20);
        System.out.println("Случайное число в диапазоне от 10 до 20: " + randomNumber);
    }
    interface RandomNumberGenerator {
        int generate(int min, int max);
    }
}
