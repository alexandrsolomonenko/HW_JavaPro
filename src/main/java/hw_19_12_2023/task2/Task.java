package hw_19_12_2023.task2;

public class Task {
    private int id;
    private String description;

    public Task (String description){
        this.id = UniqueIdGenerator.generateUniqueId();
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
