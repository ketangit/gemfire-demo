package com.mycompany.cache.server.config;

import com.mycompany.cache.server.model.Customer;
import com.mycompany.cache.server.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import java.util.Properties;

@Configuration
@EnableEntityDefinedRegions(basePackageClasses = Customer.class)
@EnableGemfireRepositories(basePackageClasses = CustomerRepository.class)
public class GemfireServerConfig {
    @Bean
    public Properties gemfireProperties() {
        Properties gemfireProperties = new Properties();
        gemfireProperties.setProperty("name", "EmbeddedGemfireApplication");
        gemfireProperties.setProperty("mcast-port", "0");
        return gemfireProperties;
    }

    @Bean
    public CacheFactoryBean gemfireCache() {
        CacheFactoryBean gemfireCache = new CacheFactoryBean();
        gemfireCache.setProperties(gemfireProperties());
        return gemfireCache;
    }

    /*
    @Bean
    public LocalRegionFactoryBean<String, Customer> customerRegion(final GemFireCache cache) {
        LocalRegionFactoryBean<String, Customer> customerRegion = new LocalRegionFactoryBean<>();
        customerRegion.setCache(cache);
        customerRegion.setName("customer");
        customerRegion.setPersistent(false);
        return customerRegion;
    }
    */
}