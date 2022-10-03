package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pageAmount;
    private double cost;

    public Book(int id, String name, String author, String publication, int year, int pageAmount, double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publication;
        this.year = year;
        this.pageAmount = pageAmount;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ",  name: " + name +
                ",  author: " + author +
                ",  publication: " + publisher +
                ",  year: " + year +
                ",  pageAmount: " + pageAmount +
                ",  cost: " + cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public double getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
