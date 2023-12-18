package hw_07_12_2023.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int storageSize;
    private List<Resource> resources;

    public Warehouse(int storageSize) {
        this.storageSize = storageSize;
        this.resources = new ArrayList<>();
    }

    public synchronized void produce(Resource resource, int producerId) throws InterruptedException {
        while (resources.size() >= storageSize) {
            System.out.println("Время: " + System.currentTimeMillis() + ", Производитель " + producerId +
                    " ожидает, так как склад полный.");
            wait();
        }

        resources.add(resource);
        System.out.println("Время: " + System.currentTimeMillis() + ", Производитель " + producerId +
                ", Ресурс " + resource.getId() + " произведен.");
        System.out.println("Количество ресурсов на складе после производства: " + resources.size());
        notifyAll();
    }

    public synchronized Resource consume(int consumerId) throws InterruptedException {
        while (resources.isEmpty()) {
            System.out.println("Время: " + System.currentTimeMillis() + ", Потребитель " + consumerId +
                    " ожидает, так как на складе нет ресурсов.");
            wait();
        }

        Resource consumedResource = resources.remove(0);
        System.out.println("Время: " + System.currentTimeMillis() + ", Потребитель " + consumerId +
                ", Ресурс " + consumedResource.getId() + " потреблен.");
        System.out.println("Количество ресурсов на складе после потребления: " + resources.size());
        notifyAll();

        return consumedResource;
    }
}
