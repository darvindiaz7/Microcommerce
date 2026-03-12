package Ventas.Repository;

import org.springframework.data.repository.CrudRepository;

import Ventas.Model.VentasModel;

public interface IVentasRepository extends CrudRepository<VentasModel,Integer>{
    
}
