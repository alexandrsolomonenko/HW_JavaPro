package hw_28_11_2023.createNumberList;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4, -5);

        numbers.forEach(number -> System.out.println(Math.abs(number)));
    }
}
