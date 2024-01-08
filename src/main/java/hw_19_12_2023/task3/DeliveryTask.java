package hw_19_12_2023.task3;

public class DeliveryTask implements Runnable{
    private Order order;

    public DeliveryTask(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Доставка заказа " + order.getOrderId());

        // Логика доставки товара
        // ...
    }
}
