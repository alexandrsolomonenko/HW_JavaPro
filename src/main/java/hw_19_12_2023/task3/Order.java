package hw_19_12_2023.task3;

public class Order {
    private String orderId;
    private boolean isReady;

    public Order(String orderId) {
        this.orderId = orderId;
        this.isReady = false;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isReady() {
        return isReady;
    }

    public void markAsReady() {
        isReady = true;
    }
}
