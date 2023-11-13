package hw_24_10_2023.nightClub;

public class Visitor {

    private int age;

    public Visitor(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public static Visitor createVisitor() {
        int age = (int) (Math.random() * 30); // Генерация случайного возраста от 0 до 29
        return new Visitor(age);
    }
}
