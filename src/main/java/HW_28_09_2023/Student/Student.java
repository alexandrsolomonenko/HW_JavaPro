package HW_28_09_2023.Student;

public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int groupNumber;

    public Student() {
    }

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0) {
            throw new RuntimeException("Номер группы должен быть положительным");
        }
        this.groupNumber = groupNumber;
    }

    public void goToNextGroup() {
        groupNumber++;
    }

    public Student(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        this.groupNumber = student.groupNumber;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning student");
        }
    }
}
