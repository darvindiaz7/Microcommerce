package Productos.Controller;

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

import Productos.Model.ProductosModel;
import Productos.Service.ProductosService;

@RestController
@RequestMapping("productos")
public class ProductosController {
    @Autowired
    ProductosService service;

    @GetMapping("/all")
    public List<ProductosModel> listar(){
        return (List<ProductosModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public ProductosModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public ProductosModel create(@RequestBody ProductosModel model){
        return service.add(model);
    }

    @PutMapping("/update")
    public ProductosModel update(@RequestBody ProductosModel model){
        return service.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "ProductosModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el ProductosModel.";
        }
    }
}
