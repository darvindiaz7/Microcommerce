package Usuarios.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Usuarios.Model.RolesModel;

@Repository
public interface IRolesRepository extends CrudRepository <RolesModel, Integer> {
    
}
