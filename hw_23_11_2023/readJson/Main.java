package hw_23_11_2023.readJson;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        try {
            // Чтение файла
            File jsonFile = new File("D:\\Example1.json");

            // Парсинг JSON
            String json = new String(Files.readAllBytes(jsonFile.toPath()));

            // Извлечение значения поля age
            int age = JsonPath.read(json, "$.age");

            System.out.println("Age: " + age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
