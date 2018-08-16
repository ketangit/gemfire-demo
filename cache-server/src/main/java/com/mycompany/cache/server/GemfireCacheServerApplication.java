package com.mycompany.cache.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@SpringBootApplication
@CacheServerApplication
public class GemfireCacheServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireCacheServerApplication.class, args);
    }
}