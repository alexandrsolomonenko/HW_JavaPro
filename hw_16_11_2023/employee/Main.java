package hw_16_11_2023.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Will", "Smith", new Date(), "Developer", 5000);
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeChars(String.valueOf(employee));
            out.close();
            System.out.println("Сериализованные данные сохраняются в файле employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
