package hw_19_10_2023.collectionListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Acura");
        cars.add("BMW");
        cars.add("Bantly");
        cars.add("Opel");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("VW");

        System.out.println("Цикл while с помощью итератора:");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
        System.out.println("##################################################");
        System.out.println("Цикл for с помощью итератора:");
        for (Iterator<String> it = cars.iterator(); it.hasNext(); ) {
            String car = it.next();
            System.out.println(car);
        }
    }
}
