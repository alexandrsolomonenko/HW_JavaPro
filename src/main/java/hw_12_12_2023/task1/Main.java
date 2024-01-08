package hw_12_12_2023.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

//Дан список чисел из большого количества случайных чисел.
// Используя синхронизированные коллекции, уберите из списка отрицательные значения.
// Замерьте время выполнения метода в однопоточном режиме и в многопоточном.

public class Main {
    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = new ArrayList<>();
        // Добавляем случайные числа
        for (int i = 0; i < 1000000; i++) {
            numbers.add((int) (Math.random() * 100) - 50);
        }

        long startTime = System.currentTimeMillis();

        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>(numbers));


        synchronized (synchronizedList) {
            synchronizedList.removeIf(n -> n < 0);

        }

        long endTime = System.currentTimeMillis();

        System.out.println("Однопоточное время выполнения: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(4);

        synchronizedList = Collections.synchronizedList(new ArrayList<>(numbers));

        int chunkSize = synchronizedList.size() / 4;
        for (int i = 0; i < 4; i++) {
            int start = i * chunkSize;
            int end = i == 3 ? synchronizedList.size() : (i + 1) * chunkSize;
            List<Integer> sublist = synchronizedList.subList(start, end);
            executor.submit(() -> {
                sublist.removeIf(n -> n < 0);
            });
        }

        executor.shutdown();

        while (!executor.isTerminated()) {

        }
        endTime = System.currentTimeMillis();

        System.out.println("Многопоточное время выполнения: " + (endTime - startTime) + " мс");
    }
}