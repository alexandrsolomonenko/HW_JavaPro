package hw_19_12_2023.task3;

public class OrderLogicTask implements Runnable {
    private Order order;

    public OrderLogicTask(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Логическая обработка заказа " + order.getOrderId());

        // Логика работы с заказом после обработки и доставки, например, отправка уведомления клиенту
        // ...
    }
}
