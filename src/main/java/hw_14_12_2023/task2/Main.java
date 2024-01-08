package hw_14_12_2023.task2;
//Создайте реализацию программы Поставщик – Склад - Потребитель на основе блокирующей очереди.
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}



