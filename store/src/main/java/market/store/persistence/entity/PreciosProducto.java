package market.store.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class PreciosProducto {


    @EmbeddedId
    private PreciosProductoPK idPP;

    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private Integer price_list;
    private Integer priority;
    private BigDecimal price;

    @Column( name = "curr" )
    private String curr;

    @ManyToOne
    @JoinColumn(name = "BRANDID", insertable = false, updatable = false)
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "PRODUCTID", insertable = false, updatable = false)
    private Producto producto;

    public PreciosProductoPK getIdPP() {
        return idPP;
    }

    public void setIdPP(PreciosProductoPK idPP) {
        this.idPP = idPP;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public Integer getPrice_list() {
        return price_list;
    }

    public void setPrice_list(Integer price_list) {
        this.price_list = price_list;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }



}
