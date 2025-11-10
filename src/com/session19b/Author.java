package com.session19b;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private final String name;
    private final String nationality;
    private final String dateOfBirth;
    private final List<Book> books;


    public Author(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAuthorInfo() {
        System.out.println("Author: " + name + ", Nationality: " + nationality + ", DOB: " + dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
