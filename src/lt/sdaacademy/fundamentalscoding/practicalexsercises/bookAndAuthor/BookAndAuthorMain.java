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

        System.out.println(bookList.get(0));
        System.out.println(bookList.get(1));
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
        } catch (IOException e){
            System.out.println("Klaida");
        }
        return bookList;
    }

    private static Book booksDatatoObject(String[] booksData){
return new Book(booksData[0], TwoAuthorToObject(booksData[1]), Integer.parseInt(booksData[2]), Integer.parseInt(booksData[3]));
    }

private static List<TwoAuthors> TwoAuthorToObject (String twoAuthorsInfo){
        List<TwoAuthors> twoAuthorsList = new ArrayList<>();

        String[] splittedTwoAuthors = twoAuthorsInfo.split("-");
        twoAuthorsList.add(twoAuthorsDataToObject(splittedTwoAuthors));
        return twoAuthorsList;
}

private static TwoAuthors twoAuthorsDataToObject (String[] twoAuthorsdata){
        return new TwoAuthors(authorOneToObject(twoAuthorsdata[0]),authorTwoToObject(twoAuthorsdata[1]));
}


    private static List<AuthorOne> authorOneToObject(String authorsOneInfo){
        List <AuthorOne> authorOneList = new ArrayList<>();

            String[] splittedAuthorsOne = authorsOneInfo.split(",");
            authorOneList.add(authorsOneDataToObject(splittedAuthorsOne));

            return authorOneList;

    }
    private static AuthorOne authorsOneDataToObject (String[] authoroOneData){
        return new AuthorOne (authoroOneData[0], authoroOneData[1], authoroOneData[2]);
    }
    private static List<AuthorTwo> authorTwoToObject(String authorsTwoInfo){
        List <AuthorTwo> authorTwoList = new ArrayList<>();

        String[] splittedAuthorsTwo = authorsTwoInfo.split(",");
        authorTwoList.add(authorsTwoDataToObject(splittedAuthorsTwo));

        return authorTwoList;

    }
    private static AuthorTwo authorsTwoDataToObject (String[] authorTwoData){
        return new AuthorTwo(authorTwoData[0], authorTwoData[1], authorTwoData[2]);
    }


}


