package HW_05_10_2023.numer2;

public class Main {
    public static void main(String[] args) {
        // Создание объектов сотрудников
        Employee employee1 = new Employee();
        employee1.setFirstName("John");
        employee1.setLastName("Woo");
        employee1.setAge(30);
        employee1.setSalary(50000.0);

        Employee employee2 = new Employee();
        employee2.setFirstName("Alice");
        employee2.setLastName("Smith");
        employee2.setAge(25);
        employee2.setSalary(40000.0);

        // Создание объекта департамента
        Department department = new Department();
        department.setName("Sales");
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        // Создание объекта организации
        Organization organization = new Organization();
        organization.setName("Digital Company");
    }
}
