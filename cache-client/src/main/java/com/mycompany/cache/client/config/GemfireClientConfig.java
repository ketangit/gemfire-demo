package com.mycompany.cache.client.config;

import com.mycompany.cache.client.model.Customer;
import com.mycompany.cache.client.repository.CustomerRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.geode.config.annotation.EnableClusterAware;

@Configuration
@EnableClusterAware
@EnableEntityDefinedRegions(basePackageClasses = Customer.class)
@EnableGemfireRepositories(basePackageClasses = CustomerRepository.class)
public class GemfireClientConfig {
}