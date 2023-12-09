package hw_28_11_2023.createMapArticles;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
