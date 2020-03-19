package item2;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private LocalDate releaseDate;

    public static class Builder {
        private String title;
        private String author;
        private LocalDate releaseDate;

        public Builder(String title) {
            this.title = title;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    private Book(Builder builder) {
        title = builder.title;
        author = builder.author;
        releaseDate = builder.releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
