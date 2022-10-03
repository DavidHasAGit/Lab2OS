package main;

import model.Book;

import java.util.Scanner;

public class MainClass {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book(15107, "The Great Reset", "Alex Jones", "Skyhorse", 2022, 264, 600.25);
        books[1] = new Book(24363, "What If", "Randall Munroe", "Riverhead Books", 2022, 368, 555.26);
        books[2] = new Book(46436, "How To", "Randall Munroe", "Riverhead Books", 2019, 320, 369.99);

        System.out.print("""
                If want to choose books with:
                same author - print A,
                same publisher - print P,
                the publication year is later than you have chosen - print Y.
                Your choice: """);

        switch (scan.nextLine()) {
            case "A" -> checkByAuthor(books);
            case "P" -> checkByPublisher(books);
            case "Y" -> checkByYear(books);
            default -> System.out.println("There is no such choice");
        }
    }

    public static void checkByAuthor(Book[] books){
        System.out.print("Print name of author: ");
        String author = scan.nextLine();
        boolean bookIs = false;
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].getAuthor().equals(author))
            {
                System.out.println(books[i]);
                bookIs = true;
            }
        }
        if (!bookIs){
            System.out.print("There are no books with this author");
        }
    }
    public static void checkByPublisher(Book[] books){
        System.out.print("Print name of publisher: ");
        String publisher = scan.nextLine();
        boolean bookIs = false;
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].getPublisher().equals(publisher))
            {
                System.out.println(books[i].toString());
                bookIs = true;
            }
        }
        if (!bookIs){
            System.out.print("There are no books with this author");
        }
    }
    public static void checkByYear(Book[] books){
        System.out.print("Print the year of publication and I will print the books that came out later: ");
        int year = scan.nextInt();
        while (year > 2022 || year < 868){
            System.out.print("Invalid year. Try again: ");
            year = scan.nextInt();
        }
        boolean bookIs = false;
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
                bookIs = true;
            }
        }
        if (!bookIs){
            System.out.print("There are no books with this author");
        }
    }
}
