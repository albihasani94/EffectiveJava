package item2;

import java.time.LocalDate;

public class Book {

    private final String title;
    private final String author;
    private final LocalDate releaseDate;
    private final int sales;

    public static class Builder {
        private String title;
        private String author;
        private LocalDate releaseDate;
        private int sales = 0;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder withSales(int sales) {
            this.sales = sales;
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
        sales = builder.sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                ", sales=" + sales +
                '}';
    }
}
