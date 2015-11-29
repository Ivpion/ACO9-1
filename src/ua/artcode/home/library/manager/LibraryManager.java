package ua.artcode.home.library.manager;

import ua.artcode.home.library.model.Book;
import ua.artcode.home.library.model.Reader;

import java.util.Date;
import java.util.List;


public interface LibraryManager {


    List<Reader> getReaders();

    List<Book> getAvailableBooks();

    boolean addBook(Book book);

    boolean addReader(Reader reader);

    Book giveBookToReader(Reader reader, int bookId);

    List<Book> getReaderBooks(int readerId);

    List<Book> getTakenBooks();

    void addReaderToBackList(int readerId);

    List<Book> getAuthorBooks(String authorName);

    List<Book> getBooksByDate(Date start, Date end);


}
