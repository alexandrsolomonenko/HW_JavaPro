package hw_05_12_2023.task1;

class Excavator implements Runnable {
    private Trench trench;

    public Excavator(Trench trench) {
        this.trench = trench;
    }

    public void run() {
        try {
            while (trench.getCurrentLength() < trench.getTargetLength()) {
                trench.dig(1);
                System.out.println("Прокопал 1 метр. Текущая длина траншеи: " + trench.getCurrentLength());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
