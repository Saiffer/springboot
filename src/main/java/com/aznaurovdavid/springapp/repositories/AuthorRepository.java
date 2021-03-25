package com.aznaurovdavid.springapp.repositories;

import com.aznaurovdavid.springapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
