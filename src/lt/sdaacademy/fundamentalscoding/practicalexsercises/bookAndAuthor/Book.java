package lt.sdaacademy.fundamentalscoding.practicalexsercises.bookAndAuthor;

import java.util.List;

public class Book {
    private String title;
    private List<TwoAuthors> twoAuthorsList;
    private int price;
    private int qnt;

    public Book(String title, List<TwoAuthors> twoAuthorsList, int price, int qnt) {
        this.title = title;
        this.twoAuthorsList = twoAuthorsList;
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString(){
        return String.format ("Knygos pavadinimas: %s, Pirmojo autoriaus vardas: %s", title, twoAuthorsList.get(0).toString());
    }
}
