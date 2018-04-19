package com.duzieblo.example.enumType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String ...args) {
        List<Book> books = new ArrayList<>();

        Book firstBook = new Book("Java. Podstawy",
                "Cay S. Horstmann",
                Category.PROGRAMMING,
                LocalDate.of(2017, 2, 20));
        Book secondBook = new Book("Ronaldo. Obsesja doskonałości",
                "Kevin Mallet",
                Category.SPORT,
                LocalDate.of(2014, 10, 1));
        Book thirdBook = new Book("Myśl i bogać się",
                "Napoleon Hill",
                Category.MOTIVATION,
                LocalDate.of(1998, 3, 4));

        addBook(books, firstBook);
        addBook(books, secondBook);
        addBook(books, thirdBook);

        System.out.println("Show books in category: " + Category.PROGRAMMING);
        showBookFiltredByCategory(books, Category.PROGRAMMING);

        System.out.println("Nazwa kategorii HEALTH: " + Category.HEALTH.name());
        System.out.println("Kolejność kategorii HEALTH: " + Category.HEALTH.ordinal());
        System.out.println("Czy kategoria " + Category.HEALTH + " jest przed kategorią " +
                Category.SPORT + " w kolejności? " +
                (Category.HEALTH.compareTo(Category.SPORT) < 0 ? "Tak" : "Nie"));
        System.out.println("Czy kategoria " + Category.SPORT + " jest przed kategorią " +
                Category.HEALTH + " w kolejności? " +
                (Category.SPORT.compareTo(Category.HEALTH) < 0 ? "Tak" : "Nie"));
        System.out.println("Czy kategoria " + Category.SPORT + " jest w tej samej kolejności " +
                "co kategoria " + Category.SPORT +
                (Category.SPORT.compareTo(Category.SPORT) == 0 ? " Tak" : "Nie"));

    }

    private static void addBook(List<Book> books, Book book) {
        books.add(book);
    }

    private static void showBookFiltredByCategory(List<Book> books, Category category) {
        for (Book book : books) {
            if (book.getCategory() == category) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
            }
        }
    }
}
