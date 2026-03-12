package Ventas.Service;

import java.util.List;

import Ventas.Model.DetalleVentaModel;

public interface IDetalleVentaService {
    public List<DetalleVentaModel> findAll();
    public DetalleVentaModel fyndById(int id);
    public DetalleVentaModel add(DetalleVentaModel model);
    public DetalleVentaModel update(DetalleVentaModel model);
    public boolean delete(int id);
}
