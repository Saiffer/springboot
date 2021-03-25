package com.aznaurovdavid.springapp.repositories;

import com.aznaurovdavid.springapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
