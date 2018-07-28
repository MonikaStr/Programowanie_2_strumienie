package betterElement;

import book.Book;

public class RunnerElementsUtil {

    public static void main(String[] args) {

        String string1 = "wtorek";
        String string2 = "niedziela";

        Book book1 = new Book("A", "B", 12, 2018);
        Book book2 = new Book("J", "F", 15, 2014);


                        //lambda działa jakbyśmy wrzucili zamiast niej obiekt klasy implementujący interface
        String result = ElementUtils.betterEntry(string1, string2, (s1, s2) -> s1.length() > s2.length());
        Book result2 = ElementUtils.betterEntry(book1, book2, (c1, c2) -> c1.getPrice() > c2.getPrice());

        System.out.println(result);
        System.out.println(result2);
    }
}
