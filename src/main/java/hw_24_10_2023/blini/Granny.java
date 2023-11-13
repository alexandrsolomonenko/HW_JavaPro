package hw_24_10_2023.blini;

import java.util.List;

public class Granny {
    public void cookPancakes(List<Pancake> stack, int numPancakes) {
        for (int i = 0; i < numPancakes; i++) {
            stack.add(new Pancake());
        }
        System.out.println(numPancakes + " блинчик(ов) приготовлено бабушкой!");
    }
}
