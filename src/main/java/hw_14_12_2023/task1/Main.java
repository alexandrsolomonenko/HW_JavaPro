package hw_14_12_2023.task1;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

//Создайте 10 потоков, каждый из которых «делает вычисления»
// (генерирует случайное число, ждёт сгенерированное число миллисекунд,
// добавляет сгенерированное число в общую для всех потоков переменную).
// Используя AtomicBoolean, создайте флаг, указывающий на возможность завершения приложения.
// Когда потоки накопят в общей переменной число 1000000 флаг становится true.
public class Main {
    private static final int THREAD_COUNT = 10;
    private static final int TARGET_NUMBER = 1000000;
    private static AtomicInteger sharedVariable = new AtomicInteger(0);
    private static AtomicBoolean exitFlag = new AtomicBoolean(false);

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new CalculationRunnable());
            threads[i].start();
        }

        try {
            for (int i = 0; i < THREAD_COUNT; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        exitFlag.set(true);
        System.out.println("Главный поток завершил работу");
    }

    private static class CalculationRunnable implements Runnable {
        private Random random = new Random();

        @Override
        public void run() {
            while (!exitFlag.get()) {
                int randomNumber = random.nextInt(100); // генерируем случайное число от 0 до 99
                try {
                    Thread.sleep(randomNumber); // ждем случайное число миллисекунд
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sharedVariable.addAndGet(randomNumber); // добавляем сгенерированное число в общую переменную

                if (sharedVariable.get() >= TARGET_NUMBER) {
                    exitFlag.set(true);
                    System.out.println("Поток " + Thread.currentThread().getId() + " достиг указанного числа");
                }
            }
        }
    }
}

