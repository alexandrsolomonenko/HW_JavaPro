package hw_14_11_2023.hw2;

import hw_14_11_2023.hw2.book.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Метро 2033", "Дмитрий Глуховский", 2015);

        String title = book.getTitle();
        String author = book.getAuthor();
        int year = book.getYear();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

}

