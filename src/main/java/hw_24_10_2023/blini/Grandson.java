package hw_24_10_2023.blini;

import java.util.List;

public class Grandson {
    public void eatPancake(List<Pancake> stack) {
        if (!stack.isEmpty()) {
            Pancake pancake = stack.remove(stack.size() - 1);
            System.out.println("Внук съел один блинчик");
        }
    }
}
