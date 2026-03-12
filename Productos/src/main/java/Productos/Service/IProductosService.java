package Productos.Service;

import java.util.List;

import Productos.Model.ProductosModel;

public interface IProductosService {
    public List<ProductosModel> findAll();
    public ProductosModel fyndById(int id);
    public ProductosModel add(ProductosModel model);
    public ProductosModel update(ProductosModel model);
    public boolean delete(int id);
}
