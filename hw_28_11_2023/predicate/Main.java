package hw_28_11_2023.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");

        Predicate<String> startsWithA = s -> s.startsWith("A");

        strings.removeIf(startsWithA);

        strings.forEach(System.out::println);
    }
}
