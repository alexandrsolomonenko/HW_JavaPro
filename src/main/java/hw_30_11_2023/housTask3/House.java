package hw_30_11_2023.housTask3;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Apartment> apartments;

    public House() {
        this.apartments = new ArrayList<>();
    }

    public List<Apartment> getApartments() {
        return apartments;
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

    public House getNewHouseWithIncreasedArea(double percent) {
        House newHouse = new House();
        for (Apartment apartment : apartments) {
            Apartment newApartment = new Apartment();
            for (Room room : apartment.getRooms()) {
                Room newRoom = new Room(room.getArea());
                newRoom.increaseArea(percent);
                newApartment.addRoom(newRoom);
            }
            newHouse.addApartment(newApartment);
        }
        return newHouse;
    }

}
