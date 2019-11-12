package com.mycompany.cache.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;
import org.springframework.data.gemfire.config.annotation.EnablePdx;

@Configuration
@EnableLocator
@EnableManager
@EnablePdx(readSerialized = true)
@CacheServerApplication(port = 0, logLevel = "error", name = "sample-cache-server")
public class GemfireServerConfig {
}