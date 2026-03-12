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

import Ventas.Model.VentasModel;
import Ventas.Service.VentasService;

@RestController
@RequestMapping("ventas")
public class VentasController {
    @Autowired
    VentasService service;
    @GetMapping("/all")
    public List<VentasModel> listar(){
        return (List<VentasModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public VentasModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public VentasModel create(@RequestBody VentasModel model){
        return service.add(model);
    }

    @PutMapping("/update")
    public VentasModel update(@RequestBody VentasModel model){
        return service.add(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "VentasModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el VentasModel.";
        }
    }
}
