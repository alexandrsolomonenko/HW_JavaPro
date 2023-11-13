package hw_24_10_2023.nightClub;

import java.util.Scanner;

import static hw_24_10_2023.nightClub.Visitor.createVisitor;

public class Main {
    public static void main(String[] args) {
        NightClub club = new NightClub();

        // Заполнение очереди клуба
        for (int i = 0; i < 10; i++) {
            Visitor visitor = createVisitor();
            club.addVisitor(visitor);
        }

        // Обслуживание посетителей
        club.serveVisitors();
    }
}