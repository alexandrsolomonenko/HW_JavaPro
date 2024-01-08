package hw_19_12_2023.task2;

public class Product {
    private int id;
    private String name;
    public Product(String name){
        this.id = UniqueIdGenerator.generateUniqueId();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
