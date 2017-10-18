package com.bora.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bora.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
