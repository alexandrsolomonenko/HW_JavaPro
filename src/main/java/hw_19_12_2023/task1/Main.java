package hw_19_12_2023.task1;
//Разработайте программу, эмулирующую работу нескольких пользователей (потоков)
// с единым электронным документом. Все пользователи могут добавлять,
// редактировать и удалять записи (одна запись – одна строка).
// Каждый новый пользователь получает актуальную копию документа и работает с ней.
// После внесения изменений пользователь сохраняет изменения.
// Для оптимизации доступа к документу используйте ReentrantReadWriteLock.
public class Main {
    public static void main(String[] args) {
        Document document = new Document("");
        User user1 = new User(document);
        User user2 = new User(document);

        new Thread(user1).start();
        new Thread(user2).start();

    }
}
