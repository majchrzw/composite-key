package org.acme;

import java.io.Serializable;
import java.util.Objects;

public class ProductId implements Serializable {
    private Long version;
    private Long id;

    public ProductId(Long version, Long id) {
        this.version = version;
        this.id = id;
    }

    private ProductId() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductId productId = (ProductId) o;
        return Objects.equals(version, productId.version) && Objects.equals(id, productId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, id);
    }
}
