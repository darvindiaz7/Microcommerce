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
@Table( name= "detalle_venta")
public class DetalleVentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "precio_unitario")
    private String precio_unitario;

    @Column(name = "subtotal")
    private String subtotal;

    @Column(name = "id_producto")
    private Integer id_producto;

    @Column(name = "id_venta")
    private Integer id_venta;
    
}
