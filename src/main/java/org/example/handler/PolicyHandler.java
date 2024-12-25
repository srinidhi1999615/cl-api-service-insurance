package org.example.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class PolicyHandler {

    public Mono<ServerResponse> getAllPolicies(ServerRequest request) {
        return ok().body(Mono.just("All Policies"), String.class);
    }

    public Mono<ServerResponse> getPolicyById(ServerRequest request) {
        return ok().body(Mono.just("Get Policy By ID"), String.class);
    }

    public Mono<ServerResponse> createPolicy(ServerRequest request) {
        return ok().body(Mono.just("Policy Created Successfully"), String.class);
    }

    public Mono<ServerResponse> updatePolicy(ServerRequest request) {
        return ok().body(Mono.just("Policy Updated Successfully"), String.class);
    }

    public Mono<ServerResponse> deletePolicy(ServerRequest request) {
        return ok().body(Mono.just("Policy Deleted Successfully"), String.class);
    }
}
