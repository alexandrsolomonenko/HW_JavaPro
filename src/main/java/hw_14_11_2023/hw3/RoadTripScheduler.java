package hw_14_11_2023.hw3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class RoadTripScheduler {
    private static final int AVERAGE_SPEED = 90;

    public static void main(String[] args) {
        LocalDateTime departureDateTime = LocalDateTime.of(2022, 1, 1, 9, 0); // Пользовательские данные

        Map<String, Integer> route = new HashMap<>(); // Маршрут с расстоянием в километрах
        route.put("Berlin", 0);
        route.put("Munich", 580);
        route.put("Vienna", 1170);
        route.put("Budapest", 1520);
        route.put("Belgrade", 1760);
        route.put("Sofia", 2090);
        route.put("Istanbul", 2500);

        System.out.println("Road Trip Schedule:");
        LocalDateTime arrivalDateTime = departureDateTime;
        for (Map.Entry<String, Integer> entry : route.entrySet()) {
            String location = entry.getKey();
            int distance = entry.getValue();
            int travelTime = distance / AVERAGE_SPEED;
            arrivalDateTime = arrivalDateTime.plusHours(travelTime);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDate = arrivalDateTime.format(formatter);
            System.out.println(location + ": " + formattedDate);
        }
    }
}
