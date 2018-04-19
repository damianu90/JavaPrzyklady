package com.duzieblo.example.enumType;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private Category category;
    private LocalDate releaseDate;

    public Book() {}

    public Book(String title, String author, Category category, LocalDate releaseDate) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
