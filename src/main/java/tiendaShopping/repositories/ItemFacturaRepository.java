package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiendaShopping.model.entities.tienda.compra.ItemFactura;

@Repository
public interface ItemFacturaRepository extends JpaRepository<ItemFactura, Integer> {

}
