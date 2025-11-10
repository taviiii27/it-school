package com.session19b;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final String address;
    private final String contact;
    private final List<Book> borrowedBooks;

    public Member(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.borrowedBooks = new ArrayList<>();
    }


    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.removeCopy();
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.addCopy();
            System.out.println(name + " returned " + book.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed books of " + name + ":");
        for (Book b : borrowedBooks) {
            System.out.println(" - " + b.getTitle());
        }
    }

    public boolean hasOverdueBooks() {
        // Simplified for this version
        return false;
    }

    public String getName() {
        return name;
    }
}

