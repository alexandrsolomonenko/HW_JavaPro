package hw_24_10_2023.nightClub;

import java.util.ArrayList;
import java.util.List;

public class Guard {
    private List<Visitor> queue;

    public Guard() {
        queue = new ArrayList<>();
    }

    public void addVisitor(String name, int age) {
        if (age < 21) {
            System.out.println(name + " Вы не подходите по возрасту для посещения ночного клуба!");
        }else{
            queue.add(new Visitor(name, age));
            System.out.println(name+" Добро пожаловать!");
        }
    }
    public void Service(){
        if(queue.isEmpty()){
            System.out.println("В клубе нет посетителей");
        }else{
            Visitor visitor = queue.remove(0);
            System.out.println("Обслужить посетителя "+visitor.getName()+" ,возраст: "+visitor.getAge());
        }
    }
}
