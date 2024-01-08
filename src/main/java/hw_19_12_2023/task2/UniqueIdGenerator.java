package hw_19_12_2023.task2;

public class UniqueIdGenerator {
    private static final ThreadLocal<Integer> counter = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static int generateUniqueId() {
        int id = counter.get();
        counter.set(id + 1);
        return id;
    }
}
