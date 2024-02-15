package edu.vageesha.service;

import edu.vageesha.dto.Book;
import edu.vageesha.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<BookEntity> getAllBooks();
    boolean removeBook(Long id);

}
