package Ventas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ventas.Model.DetalleVentaModel;
import Ventas.Service.DetalleVentaService;

@RestController
@RequestMapping("detalle_venta")
public class DetalleVentaController {
    @Autowired
    DetalleVentaService service;

    @GetMapping("/all")
    public List<DetalleVentaModel> listar(){
        return (List<DetalleVentaModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public DetalleVentaModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public DetalleVentaModel create(@RequestBody DetalleVentaModel model){
        return service.add(model);
    }

    @PutMapping("/update")
    public DetalleVentaModel update(@RequestBody DetalleVentaModel model){
        return service.add(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "DetalleVentaModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el DetalleVentaModel.";
        }
    }

}
