package hw_12_10_2023.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите првую букву фамилии студента для сортировки  (А, Б или В): ");
        String a = scanner.nextLine();

        List<String> students = new ArrayList<>();
        students.add("Аверкин");
        students.add("Авилин");
        students.add("Авраамов");
        students.add("Базырин");
        students.add("Багримов");
        students.add("Бадьянов");
        students.add("Валковский");
        students.add("Валюкевич");
        students.add("Ванехин");

        Group group = new Group(students);

        List<String> checkStudents = group.findStudents(a);

        for (String student : checkStudents) {
            System.out.println(student);
        }
    }
}