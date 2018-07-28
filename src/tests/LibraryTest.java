package tests;

import book.Book;
import book.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;

import static org.junit.Assert.*;

public class LibraryTest {

    Library lib;
    List<Book> listOfBooks;

    @Before
    public void setUp() {
        listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Henryk Sienkiewicz", "W pustyni i w puszczy", 27, 2015));
        listOfBooks.add(new Book("Henryk Sienkiewicz", "Quovadis", 35, 2013));
        listOfBooks.add(new Book("Eliza Orzeszkowa", "Nad Niemnem", 25, 2010));
        listOfBooks.add(new Book("Andrzej Sapkowski", "Wiedźmin: krew elfów", 31, 1999));
        listOfBooks.add(new Book("Andrzej Sapkowski", "Wiedźmik: miecz przeznaczenia", 22, 2000));
        listOfBooks.add(new Book("Andrzej Pilipiuk", "Jakub Wędrowycz", 36, 2004));
        listOfBooks.add(new Book("Stanisław Lem", "Kosmos", 26, 2011));
    //    listOfBooks.add(new Book("Adam Kuropatwa", "Przewodnik ilustrowany po Mazurach", 19, 2018));
    //    listOfBooks.add(new Book("Żaklina Przełęcka", "Jak ugotowac dobry obiad", 24, 1990));
        lib = new Library(listOfBooks);
    }

    @Test
    public void returnListOfAuthors() {
        String[] result = {"Henryk Sienkiewicz", "Henryk Sienkiewicz", "Eliza Orzeszkowa", "Andrzej Sapkowski", "Andrzej Sapkowski", "Andrzej Pilipiuk", "Stanisław Lem"};
        Assert.assertArrayEquals(result, lib.returnListOfAuthors().toArray());
    }

    @Test
    public void returnListOfTitles() {
        String[] result = {"W pustyni i w puszczy", "Quovadis", "Nad Niemnem", "Wiedźmin: krew elfów", "Wiedźmik: miecz przeznaczenia", "Jakub Wędrowycz", "Kosmos"};
        Assert.assertArrayEquals(result, lib.returnListOfTitles().toArray());
    }
    @Test
    public void returnListOfPrices() {
        Double[] result = {27.0, 35.0, 25.0, 31.0, 22.0, 36.0, 26.0};
        Assert.assertArrayEquals(result, lib.returnListOfPrices().toArray());
    }

}