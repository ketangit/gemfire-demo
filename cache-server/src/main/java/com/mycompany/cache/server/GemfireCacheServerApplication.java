package com.mycompany.cache.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GemfireCacheServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GemfireCacheServerApplication.class)
                .web(WebApplicationType.NONE)
                .build()
                .run(args);
    }
}