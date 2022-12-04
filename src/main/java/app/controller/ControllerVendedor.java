package app.controller;

import app.model.entities.tienda.Vendedor;
import app.repository.Vendedor.RepoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class ControllerVendedor {
    @Autowired
    RepoVendedor repo;

    @RequestMapping(path = {"", "/"})
    List<Vendedor> vendedores() { return repo.all(); }
}
