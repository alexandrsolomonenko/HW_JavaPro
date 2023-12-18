package hw_30_11_2023.housTask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Double>> roomMaps = new ArrayList<>();

        List<Apartment> apartments = convertRoomMapsToApartments(roomMaps);
    }
    public static List<Apartment> convertRoomMapsToApartments(List<Map<String, Double>> roomMaps) {
        List<Apartment> apartments = new ArrayList<>();

        for (Map<String, Double> roomMap : roomMaps) {
            Apartment apartment = new Apartment();

            for (Map.Entry<String, Double> entry : roomMap.entrySet()) {
                String roomName = entry.getKey();
                double roomArea = entry.getValue();

                Room room = new Room(roomArea);
                apartment.addRoom(room);
            }

            apartments.add(apartment);
        }

        return apartments;
    }
}
