package market.store.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCTID")
    private Integer idProducto;
    @Column(name = "NAME")
    private String nombre;

    @OneToMany(mappedBy = "producto", cascade = {CascadeType.ALL})
    private List<PreciosProducto> grupos;

    public Integer getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
