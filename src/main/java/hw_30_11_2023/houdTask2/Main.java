package hw_30_11_2023.houdTask2;

public class Main {
    public static void main(String[] args) {
        // Создаем дом
        House house = new House();

        // Создаем квартиры
        Apartment apartment1 = new Apartment();
        Apartment apartment2 = new Apartment();

        Room room1 = new Room(20);
        Room room2 = new Room(15);
        Room room3 = new Room(80);
        Room room4 = new Room(18);
        Room room5 = new Room(12);

        apartment1.addRoom(room1);
        apartment1.addRoom(room2);
        apartment1.addRoom(room3);
        apartment2.addRoom(room4);
        apartment2.addRoom(room5);

        house.addApartment(apartment1);
        house.addApartment(apartment2);

        double targetArea = 100;
        double foundArea = house.findApartmentWithAreaGreaterThan(targetArea);

        if (foundArea != -1) {
            System.out.println("Найдена квартира с площадью больше " + targetArea + " кв.м: " + foundArea + " кв.м");
        } else {
            System.out.println("Такой квартиры не найдено");
        }
    }
}


