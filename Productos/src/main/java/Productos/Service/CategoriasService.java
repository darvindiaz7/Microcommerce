package Productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Productos.Model.CategoriasModel;
import Productos.Repository.ICategoriasRepository;

@Service
public class CategoriasService implements ICategoriasService{

    @Autowired
    ICategoriasRepository repository;

    @Override
    public List<CategoriasModel> findAll() {
        return (List<CategoriasModel>) repository.findAll();
    }

    @Override
    public CategoriasModel fyndById(int id) {
        return repository.findById(id).get();
    }
    @Override
    public CategoriasModel add(CategoriasModel model) {
        return repository.save(model);
    }

    @Override
    public CategoriasModel update(CategoriasModel model) {
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
