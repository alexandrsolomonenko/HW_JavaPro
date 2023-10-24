package hw_19_10_2023.fulName;

import java.util.Comparator;

public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


    static class FirstName implements Comparator<FullName> {
        @Override
        public int compare(FullName name1, FullName name2) {
            return name1.getFirstName().compareTo(name2.getFirstName());
        }
    }

}



