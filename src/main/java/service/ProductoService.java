package service;

import config.DatabaseConnection;
import entity.Producto;
import repository.ProductoRepository;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoService {


    private final ProductoRepository repository = new ProductoRepository();

    public void crear (Producto producto){
        repository.save(producto);
    }
    public List<Producto> listar() {
        return repository.findAll();
    }
    public void eliminar(Long id) {
        repository.delete(id);
    }



}
