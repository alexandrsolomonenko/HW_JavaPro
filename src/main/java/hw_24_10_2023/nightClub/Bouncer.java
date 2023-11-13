package hw_24_10_2023.nightClub;

import java.util.Queue;

public class Bouncer {
    public boolean checkAge(Visitor visitor) {
        return visitor.getAge() >= 21; // Проверка на совершеннолетие
    }
}
