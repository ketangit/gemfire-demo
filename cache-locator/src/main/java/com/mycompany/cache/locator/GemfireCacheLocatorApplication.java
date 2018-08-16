package com.mycompany.cache.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@SpringBootApplication
@CacheServerApplication
public class GemfireCacheLocatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireCacheLocatorApplication.class, args);
    }
}