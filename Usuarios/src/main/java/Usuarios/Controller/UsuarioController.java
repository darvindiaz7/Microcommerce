package Usuarios.Controller;

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

import Usuarios.Model.UsuarioModel;
import Usuarios.Services.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @GetMapping("/all")
    public List<UsuarioModel> listar(){
        return (List<UsuarioModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public UsuarioModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public UsuarioModel create(@RequestBody UsuarioModel model){
        return service.add(model);
    }

    @PutMapping("/update")
    public UsuarioModel update(@RequestBody UsuarioModel model){
        return service.add(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "UsuarioModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el UsuarioModel.";
        }
    }
    
}
