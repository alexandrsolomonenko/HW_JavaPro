package hw_23_11_2023.convertToJson;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private boolean isMarried;
    private List<String> favoriteFruits;

    public Person(String name, int age, boolean isMarried, List<String> favoriteFruits) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.favoriteFruits = favoriteFruits;
    }

}
