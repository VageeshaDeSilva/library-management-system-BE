package edu.vageesha.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.vageesha.dto.Book;
import edu.vageesha.entity.BookEntity;
import edu.vageesha.repository.BookRepository;
import edu.vageesha.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    final BookRepository bookRepository;

    final ObjectMapper mapper;

    @Override
    public void addBook(Book book) {
        BookEntity map = mapper.convertValue(book, BookEntity.class);
        bookRepository.save(map);
    }

    @Override
    public void removeBook(String bookId) {

    }

    @Override
    public List<BookEntity> getAllBooks() {
        return (List<BookEntity>)bookRepository.findAll();
    }
}
