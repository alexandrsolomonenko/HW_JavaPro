package hw_19_12_2023.task3;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Создаем ThreadPoolExecutor для обработки заказов
        ThreadPoolExecutor orderExecutor = new ThreadPoolExecutor(
                5,
                10,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>()
        );

        ScheduledThreadPoolExecutor deliveryExecutor = new ScheduledThreadPoolExecutor(2);

        for (int i = 0; i < 20; i++) {
            Order order = new Order("Order" + i);
            OrderProcessingTask orderTask = new OrderProcessingTask(order);
            orderExecutor.submit(orderTask);
        }

        deliveryExecutor.scheduleAtFixedRate(
                () -> {
                    // Получаем список готовых заказов
                    // ...
                    Iterable<? extends Order> readyOrders = null;
                    for (Order order : readyOrders) {
                        if (order.isReady()) {
                            DeliveryTask deliveryTask = new DeliveryTask(order);
                            deliveryExecutor.submit(deliveryTask);
                        }
                    }
                },
                0,
                1,
                TimeUnit.SECONDS
        );

        for (int i = 0; i < 20; i++) {
            Order order = new Order("Order" + i);
            OrderLogicTask logicTask = new OrderLogicTask(order);
            orderExecutor.submit(logicTask);
        }

        orderExecutor.shutdown();
        deliveryExecutor.shutdown();
    }
}
