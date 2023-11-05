package hw_26_10_2023.swap;

public class ArraySwap {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index value");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        String[] fruits = {"apple", "banana", "cherry", "date"};
        swap(fruits, 0, 2);

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
