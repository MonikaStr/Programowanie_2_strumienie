package book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> listOfBooks;// = new ArrayList<>();

    public Library(List<Book> listOfBooks) {
        if (listOfBooks == null || listOfBooks.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.listOfBooks = listOfBooks;
    }

    public Library() {
    }

    public List<String> returnListOfAuthors() {
        return listOfBooks.stream()
                .map(x -> x.getAuthor())
                .collect(Collectors.toList());
    }

    public List<String> returnListOfTitles() {
        return listOfBooks.stream()
                .map(x -> x.getTitle())
                .collect(Collectors.toList());
    }

    public List<Double> returnListOfPrices() {
        return listOfBooks.stream()
                .map(x -> x.getPrice())
                .collect(Collectors.toList());
    }

    public List<Book> returnOneAuthorBooks(String author) {
        return listOfBooks.stream()
                .filter(x -> x.getAuthor().equals(author))
                .collect(Collectors.toList());
    }



}
