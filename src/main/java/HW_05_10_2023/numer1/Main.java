package HW_05_10_2023.numer1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String word = StringUtils.generateWord(5);
        System.out.println("Слово: " + word);

        String numeric = StringUtils.generateNumeric(7);
        System.out.println("Число: " + numeric);

        String input1 = "Я люблю Java!";
        String[] parts1 = StringUtils.splitByFirst(input1);
        System.out.println("Разделение строки \"" + input1 + "\": " + Arrays.toString(parts1));

        String input2 = "Люди! Я люблю Java! Ура!";
        String[] parts2 = StringUtils.splitByFirst(input2);
        System.out.println("Разделение строки \"" + input2 + "\": " + Arrays.toString(parts2));

        String str1 = "12345";
        System.out.println(str1 + " - число? " + StringUtils.isNumeric(str1));

        String str2 = "12abc";
        System.out.println(str2 + " - число? " + StringUtils.isNumeric(str2));
    }
}
