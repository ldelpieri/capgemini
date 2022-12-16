package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import tiendaShopping.model.entities.tienda.Tienda;

@RepositoryRestResource(path = "tienda")
public interface TiendaRepository extends JpaRepository<Tienda, Integer> {
}
