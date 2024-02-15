package edu.vageesha.repository;

import edu.vageesha.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity,Long> {
}
