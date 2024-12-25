package org.example.router;

import org.example.handler.PolicyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class PolicyRouter {
    @Bean
    public RouterFunction<ServerResponse> policyRoutes(PolicyHandler handler) {
        return route()
                .GET("/policies", handler::getAllPolicies)
                .GET("/policies/{id}", handler::getPolicyById)
                .POST("/policies", handler::createPolicy)
                .PUT("/policies/{id}", handler::updatePolicy)
                .DELETE("/policies/{id}", handler::deletePolicy)
                .build();
    }
}
