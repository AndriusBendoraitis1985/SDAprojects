package lt.sdaacademy.fundamentalscoding.practicalexsercises.bookAndAuthor;

import java.util.List;

public class Book {
    private String title;
    private List<Author> author;
    private int price;
    private int qnt;

    public Book(String title, List<Author> author, int price, int qnt) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString(){
        return String.format ("Knygos pavadinimas: %s, Pirmojo autoriaus vardas: %s", title, author.get(0).toString());
    }
}
