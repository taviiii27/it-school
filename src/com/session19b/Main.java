package com.session19b;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Author author1 = new Author("JK Rowling", "British", "1976-07-31");
        Book book1 = new Book("2000", author1, "Harry Potter", "183922");
        author1.addBook(book1);
        library.addBook(book1);

        Member member1 = new Member("Alex", "Strada Florilor", "alex@email.com");
        library.addMember(member1);

        library.displayAllBooks();
        library.displayAllMembers();

        member1.borrowBook(book1);
        member1.displayBorrowedBooks();

        member1.returnBook(book1);
        library.displayAllBooks();
    }
}

