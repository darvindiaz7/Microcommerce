package Productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Productos.Model.ProductosModel;
import Productos.Repository.IProductosrepository;

@Service
public class ProductosService implements IProductosService{
    @Autowired
    IProductosrepository repository;

    @Override
    public List<ProductosModel> findAll() {
        return (List<ProductosModel>) repository.findAll();
    }

    @Override
    public ProductosModel fyndById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public ProductosModel add(ProductosModel model) {
        return repository.save(model);
    }

    @Override
    public ProductosModel update(ProductosModel model) {
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
