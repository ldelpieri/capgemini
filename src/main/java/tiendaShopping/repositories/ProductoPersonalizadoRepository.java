package tiendaShopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import tiendaShopping.model.entities.tienda.Tienda;

import java.util.List;

@Repository
public interface ProductoPersonalizadoRepository extends JpaRepository<ProductoPersonalizado, Integer> {

    public List<ProductoPersonalizado> findByTienda(Tienda tienda);
}
