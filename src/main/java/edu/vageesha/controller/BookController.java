package edu.vageesha.controller;

import edu.vageesha.dto.Book;
import edu.vageesha.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

}
