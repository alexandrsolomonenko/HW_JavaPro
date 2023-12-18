package hw_07_12_2023.multithreading;

public class Main {
    public static void main(String[] args) {
        int producerCount = 3;
        int consumerCount = 2;
        int producerTime = 2000; // в миллисекундах
        int consumerTime = 3000; // в миллисекундах
        int storageSize = 5;

        Warehouse warehouse = new Warehouse(storageSize);

        for (int i = 0; i < producerCount; i++) {
            Producer producer = new Producer(warehouse, i+1, producerTime);
            Thread producerThread = new Thread(producer);
            producerThread.start();
        }

        for (int i = 0; i < consumerCount; i++) {
            Consumer consumer = new Consumer(warehouse, i+1, consumerTime);
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();
        }
    }
}
