package com.session19b;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // --- Book operations ---
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAllBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            b.displayBookInfo();
        }
    }


    public Book searchBookByTitle(String title) {
        for (Book b : books)
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        return null;
    }

    public Book searchBookByISBN(String isbn) {
        for (Book b : books)
            if (b.getISBN().equalsIgnoreCase(isbn)) return b;
        return null;
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book b : books)
            if (b.getAuthor().getName().equalsIgnoreCase(authorName))
                result.add(b);
        return result;
    }

    // --- Member operations ---
    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayAllMembers() {
        System.out.println("\nLibrary Members:");
        for (Member m : members)
            System.out.println(" - " + m.getName());
    }

    public Member searchMemberByName(String name) {
        for (Member m : members)
            if (m.getName().equalsIgnoreCase(name)) return m;
        return null;
    }
}
