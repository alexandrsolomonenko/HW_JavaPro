package hw_24_10_2023.nightClub;

import java.util.LinkedList;
import java.util.Queue;

public class NightClub {
    private Queue<Visitor> queue;

    public NightClub() {
        queue = new LinkedList<>();
    }

    public void addVisitor(Visitor visitor) {
        queue.add(visitor);
        System.out.println("Посетитель добавлен в очередь");
    }

    public void serveVisitors() {
        Bouncer bouncer = new Bouncer();
        while (!queue.isEmpty()) {
            Visitor visitor = queue.poll();
            boolean isAllowed = bouncer.checkAge(visitor);
            if (isAllowed) {
                System.out.println("Посетитель переходит в клуб");
            } else {
                System.out.println("Посетитель несовершеннолетний. В клуб его не пустят.");
            }
        }
        System.out.println("Все посетители обслужены");
    }
}
