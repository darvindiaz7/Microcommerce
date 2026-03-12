package Ventas.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name= "ventas")
public class VentasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha_venta")
    private String fecha_venta;

    @Column(name = "total")
    private String total;

    @Column(name = "estado")
    private String estado;

    @Column(name = "id_usuario")
    private Integer id_usuario;

}
