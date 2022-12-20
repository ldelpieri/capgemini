package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tiendaShopping.model.entities.tienda.Vendedor;

@RepositoryRestResource(path = "vendedor")
public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
