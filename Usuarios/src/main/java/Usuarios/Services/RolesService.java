package Usuarios.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Usuarios.Model.RolesModel;
import Usuarios.Repository.IRolesRepository;

@Service
public class RolesService implements IRolesService{

    @Autowired
    IRolesRepository repository;
    
    @Override
    public List<RolesModel> findAll() {
        return (List<RolesModel>) repository.findAll();
    }

    @Override
    public RolesModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public RolesModel add(RolesModel model) {
        return repository.save(model);
    }

    @Override
    public RolesModel update(RolesModel model) {
         if(repository.findById(model.id)!=null){
            return repository.save(model);
        }else{
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        if(repository.findById(id)!=null){
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
    
}
