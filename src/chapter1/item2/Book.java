package chapter1.item2;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private LocalDate releaseDate;

    public static class Builder {
        private String title;
        private String author;
        private LocalDate releaseDate;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder withReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
    }
}
