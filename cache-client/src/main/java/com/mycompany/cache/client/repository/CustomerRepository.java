package com.mycompany.cache.client.repository;

import com.mycompany.cache.client.model.Customer;
import org.springframework.data.gemfire.repository.GemfireRepository;

public interface CustomerRepository extends GemfireRepository<Customer, Long> {
}