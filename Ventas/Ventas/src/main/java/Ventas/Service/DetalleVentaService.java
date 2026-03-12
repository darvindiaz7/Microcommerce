package Ventas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ventas.Model.DetalleVentaModel;
import Ventas.Repository.IDatelleVentaRepository;

@Service
public class DetalleVentaService implements IDetalleVentaService{

    @Autowired
    IDatelleVentaRepository repository;

    @Override
    public List<DetalleVentaModel> findAll() {
        return (List<DetalleVentaModel>) repository.findAll();
    }

    @Override
    public DetalleVentaModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public DetalleVentaModel add(DetalleVentaModel model) {
        return repository.save(model);
    }

    @Override
    public DetalleVentaModel update(DetalleVentaModel model) {
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
