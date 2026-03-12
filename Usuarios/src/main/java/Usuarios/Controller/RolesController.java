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

import Usuarios.Model.RolesModel;
import Usuarios.Routes.RolesRoutes;
import Usuarios.Services.RolesService;

@RestController
@RequestMapping(RolesRoutes.BASE)
public class RolesController {
    @Autowired
    RolesService service;

    @GetMapping(RolesRoutes.ALL)
    public List<RolesModel> listar(){
        return (List<RolesModel>) service.findAll();
    }

    @GetMapping(RolesRoutes.GET_BY_ID)
    public RolesModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping(RolesRoutes.ADD)
    public RolesModel create(@RequestBody RolesModel model){
        return service.add(model);
    }

    @PutMapping(RolesRoutes.UPDATE)
    public RolesModel update(@RequestBody RolesModel model){
        return service.add(model);
    }

    @DeleteMapping(RolesRoutes.DELETE)
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "RolesModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el RolesModel.";
        }
    }



}
