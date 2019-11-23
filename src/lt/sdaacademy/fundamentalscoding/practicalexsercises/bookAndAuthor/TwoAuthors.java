package lt.sdaacademy.fundamentalscoding.practicalexsercises.bookAndAuthor;

import java.util.List;

public class TwoAuthors {
    private List<AuthorOne> authorOneList;
    private List<AuthorTwo> authorTwoList;

    public TwoAuthors(List<AuthorOne> authorOneList, List<AuthorTwo> authorTwoList) {
        this.authorOneList = authorOneList;
        this.authorTwoList = authorTwoList;
    }

    public String toString() {
        //return String.format ("Autoriaus pavadinimas: %s, pastas: %s", name, email);
        return String.format("%s, \n Antrojo autoriaus vardas: %s", authorOneList.get(0).toString(), authorTwoList.get(0).toString());
    }

}
