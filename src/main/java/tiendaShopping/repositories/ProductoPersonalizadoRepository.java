package tiendaShopping.repositories;

import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import tiendaShopping.model.entities.tienda.Tienda;

import java.util.List;

@Repository
public interface ProductoPersonalizadoRepository extends JpaRepository<ProductoPersonalizado, Integer> {

    public List<ProductoPersonalizado> findProductoPersonalizadoByTienda(Tienda tienda);
}
