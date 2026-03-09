package Usuarios.Services;

import java.util.List;

import Usuarios.Model.UsuarioModel;

public interface IUsuarioService {
    public List<UsuarioModel> findAll();
    public UsuarioModel fyndById(int id);
    public UsuarioModel add(UsuarioModel model);
    public UsuarioModel update(UsuarioModel model);
    public boolean delete(int id);
}
