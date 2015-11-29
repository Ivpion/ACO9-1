package ua.artcode.home.library.model;

import java.util.*;

/**
 * Created by serhii on 25.11.15.
 */
public class Library {

    private List<Book> availableBooks;
    private Map<Book,Reader> takenBooksMap;

    private Set<Reader> readers;
    private Set<Reader> readersBlackList;


    public Library() {
        availableBooks = new ArrayList<>();
        takenBooksMap = new HashMap<>();

        readers = new HashSet<>();
        readersBlackList = new HashSet<>();
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(List<Book> availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public Set<Reader> getReadersBlackList() {
        return readersBlackList;
    }

    public Map<Book, Reader> getTakenBooksMap() {
        return takenBooksMap;
    }

    public void setTakenBooksMap(Map<Book, Reader> takenBooksMap) {
        this.takenBooksMap = takenBooksMap;
    }
}
