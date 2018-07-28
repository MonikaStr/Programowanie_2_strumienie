package book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    List<Book> listOfBooks;// = new ArrayList<>();

    public Library(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
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



}
