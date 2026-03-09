package Usuarios.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Usuarios.Model.UsuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioModel,Integer>{
    
}
