package hw_24_10_2023.blini;
//Напишите программу Завтрак у бабушки. Бабушка жарит блинчик и кладёт его сверху на стопку. Внук может
//скушать только верхний блинчик. В цикле смоделируйте, что за одну итерацию бабушка жарит 2 блинчика, а
//внук съедает только один. Когда внук наелся. Цикл заканчивается. Количество блинов, которые может
//съесть внук равно его возрасту.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Granny granny = new Granny();
        Grandson grandson = new Grandson();
        List<Pancake> stack = new ArrayList<>();

        int age = 12;
        // Возраст внука, определяющий количество блинов, которые он может съесть

        granny.cookPancakes(stack, age * 2 ); // Бабушка готовит начальное количество блинов

        while (age > 0) {
            grandson.eatPancake(stack); // Внук съедает один блинчик
            age--; // Уменьшаем количество оставшихся блинов, которые может съесть внук
        }
        System.out.println("Стопка блинчиков пуста, внук наелся!");

    }
}
