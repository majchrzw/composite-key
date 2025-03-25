package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@IdClass(ProductId.class)
public class Product {
    @Id
    private Long version;

    @Id
    @GeneratedValue
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq")
    private Long id;

    private String name;

    public Product(String name, Long version) {
        this.name = name;
        this.version = version;
    }

    public Product() {
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(version, product.version) && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, id, name);
    }
}
