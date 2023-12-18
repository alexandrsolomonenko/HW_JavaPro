package hw_05_12_2023.task1;

public class Main {
    public static void main(String[] args) {
        Trench trench = new Trench(10);

        Thread excavator1 = new Thread(new Excavator(trench));
        Thread excavator2 = new Thread(new Excavator(trench));
        long startTime;

        startTime = System.currentTimeMillis();
        excavator1.start();
        try {
            excavator1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime1 = endTime - startTime;

        trench = new Trench(20);

        startTime = System.currentTimeMillis();
        excavator1 = new Thread(new Excavator(trench));
        excavator2 = new Thread(new Excavator(trench));
        excavator1.start();
        excavator2.start();
        try {
            excavator1.join();
            excavator2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        long elapsedTime2 = endTime - startTime;

        System.out.println("Один землекоп прокопал траншею за " + elapsedTime1 + " мс");
        System.out.println("Два землекопа прокопали траншею за " + elapsedTime2 + " мс");
    }
}
