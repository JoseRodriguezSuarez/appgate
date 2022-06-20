package market.store.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BRAND")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRANDID")
    private Integer idGrupo;
    @Column(name = "NAME")
    private String nombre;


    @OneToMany(mappedBy = "grupo", cascade = {CascadeType.ALL} )
    private List<PreciosProducto> precios;

    public List<PreciosProducto> getPrecios() {
        return precios;
    }

    public void setPrecios(List<PreciosProducto> precios) {
        this.precios = precios;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
