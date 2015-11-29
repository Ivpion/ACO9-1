package ua.artcode.home.library.manager;

import ua.artcode.home.library.model.Book;
import ua.artcode.home.library.model.Library;
import ua.artcode.home.library.model.Reader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by serhii on 25.11.15.
 */
public class LibraryManagerImpl implements LibraryManager {

    private Library library;

    public LibraryManagerImpl(Library library) {
        this.library = library;
    }

    @Override
    public List<Reader> getReaders() {
        return new ArrayList<>(library.getReaders());
    }

    @Override
    public List<Book> getAvailableBooks() {
        return library.getAvailableBooks();
    }

    @Override
    public boolean addBook(Book book) {

        if(book == null){
            return false;
        }

        return library.getAvailableBooks().add(book);
    }

    @Override
    public boolean addReader(Reader reader) {

        if(reader == null){
            return false;
        }

        return library.getReaders().add(reader);
    }

    @Override
    public Book giveBookToReader(Reader reader, int bookId) {

        if(reader == null){
            return null;
        }

        Book forSearch = new Book(bookId, null, null, 0);

        // it will work if book has equals methods
        List<Book> availableBooks = library.getAvailableBooks();
        int index = availableBooks.indexOf(forSearch);

        if(!library.getReaders().contains(reader) ||
                library.getReadersBlackList().contains(reader) ||
                index == -1){
            return null;// throw exception for each condition
        }


        Book book =  availableBooks.get(index);

        library.getTakenBooksMap().put(book, reader);

        return availableBooks.remove(index);
    }

    @Override
    public List<Book> getReaderBooks(int readerId) {
        return null;
    }

    @Override
    public List<Book> getTakenBooks() {
        return null;
    }

    @Override
    public void addReaderToBackList(int readerId) {

    }

    @Override
    public List<Book> getAuthorBooks(String authorName) {
        return null;
    }

    @Override
    public List<Book> getBooksByDate(Date start, Date end) {
        return null;
    }
}
