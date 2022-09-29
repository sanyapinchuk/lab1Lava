package main.java.by.sanya.task16;

import main.java.by.sanya.task15.Book;

import java.util.*;

public class Tester16 {
    public static void Test() {


        Collection<Book> books = Set.of(
                new Book("CLR via C#", "Jeffry Richter", 140, 23),
                new Book("Война и Мир", "Лев Толстой", 119, 1),
                new Book("Дикая охота короля Стаха", "Владимир Короткевич", 60, 5),
                new Book("Му-му", "Тургенев", 40, 12)
        );
        List<Book> bookList = new ArrayList<>(books);

        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor);

        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle);

        Comparator<Book> authorTitlePriceComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice);

        bookList.sort(titleComparator);
        System.out.println(bookList);

        bookList.sort(titleAuthorComparator);
        System.out.println(bookList);

        bookList.sort(authorTitleComparator);
        System.out.println(bookList);

        bookList.sort(authorTitlePriceComparator);
        System.out.println(bookList);
    }
}
