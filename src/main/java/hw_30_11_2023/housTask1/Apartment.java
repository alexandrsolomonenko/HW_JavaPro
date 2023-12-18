package hw_30_11_2023.housTask1;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private List<Room> rooms;

    public Apartment() {
        this.rooms = new ArrayList<>();
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
