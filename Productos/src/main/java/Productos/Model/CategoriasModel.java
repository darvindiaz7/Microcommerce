package Productos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table( name= "categorias")
public class CategoriasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    public Integer id;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "descripcion")
    public String descripcion;

    
}
