# Gemfire Cache demo projects

### Contains two demo projects showing Gemfire API
```
1. cache-server (embedded server, running in IDE)

2. cache-client (client app, requires cache-server) 
```

### Steps to run this project locally
```
1. cache-server -> Run first -> com.mycompany.cache.server.GemfireCacheServerApplication 

2. cache-client -> Run second -> com.mycompany.cache.server.GemfireCacheServerApplication 

3. http://localhost:8080/load -> Load customer data into cache

4. http://localhost:8080/customers -> returns all customers
```

### Credit / Prior Art

https://docs.spring.io/spring-boot-data-geode-build/1.2.x/reference/html5/
