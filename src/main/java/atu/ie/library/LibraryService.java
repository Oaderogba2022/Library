package atu.ie.library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public LibraryService() {}

    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}
