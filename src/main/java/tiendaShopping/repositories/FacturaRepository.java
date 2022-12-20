package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiendaShopping.model.entities.tienda.compra.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

}
