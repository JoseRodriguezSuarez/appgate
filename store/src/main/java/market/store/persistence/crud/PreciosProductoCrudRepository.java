package market.store.persistence.crud;

import market.store.domain.PricesProduct;
import market.store.persistence.entity.PreciosProducto;
import market.store.persistence.entity.PreciosProductoPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PreciosProductoCrudRepository extends CrudRepository<PreciosProducto, PreciosProductoPK> {

    Optional<List<PreciosProducto>> findByIdPP(PreciosProductoPK idPP);
    Optional<List<PreciosProducto>> findByProducto(int idProducto);
   List<PreciosProducto> findByPriority(int prioridad);
}
