package ua.artcode.home.library.model;

import ua.artcode.home.library.exception.FullBookBagExcetion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 25.11.15.
 */
public class Reader {


    private static final int MAX_BOOKS_LIMIT = 3;

    private int id;
    private String name;
    private List<Book> bookList = new ArrayList<>(MAX_BOOKS_LIMIT);

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBook() throws FullBookBagExcetion {
        if (bookList.size() > MAX_BOOKS_LIMIT) {
            throw new FullBookBagExcetion("user has already " + MAX_BOOKS_LIMIT + " books");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        return id == reader.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
