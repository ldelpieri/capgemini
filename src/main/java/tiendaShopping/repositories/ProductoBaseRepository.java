package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tiendaShopping.model.entities.producto.ProductoBase;

import java.util.List;

@RepositoryRestResource(path = "productoBase")
public interface ProductoBaseRepository extends JpaRepository<ProductoBase, Integer> {

}
