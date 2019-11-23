package lt.sdaacademy.fundamentalscoding.practicalexsercises.bookAndAuthor;

public class AuthorOne {
    private String name;
    private String email;
    private String phoneNum;

    public AuthorOne(String name, String email, String phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String toString(){
        //return String.format ("Autoriaus pavadinimas: %s, pastas: %s", name, email);
        return String.format ("%s, pastas: %s, telefono numeris: %s", name, email,phoneNum);
    }
}
