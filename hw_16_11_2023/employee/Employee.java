package hw_16_11_2023.employee;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Employee {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String position;
    private transient double salary;

    public Employee(String firstName, String lastName, Date dateOfBirth, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
    }
}
