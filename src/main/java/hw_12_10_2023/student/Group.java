package hw_12_10_2023.student;

import java.util.ArrayList;
import java.util.List;


public class Group {
    private List<String> students;

    public Group(List<String> students) {
        this.students = students;
    }

    public List<String> findStudents(String prefix) {
        List<String> matchingStudents = new ArrayList<>();

        for (String student : students) {
            if (student.startsWith(prefix)) {
                matchingStudents.add(student);
            }
        }

        return matchingStudents;
    }

}

