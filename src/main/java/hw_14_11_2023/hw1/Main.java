package hw_14_11_2023.hw1;

import hw_14_11_2023.hw1.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .crust("Thin crust")
                .sauce("Tomato sauce")
                .cheese("Mozzarella")
                .toppings(new String[]{"Pepperoni", "Mushrooms", "Onions"})
                .isDelivery(true)
                .build();

        System.out.println(pizza);
    }
}

