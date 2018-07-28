package book;

import java.util.ArrayList;
import java.util.List;

public class RunnerLibrary {
    public static void main(String[] args) {

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Henryk Sienkiewicz", "W pustyni i w puszczy", 27, 2015));
        listOfBooks.add(new Book("Henryk Sienkiewicz", "Quovadis", 35, 2013));
        listOfBooks.add(new Book("Eliza Orzeszkowa", "Nad Niemnem", 25, 2010));
        listOfBooks.add(new Book("Andrzej Sapkowski", "Wiedźmin: krew elfów", 31, 1999));
        listOfBooks.add(new Book("Andrzej Sapkowski", "Wiedźmik: miecz przeznaczenia", 22, 2000));
        listOfBooks.add(new Book("Andrzej Pilipiuk", "Jakub Wędrowycz", 36, 2004));
        listOfBooks.add(new Book("Stanisław Lem", "Kosmos", 26, 2011));

        Library lib = new Library(listOfBooks);

        List<Book> listOfBooks2 = new ArrayList<>();
        listOfBooks2 = lib.returnOneAuthorBooks("Henryk Sienkiewicz");
        System.out.println(lib.returnOneAuthorBooks("Henryk Sienkiewicz"));
    }
}
