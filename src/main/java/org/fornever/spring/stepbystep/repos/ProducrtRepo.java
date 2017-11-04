package org.fornever.spring.stepbystep.repos;

import org.fornever.spring.stepbystep.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProducrtRepo extends CrudRepository<Product, Long> {

}
