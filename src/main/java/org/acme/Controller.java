package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
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
    @Transactional
    public Product hello() {
        Product entity = new Product("name", 1L);
        repository.persist(entity);
        return entity;
    }
}

