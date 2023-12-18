package hw_30_11_2023.housTask3;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private final List<Room> rooms;

    public Apartment() {
        this.rooms = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public double getLivingArea() {
        double livingArea = 0;
        for (Room room : rooms) {
            livingArea += room.getArea();
        }
        return livingArea;
    }

}
