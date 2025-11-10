package com.session19b;

public class Book {
    private final String title;
    private final Author author;
    private final String publisher;
    private final String ISBN;

    private int copies;

    public Book(String title, Author author, String publisher, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public void addCopy() {
        copies++;
    }

    public void removeCopy() {
        if (copies > 0) copies--;
    }

    public boolean isAvailable() {
        return copies > 0;
    }

    public void displayBookInfo() {
        System.out.println("Book: " + title + " by " + author.getName() +
                ", Publisher: " + publisher + ", ISBN: " + ISBN + ", Copies: " + copies);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

