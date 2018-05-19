package chapter1.item2;

import java.time.LocalDate;

//Item 2: Consider a builder when faces with many constructor parameters
public class Application {

    public static void main(String[] args) {
        Book book = new Book.Builder("Effective Java 3rd Edition")
                .withAuthor("Joshua Bloch")
                .withReleaseDate(LocalDate.of(2018, 1, 1))
                .build();

        System.out.println(book);
    }

}
