package hw_09_01_2024;

import com.google.gson.Gson;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        System.out.println(myObject.toString());
        System.out.println("*************");
        myObject.setPrivateField1(123);
        myObject.setPrivateField2("Hello!");
        myObject.setPrivateField3(33.7);
        myObject.setPrivateField4(true);

        Gson gson = new Gson();
        String json = gson.toJson(myObject);
        System.out.println("JSON-представление объекта: " + "\n" + json);

        Scanner scanner = new Scanner(System.in);
        System.out.println("*************");
        System.out.print("Введите имя поля или метода: ");
        String input = scanner.nextLine();

        java.lang.reflect.Method method = null;
        java.lang.reflect.Field field = null;

        try {
            method = MyClass.class.getMethod(input);
            if (method != null) {
                System.out.println("Введено имя метода: " + method.getName());
                method.invoke(myObject);
                return;
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignored) {
        }

        try {
            field = MyClass.class.getDeclaredField(input);
            if (field != null) {
                System.out.println("Введено имя поля: " + field.getName());
                System.out.print("Введите новое значение для поля: ");
                String newValue = scanner.nextLine();
                field.setAccessible(true);
                field.set(myObject, newValue);
                System.out.println("Значение поля успешно изменено.");
                System.out.println(myObject.toString());
                return;
            }
        } catch (NoSuchFieldException | IllegalAccessException ignored) {
        }

        System.out.println("Введено некорректное имя поля или метода.");


    }

}

