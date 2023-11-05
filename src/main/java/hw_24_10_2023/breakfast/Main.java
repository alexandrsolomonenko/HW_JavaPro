package hw_24_10_2023.breakfast;

public class Main {
    public static void main(String[] args) {
            int age = 7; // возраст внука
            int pancakes = 0; // количество съеденных блинов

            for (int i = 1; i <= age; i++) {
                System.out.println("Бабушка жарит 2 блинчика...");
                pancakes++;

                System.out.println("Внук съел верхний блинчик. Всего съедено " + pancakes + " блинчиков.");

                if (pancakes == age) {
                    System.out.println("Внук наелся. Завтрак закончен.");
                    break;
                }
            }
        }
    }
