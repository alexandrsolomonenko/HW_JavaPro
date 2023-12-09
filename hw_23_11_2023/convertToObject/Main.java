package hw_23_11_2023.convertToObject;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("D:\\Example2.json")) {
            // Чтение данных из JSON и конвертация в объект
            Service service = gson.fromJson(reader, Service.class);

            // Использование объекта
            System.out.println("Service Name: " + service.getServiceName());
            System.out.println("Code: " + service.getCode());
            System.out.println("User Message: " + service.getUserMessage());
            System.out.println("Is Error: " + service.isError());

            System.out.println("Support Contacts:");
            List<SupportContact> supportContacts = service.getSupportContacts();
            for (SupportContact contact : supportContacts) {
                System.out.println("ID: " + contact.getId());
                System.out.println("Phone: " + contact.getPhone());
                System.out.println("Email: " + contact.getEmail());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
