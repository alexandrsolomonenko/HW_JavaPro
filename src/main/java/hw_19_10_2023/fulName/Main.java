package hw_19_10_2023.fulName;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<FullName> names = new TreeSet<>(new FullName.FirstName());


        names.add(new FullName("Bruce", "Smith"));
        names.add(new FullName("Patrick", "Carlson"));
        names.add(new FullName("Edward", "Parks"));
        names.add(new FullName("Michael", "Green"));
        names.add(new FullName("Raymond", "Miller"));
        names.add(new FullName("Richard", "Freeman"));
        names.add(new FullName("Brian", "Garcia"));
        names.add(new FullName("Sam", "Lopez"));

        for (FullName name : names) {
            System.out.println(name);
        }
    }


}
