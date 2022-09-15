package forMain;

import forBook.Book;

import java.util.Scanner;

public class MainClass {

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
        Scanner scan = new Scanner(System.in);

        switch (scan.nextLine()) {
            case "A" -> checkByAuthor(scan, books);
            case "P" -> checkByPublisher(scan, books);
            case "Y" -> checkByYear(scan, books);
            default -> System.out.println("There is no such choice");
        }
    }

    public static void checkByAuthor(Scanner scan, Book[] books){
        System.out.print("Print name of author: ");
        String author = scan.nextLine();
        for (int i = 0; i < 3; i++)
        {
            if (books[i].getAuthor().equals(author))
            {
                System.out.println(books[i].toString());
            }
        }
    }
    public static void checkByPublisher(Scanner scan, Book[] books){
        System.out.print("Print name of publisher: ");
        String publisher = scan.nextLine();
        for (int i = 0; i < 3; i++)
        {
            if (books[i].getPublisher().equals(publisher))
            {
                System.out.println(books[i].toString());
            }
        }
    }
    public static void checkByYear(Scanner scan, Book[] books){
        System.out.print("Print the year of publication and I will print the books that came out later: ");
        int year = scan.nextInt();
        for (int i = 0; i < 3; i++)
        {
            if (books[i].getYear() > year)
            {
                System.out.println(books[i].toString());
            }
        }
    }
}
