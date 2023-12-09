package hw_23_11_2023.convertToJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // Создание объекта
        Person person = new Person("John", 30, true, Arrays.asList("apple", "banana", "cherry"));

        try {
            // Запись объекта в файл
            objectMapper.writeValue(new File("D:\\person.json"), person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
