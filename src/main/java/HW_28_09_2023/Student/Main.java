package HW_28_09_2023.Student;


public class Main {
    public static void main(String[] args) {

        Student student = new Student("John", "Doe", 1);

        student.goToNextGroup();

        Student clonedStudent = student.clone();

        System.out.println(student == clonedStudent);  // false

        student.setFirstName("Jane");

        System.out.println(student.getFirstName());  // Jane
        System.out.println(clonedStudent.getFirstName());  // John
    }
}
