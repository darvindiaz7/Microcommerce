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

import Productos.Model.CategoriasModel;
import Productos.Service.CategoriasService;

@RestController
@RequestMapping("categorias")
public class CategoriasController {
    @Autowired
    CategoriasService service;

    @GetMapping("/all")
    public List<CategoriasModel> listar(){
        return (List<CategoriasModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public CategoriasModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public CategoriasModel create(@RequestBody CategoriasModel model){
        System.out.println("Objeto recibido: " + model);
        return service.add(model);
    }

    @PutMapping("/update")
    public CategoriasModel update(@RequestBody CategoriasModel model){
        return service.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "CategoriasModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el CategoriasModel.";
        }
    }
}
