package edu.vageesha.service;

import edu.vageesha.dto.Book;
import edu.vageesha.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void removeBook(String bookId);
    List<BookEntity> getAllBooks();
}
