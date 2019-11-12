package com.mycompany.cache.client.config;

import com.mycompany.cache.client.model.Customer;
import com.mycompany.cache.client.repository.CustomerRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableClusterConfiguration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableStatistics;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@Configuration
@EnableClusterConfiguration
@EnableStatistics
@EnableEntityDefinedRegions(basePackageClasses = Customer.class)
@EnableGemfireRepositories(basePackageClasses = CustomerRepository.class)
public class GemfireClientConfig {
}