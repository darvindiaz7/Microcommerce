package Usuarios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name= "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    public Integer id;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "correo")
    public String correo;

    @Column(name = "password")
    public String password;

    @Column(name = "telefono")
    public String telefono;

    @Column(name = "direccion")
    public String direccion;

    @Column(name = "fecha_creacion")
    public String fecha_creacion;

    @Column(name = "id_rol")
    public String id_rol;

}       
