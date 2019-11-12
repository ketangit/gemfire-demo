package com.mycompany.cache.client.api;

import com.mycompany.cache.client.model.Customer;
import com.mycompany.cache.client.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping("/")
    public String home() {
        return "<h2>Sample Gemfire/Geode Client</h2>";
    }

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/load")
    public String loadClients() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setAge(98);
        customerRepository.save(customer);
        return "loaded customers";
    }
}
