package Usuarios.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Usuarios.Model.UsuarioModel;
import Usuarios.Repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository repository;

    @Override
    public List<UsuarioModel> findAll() {
        return (List<UsuarioModel>) repository.findAll();
    }

    @Override
    public UsuarioModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public UsuarioModel add(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public UsuarioModel update(UsuarioModel model) {
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
