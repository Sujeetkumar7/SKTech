package com.sktech.SKTechCRUDApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.sktech.SKTechCRUDApi.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}