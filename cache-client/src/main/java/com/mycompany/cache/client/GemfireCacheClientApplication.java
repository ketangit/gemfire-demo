package com.mycompany.cache.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;

@SpringBootApplication
@ClientCacheApplication
public class GemfireCacheClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireCacheClientApplication.class, args);
    }
}