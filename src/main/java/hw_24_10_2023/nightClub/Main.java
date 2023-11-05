package hw_24_10_2023.nightClub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guard guard = new Guard();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do{
            System.out.println("\nМеню:");
            System.out.println("1. Добавить посетителя");
            System.out.println("2. Обслужить посетителя");
            System.out.println("3. Выйти из программы");
            System.out.print("Введите номер пункта меню: ");
            choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.println("Введите имя посетителя: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите возраст посетителя: ");
                    String age = scanner.nextLine();

                    guard.addVisitor(name, Integer.parseInt(age));
                    break;
                case "2":
                    guard.Service();
                    break;
                case "3":
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Не правильный выбор, попробуйте еще раз.");
        }
    }while (!choice.equals("3"));
}
}