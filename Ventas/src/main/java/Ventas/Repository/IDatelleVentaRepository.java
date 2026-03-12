package Ventas.Repository;

import org.springframework.data.repository.CrudRepository;

import Ventas.Model.DetalleVentaModel;

public interface IDatelleVentaRepository extends CrudRepository<DetalleVentaModel,Integer>{
    
}
