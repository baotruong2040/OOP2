package Ex2;
import java.util.*;
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    String nameAuthors;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price=price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName() {
        return name;

    }
    public Author[] geAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;

    }
    public void setQty(int qty) {
        this.qty=qty;
    }
    public String toString() {
        return "Book [Name: "+name+ ", "+ Arrays.toString(authors)+", Price: "+price+", Qty: "+qty+"]";
    }
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        return authorNames.toString();
    }
}