package lt.sdaacademy.fundamentalscoding.practicalexsercises.bookAndAuthor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAndAuthorMain {

    private static final String FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\bookAndAuthor\\BooksData.txt";

    public static void main(String[] args) {
        List<Book> bookList = getBooksFromFile();

        for (Book book : bookList) {
            System.out.println(book.toString());
        }

        //     System.out.println(bookList.get(0));
        //      System.out.println(bookList.get(1));
    }

    private static List<Book> getBooksFromFile() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = "";

            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] spittedLine = line.split(";");
                bookList.add(booksDatatoObject(spittedLine));
            }
        } catch (IOException e) {
            System.out.println("Klaida");
        }
        return bookList;
    }

    private static Book booksDatatoObject(String[] booksData) {
        return new Book(booksData[0], MapAuthorData(booksData[1]), Integer.parseInt(booksData[2]), Integer.parseInt(booksData[3]));
    }

    private static List<Author> MapAuthorData(String authorData) {
        List<Author> authors = new ArrayList<>();
        String[] splittedLineData = authorData.split("-");
        if (splittedLineData.length == 0) {
            String[] authorsData = authorData.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        for (String authorsInfo : splittedLineData) {
            String[] authorsData = authorsInfo.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        return authors;

    }
}


