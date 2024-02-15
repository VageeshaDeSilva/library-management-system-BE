package edu.vageesha.controller;

import edu.vageesha.dto.Book;
import edu.vageesha.entity.BookEntity;
import edu.vageesha.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    final BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public Iterable<BookEntity> getBooks(){
         return bookService.getAllBooks();
    }
}
