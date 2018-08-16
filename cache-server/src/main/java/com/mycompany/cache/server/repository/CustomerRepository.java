package com.mycompany.cache.server.repository;

import com.mycompany.cache.server.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByFirstname(@Param("firstname") String firstname);

    Customer findByLastname(@Param("lastname") String lastname);

    Iterable<Customer> findByAgeGreaterThan(@Param("age") int age);

    Iterable<Customer> findByAgeLessThan(@Param("age") int age);
}