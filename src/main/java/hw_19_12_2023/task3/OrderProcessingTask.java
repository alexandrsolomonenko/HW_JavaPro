package hw_19_12_2023.task3;

public class OrderProcessingTask implements Runnable{
    private Order order;

    public OrderProcessingTask(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Обработка заказа " + order.getOrderId());

        // Логика обработки заказа
        // ...

        order.markAsReady();
    }
}