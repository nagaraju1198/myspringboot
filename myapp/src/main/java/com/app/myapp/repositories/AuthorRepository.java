package com.app.myapp.repositories;
import org.springframework.data.repository.CrudRepository;

import com.app.myapp.domain.Author;
public interface AuthorRepository extends CrudRepository<Author,Long>{

}
