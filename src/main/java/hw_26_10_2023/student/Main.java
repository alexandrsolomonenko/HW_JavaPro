package hw_26_10_2023.student;

public class Main {

        public static void main(String[] args) {
            Student<Subject.Biology> biologyStudent = new Student<>(new Subject.Biology());
            biologyStudent.study();

            Student<Subject.Mathematics> mathematicsStudent = new Student<>(new Subject.Mathematics());
            mathematicsStudent.study();

            Student<Subject.Literature> literatureStudent = new Student<>(new Subject.Literature());
            literatureStudent.study();
        }

    }

