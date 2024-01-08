package hw_14_12_2023.task2;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int value = queue.take();
                System.out.println("Consumer: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
