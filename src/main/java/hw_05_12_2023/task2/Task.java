package hw_05_12_2023.task2;

import lombok.Getter;

class Task implements Runnable {
    private int start;
    private int end;
    @Getter
    private long result;

    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        result = calculateFunction(start, end);
    }

    private long calculateFunction(int start, int end) {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            // Вычисляем сложную функцию для каждого числа
            sum += (long) i * i; // Пример: возводим число в квадрат и складываем сумму
        }
        return sum;
    }
}
