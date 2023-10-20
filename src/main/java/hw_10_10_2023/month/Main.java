package hw_10_10_2023.month;

import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите название месяца на английском языке: " + Arrays.toString(MonthTemp.values()));
        String str = myScan.nextLine().toUpperCase();

        try {
            MonthTemp userTemp = MonthTemp.valueOf(str);
            double averageTemperature = userTemp.getTemperature();
            String season = userTemp.getMonthSeason();

            System.out.println("Сезон года: " + season);
            System.out.println("Средняя температура в месяце: " + averageTemperature + "°C");

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректное название месяца!");

        }


    }

}
