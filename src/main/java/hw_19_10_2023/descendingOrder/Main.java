package hw_19_10_2023.descendingOrder;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DescendingOrder iterator = new DescendingOrder(numbers);

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
