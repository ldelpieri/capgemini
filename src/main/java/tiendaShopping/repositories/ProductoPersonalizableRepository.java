package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;

@Repository
public interface ProductoPersonalizableRepository extends JpaRepository<ProductoPersonalizable, Integer> {
}
