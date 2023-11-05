package hw_26_10_2023.student;

class Student<T extends Subject> {
    private final T subject;

    public Student(T subject) {
        this.subject = subject;
    }

    public void study() {
        System.out.println("Я студент из " + subject.getClass().getSimpleName());
    }
}
