package Productos.Service;

import java.util.List;

import Productos.Model.CategoriasModel;

public interface ICategoriasService {
    public List<CategoriasModel> findAll();
    public CategoriasModel fyndById(int id);
    public CategoriasModel add(CategoriasModel model);
    public CategoriasModel update(CategoriasModel model);
    public boolean delete(int id);
}
