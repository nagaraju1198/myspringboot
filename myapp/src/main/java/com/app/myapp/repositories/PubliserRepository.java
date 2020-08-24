package com.app.myapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.myapp.domain.Publisher;

public interface PubliserRepository extends CrudRepository<Publisher, Long> {

}
