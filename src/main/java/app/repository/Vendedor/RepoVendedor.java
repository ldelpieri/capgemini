package app.repository.Vendedor;

import app.model.entities.tienda.Vendedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoVendedor implements IRepoVendedor {

    private List<Vendedor> vendedores;

    public RepoVendedor() {
        vendedores = new ArrayList<Vendedor>();
    }

    public List<Vendedor> all() {
        return vendedores;
    }
}
