package hw_26_10_2023.findMax;

import java.util.List;

public class FindMax {
    public static <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {
        if (begin < 0 || end > list.size() || begin >= end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }

        T max = list.get(begin);

        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9, 3);
        int maxNumber = findMax(numbers, 0, numbers.size());
        System.out.println("Max number: " + maxNumber);

        List<String> names = List.of("John", "Alice", "Mike", "Sara");
        String maxName = findMax(names, 0, names.size());
        System.out.println("Max name: " + maxName);
    }
}
