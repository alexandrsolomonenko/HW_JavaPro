package hw_14_11_2023.hw1.pizza;


import java.util.Arrays;

public class Pizza {
    private final String crust;
    private final String sauce;
    private final String cheese;
    private final String[] toppings;
    private final boolean isDelivery;

    private Pizza(PizzaBuilder builder) {
        this.crust = builder.crust;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
        this.isDelivery = builder.isDelivery;
    }

    // Геттеры для полей

    @Override
    public String toString() {
        return "Pizza{" +
                "crust='" + crust + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + Arrays.toString(toppings) +
                ", isDelivery=" + isDelivery +
                '}';
    }

    public static class PizzaBuilder {
        private String crust;
        private String sauce;
        private String cheese;
        private String[] toppings;
        private boolean isDelivery;

        public PizzaBuilder() {
        }

        public PizzaBuilder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder toppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder isDelivery(boolean isDelivery) {
            this.isDelivery = isDelivery;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    }

