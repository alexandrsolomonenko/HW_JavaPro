package hw_07_12_2023.multithreading;

class Consumer implements Runnable {
    private Warehouse warehouse;
    private int consumerId;
    private int consumerTime;

    public Consumer(Warehouse warehouse, int consumerId, int consumerTime) {
        this.warehouse = warehouse;
        this.consumerId = consumerId;
        this.consumerTime = consumerTime;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(consumerTime);
                warehouse.consume(consumerId);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
