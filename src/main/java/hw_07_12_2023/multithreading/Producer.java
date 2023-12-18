package hw_07_12_2023.multithreading;

class Producer implements Runnable {
    private Warehouse warehouse;
    private int producerId;
    private int producerTime;

    public Producer(Warehouse warehouse, int producerId, int producerTime) {
        this.warehouse = warehouse;
        this.producerId = producerId;
        this.producerTime = producerTime;
    }

    public void run() {
        try {
            for (int i = 0; ; i++) {
                Thread.sleep(producerTime);
                Resource resource = new Resource(i);
                warehouse.produce(resource, producerId);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
