package Ventas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ventas.Model.VentasModel;
import Ventas.Repository.IVentasRepository;

@Service
public class VentasService implements IVentasService {
    @Autowired
    IVentasRepository repository;

    @Override
    public List<VentasModel> findAll() {
        return (List<VentasModel>) repository.findAll();
    }

    @Override
    public VentasModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public VentasModel add(VentasModel model) {
        return repository.save(model);
    }

    @Override
    public VentasModel update(VentasModel model) {
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
