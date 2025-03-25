package org.acme;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class Controller {
    @Inject
    PanacheRepository<Product> repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @WithTransaction()
    public Uni<Product> hello() {
        Product entity = new Product("name", 1L);
        return repository.persist(entity);
    }
}

