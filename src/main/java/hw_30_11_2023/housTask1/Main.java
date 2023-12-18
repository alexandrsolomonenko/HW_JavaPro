package hw_30_11_2023.housTask1;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        Apartment apartment1 = new Apartment();
        Apartment apartment2 = new Apartment();

        Room room1 = new Room(20);
        Room room2 = new Room(15);
        Room room3 = new Room(10);
        Room room4 = new Room(18);
        Room room5 = new Room(12);

        apartment1.addRoom(room1);
        apartment1.addRoom(room2);
        apartment1.addRoom(room3);
        apartment2.addRoom(room4);
        apartment2.addRoom(room5);

        house.addApartment(apartment1);
        house.addApartment(apartment2);

        double totalLivingArea = house.getTotalLivingArea();
        System.out.println("Суммарная жилая площадь дома: " + totalLivingArea);
    }
    }

