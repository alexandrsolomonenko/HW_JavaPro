package hw_28_11_2023.createMapArticles;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Item, Integer> inventory = new HashMap<>();
        inventory.put(new Item("Apple", 1.99), 5);
        inventory.put(new Item("Banana", 0.99), 2);
        inventory.put(new Item("Orange", 1.49), 1);

        inventory.forEach((item, quantity) -> {
            if (quantity < 3) {
                System.out.println(item.getName() + ": " + quantity);
            }
        });
    }
}
