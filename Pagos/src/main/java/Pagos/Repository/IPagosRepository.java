package Pagos.Repository;

import org.springframework.data.repository.CrudRepository;

import Pagos.Model.PagosModel;

public interface IPagosRepository extends CrudRepository <PagosModel,Integer>{
    
}
