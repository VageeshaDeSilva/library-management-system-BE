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

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.FOUND)
    public Iterable<BookEntity> getBooks(){
         return bookService.getAllBooks();
    }

    @DeleteMapping("deleteBook/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public String removeBook(@PathVariable Long id){
        return bookService.removeBook(id)?"Deleted":"Not Deleted";
    }

    @GetMapping("searchBook/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Book searchBookById(@PathVariable Long id){
        return bookService.searchBookById(id);
    }
}