package Usuarios.Services;

import java.util.List;

import Usuarios.Model.RolesModel;

public interface IRolesService {
    public List<RolesModel> findAll();
    public RolesModel fyndById(int id);
    public RolesModel add(RolesModel model);
    public RolesModel update(RolesModel model);
    public boolean delete(int id);
}
