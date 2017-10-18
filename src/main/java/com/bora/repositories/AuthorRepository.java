package com.bora.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bora.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
