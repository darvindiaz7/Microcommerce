package Pagos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pagos.Model.PagosModel;
import Pagos.Repository.IPagosRepository;

@Service
public class PagosService implements IPagosService{
    @Autowired
    IPagosRepository repository;

        
    @Override
    public List<PagosModel> findAll() {
        return (List<PagosModel>) repository.findAll();        
    }

    @Override
    public PagosModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PagosModel add(PagosModel model) {
        return repository.save(model);
    }

    @Override
    public PagosModel update(PagosModel model) {
        if(repository.findById(model.getId())!=null){
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
