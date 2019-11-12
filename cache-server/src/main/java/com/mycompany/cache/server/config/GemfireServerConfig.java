package com.mycompany.cache.server.config;

import org.apache.geode.pdx.PdxSerializer;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;
import org.springframework.data.gemfire.config.annotation.EnablePdx;

@Configuration
@EnableLocator
@EnableManager(start = true)
@EnablePdx(serializerBeanName = "reflectionBasedAutoSerializer", readSerialized = true)
@CacheServerApplication(name = "sample-cache-server")
public class GemfireServerConfig {
    @Bean
    public PdxSerializer reflectionBasedAutoSerializer() {
        PdxSerializer pdxSerializer = new ReflectionBasedAutoSerializer();
        return pdxSerializer;
    }

}