package hw_19_10_2023.descendingOrder;

import java.util.Arrays;
import java.util.Iterator;

public class DescendingOrder implements Iterator<Integer> {
    private Integer[] array;
    private int nindex;

    public DescendingOrder(Integer[] array) {
        this.array = Arrays.copyOf(array, array.length);
        this.nindex = array.length - 1;
    }
    @Override
    public boolean hasNext() {
        return nindex >= 0;
    }

    @Override
    public Integer next() {
        return array[nindex--];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Операция удаления не поддерживается.");
    }
}
