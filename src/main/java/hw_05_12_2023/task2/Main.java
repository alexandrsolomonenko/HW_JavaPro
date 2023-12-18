package hw_05_12_2023.task2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        scanner.close();

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        int chunkSize = N / numThreads;
        int start = 1;
        int end = chunkSize;

        Task[] tasks = new Task[numThreads];
        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = N;
            }
            Task task = new Task(start, end);
            tasks[i] = task;
            executorService.execute(task);
            start = end + 1;
            end += chunkSize;
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }

        long totalResult = 0;
        for (Task task : tasks) {
            totalResult += task.getResult();
        }
        System.out.println("Результат: " + totalResult);
    }
}
