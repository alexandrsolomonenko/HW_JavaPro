package hw_19_12_2023.task2;
//Создайте классы Клиент, Товар, Задание. Создайте единый механизм для генерации уникальных идентификаторов
// для каждого из классов (у Клиентов свои идентификаторы, у Товаров – свои, у Заданий - свои).
// Используйте обёртку ThreadLocal для хранения счетчика уникальных идентификаторов в каждом потоке.
// Реализуйте класс UniqueIdGenerator, который предоставляет метод generateUniqueId(),
// возвращающий уникальный идентификатор.
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alex");
        Client client2 = new Client("Yuri");

        Product product1 = new Product("Phone");
        Product product2 = new Product("Tablet");

        Task task1 = new Task("Apple iPhone 15 Pro Max 256GB Smartphone (17 cm/6,7 Zoll, 256 GB Speicherplatz, 48 MP Kamera)");
        Task task2 = new Task("Apple iPad 10.2 Wi-Fi (2021) 9 Generation Tablet (10,2, 64 GB, iPadOS)");

        System.out.println("Client ID: "+client1.getId()+"\n"+" Nane: "+client1.getName());
        System.out.println("Client ID: "+client2.getId()+"\n"+" Nane: "+client2.getName());
        System.out.println("Article ID: "+product1.getId()+"\n"+" Nane: "+product1.getName());
        System.out.println("Article ID: "+product2.getId()+"\n"+" Nane: "+product2.getName());
        System.out.println("Task ID: "+task1.getId()+"\n"+" Description: "+task1.getDescription());
        System.out.println("Task ID: "+task2.getId()+"\n"+" Description: "+task2.getDescription());
    }
}
