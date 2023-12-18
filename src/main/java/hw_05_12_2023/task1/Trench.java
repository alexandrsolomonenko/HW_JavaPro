package hw_05_12_2023.task1;

class Trench {
    private int targetLength;
    private int currentLength;

    public Trench(int targetLength) {
        this.targetLength = targetLength;
        this.currentLength = 0;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public int getTargetLength() {
        return targetLength;
    }

    public synchronized void dig(int distance) throws InterruptedException {
        while (currentLength >= targetLength) {
            wait();
        }

        Thread.sleep(1000);  // Копаем 1 метр траншеи

        currentLength += distance;
        if (currentLength >= targetLength) {
            notifyAll();
        }
    }
}