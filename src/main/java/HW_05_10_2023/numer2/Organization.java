package HW_05_10_2023.numer2;

import java.util.List;

public class Organization {
    private String name;
    private List<Department> departments;

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

}
