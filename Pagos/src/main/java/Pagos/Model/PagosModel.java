package Pagos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name= "pagos")
public class PagosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "metodo_pago")
    private String metodo_pago;

    @Column(name = "monto")
    private String monto;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_pago")
    private String fecha_pago;

    @Column(name = "id_venta")
    private String id_venta;
}
