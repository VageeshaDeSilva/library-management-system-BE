package edu.vageesha.service;

import edu.vageesha.dto.Book;

public interface BookService {
    void addBook(Book book);
    void removeBook(String bookId);

}
