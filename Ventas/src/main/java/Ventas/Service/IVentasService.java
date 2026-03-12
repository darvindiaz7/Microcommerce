package Ventas.Service;

import java.util.List;

import Ventas.Model.VentasModel;

public interface IVentasService {
    public List<VentasModel> findAll();
    public VentasModel fyndById(int id);
    public VentasModel add(VentasModel model);
    public VentasModel update(VentasModel model);
    public boolean delete(int id);
}
