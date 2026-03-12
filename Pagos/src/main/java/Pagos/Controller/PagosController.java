package Pagos.Controller;

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

import Pagos.Model.PagosModel;
import Pagos.Service.PagosService;

@RestController
@RequestMapping("pagos")
public class PagosController {
    @Autowired
    PagosService service;

    @GetMapping("/all")
    public List<PagosModel> listar(){
        return (List<PagosModel>) service.findAll();
    }

    @GetMapping("/get/{id}")
    public PagosModel getById(@PathVariable Integer id){
        return service.fyndById(id);
    }

    @PostMapping("/add")
    public PagosModel create(@RequestBody PagosModel model){
        return service.add(model);
    }

    @PutMapping("/update")
    public PagosModel update(@RequestBody PagosModel model){
        return service.add(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean deleted = service.delete(id);
        if (deleted) {
            return "PagosModel eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el PagosModel.";
        }
    }


}
