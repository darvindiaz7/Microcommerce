package Productos.Repository;

import org.springframework.data.repository.CrudRepository;

import Productos.Model.CategoriasModel;

public interface ICategoriasRepository extends CrudRepository <CategoriasModel, Integer>{
    
}
