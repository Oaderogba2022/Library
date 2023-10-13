package atu.ie.library;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class LibraryController {

    private final LibraryService libraryService;


    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        libraryService.addBook(book);
    }

}
