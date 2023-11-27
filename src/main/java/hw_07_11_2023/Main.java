package hw_07_11_2023;

import hw_07_11_2023.lombok.Auto;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setModel("Mercedes");
        auto.setYearModel(2019);
        auto.setLineVersion("AMG Line");

        String model = auto.getModel(); // Обращение к геттеру
        String stringRepresentation = auto.toString(); // Вызов метода toString()

        System.out.println("Model: "+model);
        System.out.println("String representation: "+stringRepresentation);


    }
}
