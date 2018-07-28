package book;

public class Book {
    private String author;
    private String title;
    private double price;
    private int releaseDate;

    public Book(String author, String title, double price, int releaseDate) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
}
