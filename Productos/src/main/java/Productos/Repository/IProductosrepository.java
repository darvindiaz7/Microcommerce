package Productos.Repository;

import org.springframework.data.repository.CrudRepository;

import Productos.Model.ProductosModel;

public interface IProductosrepository extends CrudRepository <ProductosModel,Integer>{
    
}
