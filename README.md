# Spring Cloud Pivotal Cloud Foundry

Pivotal cloud foundry has made some of the spring cloud components available as managed services, 

which means we don’t have a create a eureka server, and no need to copy the hystrix stream URI and feed it to the hystrix dashboard to monitor the application
and we don’t have to create a cloud config server app

these services are readily made available for you to use directly with very little configuration

    Service Registry (p-service-registry)
    
    Config Server (p-config-server)
    
    Circuit Breaker (p-circuit-breaker)
