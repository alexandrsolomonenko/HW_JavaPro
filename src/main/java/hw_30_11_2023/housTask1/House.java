package hw_30_11_2023.housTask1;

import java.util.ArrayList;
import java.util.List;

public class House {
    private final List<Apartment> apartments;

    public House() {
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double getTotalLivingArea() {
        double totalLivingArea = 0;
        for (Apartment apartment : apartments) {
            totalLivingArea += apartment.getLivingArea();
        }
        return totalLivingArea;
    }
}
