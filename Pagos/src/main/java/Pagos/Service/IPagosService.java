package Pagos.Service;

import java.util.List;

import Pagos.Model.PagosModel;

public interface IPagosService {
    public List<PagosModel> findAll();
    public PagosModel fyndById(int id);
    public PagosModel add(PagosModel model);
    public PagosModel update(PagosModel model);
    public boolean delete(int id);
}
